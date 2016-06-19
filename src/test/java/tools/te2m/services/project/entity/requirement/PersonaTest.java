/*
* PersonaTest.java
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
 * The Class PersonaTest.
 *
 * @author frank
 * @version 1.0
 * @since 1.0
 */
public class PersonaTest {
    
    /**
     * Test for add usecases.
     */
    @Test
    public void testAddUsecases() {
        // must never return null
        Persona p1 = new Persona();
        p1.addUseCase(new UseCase());
        assertNotNull("Must not return null", p1.getUsecases());
        assertEquals("Wrong number of usecases returned ", 1, p1.getUsecases().size());
                
    }

    /**
     * Test for fluent creation.
     */
    @Test
    public void testFluentCreation() {
        // must never return null
        Persona p1 = Persona.create().withName("Name").withDescription("Description").wantsTo(new UseCase());

        assertEquals(p1.getDescription(), "Description");
        
        assertEquals(p1.getName(), "Name");
        
        assertEquals("Wrong number of usecases returned ", 1, p1.getUsecases().size());
                
    }
    
    
    /**
     * Test for get usecases.
     */
    @Test
    public void testGetUsecases() {
        // must never return null
        Persona p1 = new Persona();
        assertNotNull("Must not return null", p1.getUsecases());            
    }

}
