/*
* GenericController.java
*   
* Copyright 2009 - 2016 Frank Fischer (email: frank@te2m.de)
*
* This file is part of the project project which is a sub project of temtools 
* (http://temtools.sf.net).
* 
*/
package tools.te2m.services.project.controller;

import org.neo4j.ogm.session.Session;
import tools.te2m.services.project.entity.AbstractEntity;

/**
 * The Class GenericController.
 *
 * @author frank
 * @version 1.0
 * @param <T> the generic type
 * @since 1.0
 */
public abstract class GenericController<T> implements Controller<T> {

 /**
  * The Constant DEPTH_LIST.
  */
 private static final int DEPTH_LIST = 0;
 
 /**
  * The Constant DEPTH_ENTITY.
  */
 private static final int DEPTH_ENTITY = 1;
 
 /**
  * The session.
  */
 private Session session = Neo4JSessionFactory.getInstance().getNeo4jSession();

 /* (non-Javadoc)
  * @see tools.te2m.services.project.controller.Controller#createOrUpdate(java.lang.Object)
  */
 @Override
 public T createOrUpdate(T entity) {
     session.save(entity, DEPTH_ENTITY);
     return find(((AbstractEntity) entity).getId());
 }

 /* (non-Javadoc)
  * @see tools.te2m.services.project.controller.Controller#delete(java.lang.Long)
  */
 @Override
 public void delete(Long id) {
     session.delete(session.load(getEntityType(), id));
 }

 /* (non-Javadoc)
  * @see tools.te2m.services.project.controller.Controller#find(java.lang.Long)
  */
 @Override
 public T find(Long id) {
     return session.load(getEntityType(), id, DEPTH_ENTITY);
 }

 /* (non-Javadoc)
  * @see tools.te2m.services.project.controller.Controller#findAll()
  */
 @Override
 public Iterable<T> findAll() {
     return session.loadAll(getEntityType(), DEPTH_LIST);
 }

 /**
  * Gets the entity type.
  *
  * @return the entity type
  */
 public abstract Class<T> getEntityType();
}
