/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools.te2m.services.project.controller;

import org.neo4j.ogm.session.Session;
import tools.te2m.services.project.entity.AbstractEntity;

public abstract class GenericController<T> implements Controller<T> {

 private static final int DEPTH_LIST = 0;
 private static final int DEPTH_ENTITY = 1;
 private Session session = Neo4JSessionFactory.getInstance().getNeo4jSession();

 @Override
 public Iterable<T> findAll() {
     return session.loadAll(getEntityType(), DEPTH_LIST);
 }

 @Override
 public T find(Long id) {
     return session.load(getEntityType(), id, DEPTH_ENTITY);
 }

 @Override
 public void delete(Long id) {
     session.delete(session.load(getEntityType(), id));
 }

 @Override
 public T createOrUpdate(T entity) {
     session.save(entity, DEPTH_ENTITY);
     return find(((AbstractEntity) entity).getId());
 }

 public abstract Class<T> getEntityType();
}
