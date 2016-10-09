/*
* UseCaseController.java
*   
* Copyright 2009 - 2016 Frank Fischer (email: frank@te2m.de)
*
* This file is part of the project project which is a sub project of temtools 
* (http://temtools.sf.net).
* 
*/
package tools.te2m.services.project.controller.requirement;

import tools.te2m.services.project.controller.GenericController;
import tools.te2m.services.project.controller.SessionProvider;
import tools.te2m.services.project.entity.requirement.UseCase;

/**
 * The Class UseCaseController.
 *
 * @author frank
 * @version 1.0
 * @since 1.0
 */
public class UseCaseController extends GenericController<UseCase>{

    public UseCaseController()
    {
        super();
    }
    
    
    /* (non-Javadoc)
     * @see tools.te2m.services.project.controller.GenericController#getEntityType()
     */
    @Override
    public Class<UseCase> getEntityType() {
        return UseCase.class;
    }
    
}
