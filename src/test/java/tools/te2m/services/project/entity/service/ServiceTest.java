package tools.te2m.services.project.entity.service;

import tools.te2m.services.project.entity.system.*;
import org.junit.Test;
import static org.junit.Assert.*;
import tools.te2m.services.project.entity.bo.BusinessObject;
import tools.te2m.services.project.entity.operation.Operation;
import tools.te2m.services.project.entity.service.Service;
import tools.te2m.services.project.entity.system.SystemInformation;

public class ServiceTest {
    
    @Test
    public void testAddConfiguration() {
        // must never return null
        Service p1 = new Service();
        assertNotNull("Must not return null", p1.getConfiguration());
        assertEquals("Wrong number of configurations returned ", 0, p1.getConfiguration().size());
        p1.addConfiguration(new BusinessObject());
        assertEquals("Wrong number of configurations returned ", 1, p1.getConfiguration().size());
    }

        @Test
    public void testAddOperation() {
        // must never return null
        Service p1 = new Service();
        assertNotNull("Must not return null", p1.getOperations());
        assertEquals("Wrong number of operations returned ", 0, p1.getOperations().size());
        p1.addOperation(new Operation());
        assertEquals("Wrong number of operations returned ", 1, p1.getOperations().size());
    }

    
    /**
     * Test for fluent creation.
     */
    @Test
    public void testFluentCreation() {
         Service si = Service.create()
                 .withName("name")
                 .withDescription("description")
                 .withConfiguration(new BusinessObject())
                 .withOperation(new Operation())
                 .withOperation(new Operation());
         
                 //.(new Service());
         
         assertNotNull("Service missing", si);
         assertEquals("Wrong name", "name", si.getName());
         assertEquals("Wrong description", "description", si.getDescription());
         assertNotNull("Operations mut not be null", si.getOperations());
         assertNotNull("Configuration mut not be null", si.getConfiguration());
         
         assertEquals("Wrong number of operations returned", 2, si.getOperations().size());
         assertEquals("Wrong number of configurations returned", 1, si.getConfiguration().size());
    }
    
}
