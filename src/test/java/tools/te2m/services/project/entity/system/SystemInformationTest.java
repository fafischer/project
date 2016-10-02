package tools.te2m.services.project.entity.system;

import org.junit.Test;
import static org.junit.Assert.*;
import tools.te2m.services.project.entity.service.Service;
import tools.te2m.services.project.entity.system.SystemInformation;

public class SystemInformationTest {
    
    /**
     * Test for add usecases.
     */
    @Test
    public void testAddService() {
        // must never return null
        SystemInformation p1 = new SystemInformation();
        assertNotNull("Must not return null", p1.getConsumedServices());
        assertEquals("Wrong number of consumed services returned ", 0, p1.getConsumedServices().size());
        p1.addConsumedService(new Service());
        assertEquals("Wrong number of consumed services returned ", 1, p1.getConsumedServices().size());
        assertNotNull("Must not return null", p1.getProvidedServices());
        assertEquals("Wrong number of provided services returned ", 0, p1.getProvidedServices().size());        
        p1.addProvidedService(new Service());
        assertEquals("Wrong number of provided services returned ", 1, p1.getProvidedServices().size());        
    }

    /**
     * Test for fluent creation.
     */
    @Test
    public void testFluentCreation() {
         SystemInformation si = SystemInformation.create()
                 .withName("name")
                 .withDescription("description")
                 .consumes(new Service());
         
         assertNotNull("Systeminformation missing", si);
         assertEquals("Wrong name", "name", si.getName());
         assertEquals("Wrong description", "description", si.getDescription());
         assertNotNull("Consumed services mut not be null", si.getConsumedServices());
         assertNotNull("Provided services mut not be null", si.getProvidedServices());
         assertEquals("Wrong number of provided services returned", 0, si.getProvidedServices().size());
         assertEquals("Wrong number of consumwd services returned", 1, si.getConsumedServices().size());
    }
    
}
