package tools.te2m.services.project.controller.requirement;

import tools.te2m.services.project.controller.GenericController;
import tools.te2m.services.project.entity.requirement.NonfunctionalRequirement;

public class NonfunctionalRequirementController extends GenericController<NonfunctionalRequirement>{

    @Override
    public Class<NonfunctionalRequirement> getEntityType() {
        return NonfunctionalRequirement.class;
    }
    
}
