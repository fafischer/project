/*
* NonfunctionalRequirementsControllerTest.java
*   
* Copyright 2009 - 2016 Frank Fischer (email: frank@te2m.de)
*
* This file is part of the project project which is a sub project of temtools 
* (http://temtools.sf.net).
* 
*/
package tools.te2m.services.project.controller.requirement;

import java.util.UUID;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.neo4j.ogm.session.Session;
import tools.te2m.services.project.controller.Neo4JSessionFactory;
import tools.te2m.services.project.entity.requirement.NonfunctionalRequirement;


/**
 * The Class NonfunctionalRequirementsControllerTest.
 *
 * @author frank
 * @version 1.0
 * @since 1.0
 */
public class NonfunctionalRequirementsControllerTest {
        
    /**
     * Sets the up class.
     */
    @BeforeClass
    public static void setUpClass() {
        Neo4JSessionFactory factory = Neo4JSessionFactory.getInstance();
        Session session = factory.getNeo4jSession();
        session.purgeDatabase();
    }

    /**
     * Test for baseic creation.
     */
    @Test
    public void testBaseicCreation() {
        NonfunctionalRequirementController ctrllr = new NonfunctionalRequirementController();
        String name = UUID.randomUUID().toString();
        NonfunctionalRequirement entity = new NonfunctionalRequirement();
        entity.setName(name);
        //p1.setDescription("Description goes here...");
        entity = ctrllr.createOrUpdate(entity);
        
        assertNotNull("Entity missing ", entity);
        
        assertNotNull("Entity not persistet ", entity.getId());
        
        assertEquals("Wrong name found ",name, entity.getName());
    }
    
}
