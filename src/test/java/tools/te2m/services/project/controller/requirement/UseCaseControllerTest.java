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
import tools.te2m.services.project.entity.requirement.UseCase;

public class UseCaseControllerTest {
        
    @BeforeClass
    public static void setUpClass() {
        Neo4JSessionFactory factory = Neo4JSessionFactory.getInstance();
        Session session = factory.getNeo4jSession();
        session.purgeDatabase();
    }

    @Test
    public void testBaseicCreation() {
        UseCaseController ctrllr = new UseCaseController();
        String name = UUID.randomUUID().toString();
        UseCase entity = new UseCase();
        entity.setName(name);
        //p1.setDescription("Description goes here...");
        entity = ctrllr.createOrUpdate(entity);
        
        assertNotNull("Entity missing ", entity);
        
        assertNotNull("Entity not persistet ", entity.getId());
        
        assertEquals("Wrong name found ",name, entity.getName());
    }


    @Test
    public void testBaseCreationWithRelation() {
        UseCaseController ctrllr = new UseCaseController();
        String name = UUID.randomUUID().toString();
        
        String ucName = UUID.randomUUID().toString();
        
        UseCase p1 = new UseCase();
        UseCase u1 = new UseCase();
        p1.setName(name);
        u1.setName(ucName);
        
        p1.addIncludedUseCase(u1);
        
        //p1.setDescription("Description goes here...");
        p1 = ctrllr.createOrUpdate(p1);
        
        assertNotNull("Entity missing ", p1);
        
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
    
}
