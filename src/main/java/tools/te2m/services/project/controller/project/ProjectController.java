package tools.te2m.services.project.controller.project;

import tools.te2m.services.project.controller.GenericController;
import tools.te2m.services.project.entity.project.Project;

/**
 *
 * @author ffi
 */
public class ProjectController extends GenericController<Project>{

    @Override
    public Class<Project> getEntityType() {
        return Project.class;
    }
    
}
