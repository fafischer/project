package tools.te2m.services.project.controller.requirement;

import java.util.UUID;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.neo4j.ogm.session.Session;
import tools.te2m.services.project.controller.Neo4JSessionFactory;
import tools.te2m.services.project.entity.requirement.NonfunctionalRequirement;


public class NonfunctionalRequirementsControllerTest {
        
    @BeforeClass
    public static void setUpClass() {
        Neo4JSessionFactory factory = Neo4JSessionFactory.getInstance();
        Session session = factory.getNeo4jSession();
        session.purgeDatabase();
    }

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
