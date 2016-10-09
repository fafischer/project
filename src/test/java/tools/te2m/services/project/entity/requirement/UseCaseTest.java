package tools.te2m.services.project.entity.requirement;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * The Class UseCaseTest.
 *
 * @author frank
 * @version 1.0
 * @since 1.0
 */
public class UseCaseTest {
    
    /**
     * Test for add usecases.
     */
    @Test
    public void testAddUsecases() {
        // must never return null
        UseCase p1 = UseCase.create();
        p1.addIncludedUseCase(UseCase.create());
        assertNotNull("Must not return null", p1.getIncludedUsecases());
        assertEquals("Wrong number of usecases returned ", 1, p1.getIncludedUsecases().size());
    }

    /**
     * Test for fluent creation.
     */
    @Test
    public void testFluentCreation() {
        // must never return null
        UseCase p1 = UseCase.create()
                .withName("Name")
                .withDescription("Description")
                .withPriority(UseCasePriority.MUST)
                .includes(UseCase.create())
                .extend(UseCase.create());

        assertEquals(p1.getDescription(), "Description");
        
        assertEquals(p1.getName(), "Name");
        
        assertEquals(p1.getPriority(), UseCasePriority.MUST);
        
        assertEquals("Wrong number of usecases returned ", 1, p1.getIncludedUsecases().size());
                
        assertNotNull("Extended EseCase missing ", p1.getExtendedUseCase());
    }
    
    
    /**
     * Test for get usecases.
     */
    @Test
    public void testGetUsecases() {
        // must never return null
        UseCase p1 = new UseCase();
        assertNotNull("Must not return null", p1.getIncludedUsecases());
                
    }

}
