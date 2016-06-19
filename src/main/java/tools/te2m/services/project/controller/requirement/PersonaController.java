package tools.te2m.services.project.controller.requirement;

import tools.te2m.services.project.controller.GenericController;
import tools.te2m.services.project.entity.requirement.Persona;

/**
 *
 * @author ffi
 */
public class PersonaController extends GenericController<Persona>{

    @Override
    public Class<Persona> getEntityType() {
        return Persona.class;
    }
    
}
