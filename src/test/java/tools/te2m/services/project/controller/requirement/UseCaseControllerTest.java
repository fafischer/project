/*
* UseCaseControllerTest.java
*   
* Copyright 2009 - 2016 Frank Fischer (email: frank@te2m.de)
*
* This file is part of the project project which is a sub project of temtools 
* (http://temtools.sf.net).
* 
 */
package tools.te2m.services.project.controller.requirement;

import java.util.Iterator;
import java.util.Set;
import java.util.UUID;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.neo4j.ogm.session.Session;
import tools.te2m.services.project.controller.Neo4JSessionFactory;
import tools.te2m.services.project.entity.requirement.UseCase;
import tools.te2m.services.project.entity.requirement.UseCaseDifficulty;
import tools.te2m.services.project.entity.requirement.UseCasePriority;
import tools.te2m.services.project.entity.requirement.UseCaseState;

/**
 * The Class UseCaseControllerTest.
 *
 * @author frank
 * @version 1.0
 * @since 1.0
 */
public class UseCaseControllerTest {

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
     * Test for base creation with relation.
     */
    @Test
    public void testBaseCreationWithRelation() {
        UseCaseController ctrllr = new UCC();

        String name = UUID.randomUUID().toString();

        String ucName = UUID.randomUUID().toString();

        UseCase p1 = new UseCase();
        UseCase u1 = new UseCase();
        p1.setName(name);
        u1.setName(ucName);

        u1 = ctrllr.createOrUpdate(u1);

        p1.addIncludedUseCase(u1);

        //p1.setDescription("Description goes here...");
        p1 = ctrllr.createOrUpdate(p1);

        Iterable<UseCase> it = ctrllr.findAll();

        assertNotNull("Entity missing ", p1);

        //assertEquals(2, ctrll);
        assertNotNull("Entity not persistet ", p1.getId());

        UseCase reloadedP = ctrllr.find(p1.getId());

        assertNotNull("Reloaded entity missing ", reloadedP);

        Set<UseCase> ucs = reloadedP.getIncludedUsecases();

        assertNotNull("No Usecases returned", ucs);

        assertEquals("Wrong number of usecases returned ", 1, ucs.size());

        for (Iterator<UseCase> iterator = ucs.iterator(); iterator.hasNext();) {
            UseCase next = iterator.next();
            assertNotNull("ID missing for Usecase", next.getId());

        }
    }

    /**
     * Test for baseic creation.
     */
    @Test
    public void testBaseicCreation() {
        UseCaseController ctrllr = new UCC();
        String name = UUID.randomUUID().toString();
        UseCase entity = new UseCase();
        entity.setName(name);
        //p1.setDescription("Description goes here...");
        entity = ctrllr.createOrUpdate(entity);

        assertNotNull("Entity missing ", entity);

        assertNotNull("Entity not persistet ", entity.getId());

        assertEquals("Wrong name found ", name, entity.getName());
    }

    /**
     * Test for baseic creation with using the different enums.
     */
    @Test
    public void testBaseicCreationEnums() {
        UseCaseController ctrllr = new UCC();
        String name = UUID.randomUUID().toString();
        UseCase entity = UseCase.create()
                .withName(name)
                .withPriority(UseCasePriority.WONT)
                .withDifficulty(UseCaseDifficulty.MEDIUM)
                .withState(UseCaseState.NEW);
        //p1.setDescription("Description goes here...");
        entity = ctrllr.createOrUpdate(entity);
        
        assertNotNull("Entity missing ", entity);

        assertNotNull("Entity not persistet ", entity.getId());

        UseCase reloaded = ctrllr.find(entity.getId());

        assertNotNull("Entity missing ", reloaded);
        
        assertEquals("Wrong priority", UseCasePriority.WONT, reloaded.getPriority());
        
        assertEquals("Wrong state", UseCaseState.NEW, reloaded.getState());

        assertEquals("Wrong difficulty", UseCaseDifficulty.MEDIUM, reloaded.getDifficulty());

    }

    
    private class UCC extends UseCaseController {

        public UCC() {
            super();
            Neo4JSessionFactory factory = Neo4JSessionFactory.getInstance();
            Session newSession = factory.getNeo4jSession();

            setSession(newSession);
        }
    }

}
