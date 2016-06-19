package tools.te2m.services.project.entity.requirement;

import org.junit.Test;
import static org.junit.Assert.*;

public class PersonaTest {
    
    @Test
    public void testGetUsecases() {
        // must never return null
        Persona p1 = new Persona();
        assertNotNull("Must not return null", p1.getUsecases());            
    }

    @Test
    public void testFluentCreation() {
        // must never return null
        Persona p1 = Persona.create().withName("Name").withDescription("Description").wantsTo(new UseCase());

        assertEquals(p1.getDescription(), "Description");
        
        assertEquals(p1.getName(), "Name");
        
        assertEquals("Wrong number of usecases returned ", 1, p1.getUsecases().size());
                
    }
    
    
    @Test
    public void testAddUsecases() {
        // must never return null
        Persona p1 = new Persona();
        p1.addUseCase(new UseCase());
        assertNotNull("Must not return null", p1.getUsecases());
        assertEquals("Wrong number of usecases returned ", 1, p1.getUsecases().size());
                
    }

}
