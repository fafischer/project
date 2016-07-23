/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools.te2m.services.project.controller;

import javax.enterprise.inject.Produces;
import javax.inject.Singleton;
import org.neo4j.ogm.session.Session;

/**
 *
 * @author ffi
 */
@Singleton
public class SessionProvider {

    @Produces @NeoSession 
    public Session getSession() {
        return Neo4JSessionFactory.getInstance().getNeo4jSession();
    }
    
}
