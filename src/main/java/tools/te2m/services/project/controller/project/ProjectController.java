/*
* ProjectController.java
*   
* Copyright 2009 - 2016 Frank Fischer (email: frank@te2m.de)
*
* This file is part of the project project which is a sub project of temtools 
* (http://temtools.sf.net).
* 
*/
package tools.te2m.services.project.controller.project;

import tools.te2m.services.project.controller.GenericController;
import tools.te2m.services.project.entity.project.Project;

/**
 * The Class ProjectController.
 *
 * @author ffi
 */
public class ProjectController extends GenericController<Project>{

    /* (non-Javadoc)
     * @see tools.te2m.services.project.controller.GenericController#getEntityType()
     */
    @Override
    public Class<Project> getEntityType() {
        return Project.class;
    }
    
}
