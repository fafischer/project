package tools.te2m.services.project.controller.project;

import java.util.Iterator;
import java.util.Set;
import java.util.UUID;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.neo4j.ogm.session.Session;
import tools.te2m.services.project.controller.Neo4JSessionFactory;
import tools.te2m.services.project.entity.project.Project;
import tools.te2m.services.project.entity.requirement.UseCase;

public class ProjectControllerTest {

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
        ProjectController ctrllr = new PC();

        String name = UUID.randomUUID().toString();

        Project p1 = Project.create().withName(name);
 
        p1 = ctrllr.createOrUpdate(p1);
        
        assertNotNull("Entity missing ", p1);

        assertNotNull("Entity not persistet ", p1.getId());
        
        Iterable<Project> it = ctrllr.findAll();

        assertNotNull("No projects returned", it);
    }

        private class PC extends ProjectController {

        public PC() {
            super();
            Neo4JSessionFactory factory = Neo4JSessionFactory.getInstance();
            Session newSession = factory.getNeo4jSession();

            setSession(newSession);
        }
    }
}
