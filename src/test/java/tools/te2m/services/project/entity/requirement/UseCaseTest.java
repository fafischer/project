package tools.te2m.services.project.entity.requirement;

import org.junit.Test;
import static org.junit.Assert.*;

public class UseCaseTest {
    
    @Test
    public void testGetUsecases() {
        // must never return null
        UseCase p1 = new UseCase();
        assertNotNull("Must not return null", p1.getIncludedUsecases());
                
    }

    @Test
    public void testFluentCreation() {
        // must never return null
        UseCase p1 = UseCase.create().withName("Name").withDescription("Description").includes(UseCase.create()).extend(UseCase.create());

        assertEquals(p1.getDescription(), "Description");
        
        assertEquals(p1.getName(), "Name");
        
        assertEquals("Wrong number of usecases returned ", 1, p1.getIncludedUsecases().size());
                
        assertNotNull("Extended EseCase missing ", p1.getExtendedUseCase());
    }
    
    
    @Test
    public void testAddUsecases() {
        // must never return null
        UseCase p1 = UseCase.create();
        p1.addIncludedUseCase(UseCase.create());
        assertNotNull("Must not return null", p1.getIncludedUsecases());
        assertEquals("Wrong number of usecases returned ", 1, p1.getIncludedUsecases().size());
    }

}
