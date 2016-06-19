/*
* UseCaseTest.java
*   
* Copyright 2009 - 2016 Frank Fischer (email: frank@te2m.de)
*
* This file is part of the project project which is a sub project of temtools 
* (http://temtools.sf.net).
* 
*/
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
     * Test for get usecases.
     */
    @Test
    public void testGetUsecases() {
        // must never return null
        UseCase p1 = new UseCase();
        assertNotNull("Must not return null", p1.getIncludedUsecases());
                
    }

    /**
     * Test for fluent creation.
     */
    @Test
    public void testFluentCreation() {
        // must never return null
        UseCase p1 = UseCase.create().withName("Name").withDescription("Description").includes(UseCase.create()).extend(UseCase.create());

        assertEquals(p1.getDescription(), "Description");
        
        assertEquals(p1.getName(), "Name");
        
        assertEquals("Wrong number of usecases returned ", 1, p1.getIncludedUsecases().size());
                
        assertNotNull("Extended EseCase missing ", p1.getExtendedUseCase());
    }
    
    
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

}
