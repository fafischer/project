/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools.te2m.services.project.controller;

import org.neo4j.ogm.session.Session;
import org.neo4j.ogm.session.SessionFactory;

// @TODO 
public class Neo4JSessionFactory {

    private final static SessionFactory sessionFactory = new SessionFactory("tools.te2m.services.project.entity");
    private static Neo4JSessionFactory factory = new Neo4JSessionFactory();

    public static Neo4JSessionFactory getInstance() {
        return factory;
    }

    private Neo4JSessionFactory() {
    }

    public Session getNeo4jSession() {
        //Configuration config = new Configuration();
        return sessionFactory.openSession();
    }
}
