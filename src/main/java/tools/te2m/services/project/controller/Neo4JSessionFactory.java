/*
* Neo4JSessionFactory.java
*   
* Copyright 2009 - 2016 Frank Fischer (email: frank@te2m.de)
*
* This file is part of the project project which is a sub project of temtools 
* (http://temtools.sf.net).
* 
*/
package tools.te2m.services.project.controller;

import org.neo4j.ogm.session.Session;
import org.neo4j.ogm.session.SessionFactory;

// @TODO 
/**
 * A factory for creating Neo4JSession objects.
 */
public class Neo4JSessionFactory {

    /**
     * The Constant sessionFactory.
     */
    private final static SessionFactory sessionFactory = new SessionFactory("tools.te2m.services.project.entity");
    
    /**
     * The factory.
     */
    private static Neo4JSessionFactory factory = new Neo4JSessionFactory();

    /**
     * Gets the single instance of Neo4JSessionFactory.
     *
     * @return single instance of Neo4JSessionFactory
     */
    public static Neo4JSessionFactory getInstance() {
        return factory;
    }

    /**
     * Instantiates a new neo4 j session factory.
     */
    private Neo4JSessionFactory() {
    }

    /**
     * Gets the neo4j session.
     *
     * @return the neo4j session
     */
    public Session getNeo4jSession() {
        //Configuration config = new Configuration();
        return sessionFactory.openSession();
    }
}
