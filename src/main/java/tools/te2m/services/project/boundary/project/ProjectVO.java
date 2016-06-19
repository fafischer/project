package tools.te2m.services.project.boundary.project;

import java.util.Set;
import tools.te2m.services.project.boundary.EntityRefVO;

public class ProjectVO extends EntityRefVO {

    private Set<EntityRefVO> personas;

    private Set<EntityRefVO> systems;

    private Set<EntityRefVO> businessObjects;

    private Set<EntityRefVO> usecases;

    public Set<EntityRefVO> getPersonas() {
        return personas;
    }

    public void setPersonas(Set<EntityRefVO> personas) {
        this.personas = personas;
    }

    public Set<EntityRefVO> getSystems() {
        return systems;
    }

    public void setSystems(Set<EntityRefVO> systems) {
        this.systems = systems;
    }

    public Set<EntityRefVO> getBusinessObjects() {
        return businessObjects;
    }

    public void setBusinessObjects(Set<EntityRefVO> businessObjects) {
        this.businessObjects = businessObjects;
    }

    public Set<EntityRefVO> getUsecases() {
        return usecases;
    }

    public void setUsecases(Set<EntityRefVO> usecases) {
        this.usecases = usecases;
    }
    
    
}
