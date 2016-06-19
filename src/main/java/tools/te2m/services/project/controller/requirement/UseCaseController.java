package tools.te2m.services.project.controller.requirement;

import tools.te2m.services.project.controller.GenericController;
import tools.te2m.services.project.entity.requirement.UseCase;

public class UseCaseController extends GenericController<UseCase>{

    @Override
    public Class<UseCase> getEntityType() {
        return UseCase.class;
    }
    
}
