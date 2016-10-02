package tools.te2m.services.project.controller.system;

import tools.te2m.services.project.controller.GenericController;
import tools.te2m.services.project.entity.system.SystemInformation;

public class SystemInformationController extends GenericController<SystemInformation>{

    public SystemInformationController()
    {
        super();
    }
    
    
    /* (non-Javadoc)
     * @see tools.te2m.services.project.controller.GenericController#getEntityType()
     */
    @Override
    public Class<SystemInformation> getEntityType() {
        return SystemInformation.class;
    }
    
}
