package tools.te2m.services.project.controller.service;

import tools.te2m.services.project.controller.system.*;
import java.util.UUID;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.neo4j.ogm.session.Session;
import tools.te2m.services.project.controller.Neo4JSessionFactory;
import tools.te2m.services.project.entity.bo.BusinessObject;
import tools.te2m.services.project.entity.operation.Operation;
import tools.te2m.services.project.entity.service.Service;

public class ServiceControllerTest {

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
        ServiceController ctrllr = new SC();

        String name = UUID.randomUUID().toString();

        Service p1 = Service.create().withName(name);

        p1 = ctrllr.createOrUpdate(p1);

        assertNotNull("Entity missing ", p1);

        assertNotNull("Entity not persistet ", p1.getId());

        Iterable<Service> it = ctrllr.findAll();

        assertNotNull("No SystemInformation returned", it);
    }

    @Test
    public void testBaseCreationWithOperation() {
        ServiceController ctrllr = new SC();

        String name = UUID.randomUUID().toString();

        Service p1 = Service.create().withName(name).withOperation(new Operation());

        p1 = ctrllr.createOrUpdate(p1);

        assertNotNull("Entity missing ", p1);

        assertNotNull("Entity not persistet ", p1.getId());

        assertNotNull("Operation missing", p1.getOperations());

        assertEquals("Wrong number of operations retunred", 1, p1.getOperations().size());

        for (Operation op : p1.getOperations()) {
            assertNotNull("Operation not persisted", op.getId());
        }
    }

    @Test
    public void testBaseCreationWithConfiguration() {
        ServiceController ctrllr = new SC();

        String name = UUID.randomUUID().toString();

        Service p1 = Service.create()
                .withName(name)
                .withConfiguration(new BusinessObject())
                .withConfiguration(new BusinessObject());

        p1 = ctrllr.createOrUpdate(p1);

        assertNotNull("Entity missing ", p1);

        assertNotNull("Entity not persistet ", p1.getId());

        assertNotNull("Configuration missing", p1.getConfiguration());

        assertEquals("Wrong number of configurations retunred", 2, p1.getConfiguration().size());

        for (BusinessObject op : p1.getConfiguration()) {
            assertNotNull("Configuration not persisted", op.getId());
        }
    }

    private class SC extends ServiceController {

        public SC() {
            super();
            Neo4JSessionFactory factory = Neo4JSessionFactory.getInstance();
            Session newSession = factory.getNeo4jSession();

            setSession(newSession);
        }
    }
}
