package tools.te2m.services.project.controller.system;

import tools.te2m.services.project.controller.project.*;
import java.util.UUID;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.neo4j.ogm.session.Session;
import tools.te2m.services.project.controller.Neo4JSessionFactory;
import tools.te2m.services.project.entity.project.Project;
import tools.te2m.services.project.entity.system.SystemInformation;

public class SystemInformationControllerTest {

    /**
     * Sets the up class.
     */
    @BeforeClass
    public static void setUpClass() {
        Neo4JSessionFactory factory = Neo4JSessionFactory.getInstance();
        Session session = factory.getNeo4jSession();
        session.purgeDatabase();
    }

    @Test
    public void testBaseCreation() {
        SystemInformationController ctrllr = new PC();

        String name = UUID.randomUUID().toString();

        SystemInformation p1 = SystemInformation.create().withName(name);
 
        p1 = ctrllr.createOrUpdate(p1);
        
        assertNotNull("Entity missing ", p1);

        assertNotNull("Entity not persistet ", p1.getId());
        
        Iterable<SystemInformation> it = ctrllr.findAll();

        assertNotNull("No SystemInformation returned", it);
    }

        private class PC extends SystemInformationController {

        public PC() {
            super();
            Neo4JSessionFactory factory = Neo4JSessionFactory.getInstance();
            Session newSession = factory.getNeo4jSession();

            setSession(newSession);
        }
    }
}
