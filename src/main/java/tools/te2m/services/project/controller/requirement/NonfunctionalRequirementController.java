/*
* NonfunctionalRequirementController.java
*   
* Copyright 2009 - 2016 Frank Fischer (email: frank@te2m.de)
*
* This file is part of the project project which is a sub project of temtools 
* (http://temtools.sf.net).
* 
*/
package tools.te2m.services.project.controller.requirement;

import tools.te2m.services.project.controller.GenericController;
import tools.te2m.services.project.entity.requirement.NonfunctionalRequirement;

/**
 * The Class NonfunctionalRequirementController.
 *
 * @author frank
 * @version 1.0
 * @since 1.0
 */
public class NonfunctionalRequirementController extends GenericController<NonfunctionalRequirement>{

    /* (non-Javadoc)
     * @see tools.te2m.services.project.controller.GenericController#getEntityType()
     */
    @Override
    public Class<NonfunctionalRequirement> getEntityType() {
        return NonfunctionalRequirement.class;
    }
    
}
