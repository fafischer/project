/*
* PersonaController.java
*   
* Copyright 2009 - 2016 Frank Fischer (email: frank@te2m.de)
*
* This file is part of the project project which is a sub project of temtools 
* (http://temtools.sf.net).
* 
*/
package tools.te2m.services.project.controller.requirement;

import tools.te2m.services.project.controller.GenericController;
import tools.te2m.services.project.entity.requirement.Persona;

/**
 * The Class PersonaController.
 *
 * @author ffi
 */
public class PersonaController extends GenericController<Persona>{

    /* (non-Javadoc)
     * @see tools.te2m.services.project.controller.GenericController#getEntityType()
     */
    @Override
    public Class<Persona> getEntityType() {
        return Persona.class;
    }
    
}
