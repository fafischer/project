package tools.te2m.services.project.controller.bo;

import javax.ejb.Stateless;
import tools.te2m.services.project.controller.GenericController;
import tools.te2m.services.project.entity.bo.BusinessObject;

/**
 * The Class ProjectController.
 *
 * @author ffi
 */
@Stateless
public class BusinessObjectController extends GenericController<BusinessObject>{

    /* (non-Javadoc)
     * @see tools.te2m.services.project.controller.GenericController#getEntityType()
     */
    @Override
    public Class<BusinessObject> getEntityType() {
        return BusinessObject.class;
    }
    
}
