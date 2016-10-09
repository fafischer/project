package tools.te2m.services.project.controller.service;

import tools.te2m.services.project.controller.GenericController;
import tools.te2m.services.project.entity.service.Service;

public class ServiceController extends GenericController<Service>{

    public ServiceController()
    {
        super();
    }
    
    
    /* (non-Javadoc)
     * @see tools.te2m.services.project.controller.GenericController#getEntityType()
     */
    @Override
    public Class<Service> getEntityType() {
        return Service.class;
    }
    
}
