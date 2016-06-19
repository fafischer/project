package tools.te2m.services.project.entity.project;

import java.util.HashSet;
import java.util.Set;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;
import tools.te2m.services.project.entity.AbstractNamedEntity;
import tools.te2m.services.project.entity.bo.BusinessObject;
import tools.te2m.services.project.entity.requirement.Persona;
import tools.te2m.services.project.entity.requirement.UseCase;
import tools.te2m.services.project.entity.system.SystemInformation;

@NodeEntity
public class Project extends AbstractNamedEntity<Project> {

    public static final String RELATIONSHIP_KNOWS_PERSONA = "KNOWS_PERSONA";

    public static final String RELATIONSHIP_KNOWS_SYSTEM = "KNOWS_SYSTEM";

    public static final String RELATIONSHIP_KNOWS_BO = "KNOWS_BO";
    
    public static final String RELATIONSHIP_REQUIRES = "REQUIRES";
    public static Project create(){
        return new Project();
    }
    
    @Relationship(type = RELATIONSHIP_KNOWS_PERSONA)
    private Set<Persona> personas;

    @Relationship(type = RELATIONSHIP_KNOWS_SYSTEM)
    private Set<SystemInformation> systems;

    @Relationship(type = RELATIONSHIP_KNOWS_BO)
    private Set<BusinessObject> businessObjects;

    @Relationship(type = RELATIONSHIP_REQUIRES)
    private Set<UseCase> usecases;

    
    public Set<Persona> getPersonas() {
        if (null == this.personas) {
            this.personas= new HashSet<>();
        }
        return personas;
    }

    public void addPersona(Persona persona)
    {
        getPersonas().add(persona);
    }
    
    public Project knowsPersona(Persona persona)
    {
        addPersona(persona);
        return this;
    }
    
    public void setPersonas(Set<Persona> personas) {
        this.personas = personas;
    }

    public Set<UseCase> getUsecases() {
        if (null == this.usecases) {
            this.usecases= new HashSet<>();
        }
        return usecases;
    }

    public void setUsecases(Set<UseCase> usecases) {
        this.usecases = usecases;
    }

    public void addUseCase(UseCase usecase)
    {
        getUsecases().add(usecase);
    }
    
    public Project requires(UseCase usecase )
    {
        addUseCase(usecase);
        return this;
    }
    
    public Set<SystemInformation> getSystems() {
        if (null == this.systems) {
            this.systems= new HashSet<>();
        }
        return systems;
    }

    public void setSystems(Set<SystemInformation> systems) {
        this.systems = systems;
    }

    public void addSystem(SystemInformation sysInfo){
        getSystems().add(sysInfo);
    }
    
    public Project knowsSystem(SystemInformation sysInfo)
    {
        addSystem(sysInfo);
        return this;
    }
    
    public Set<BusinessObject> getBusinessObjects() {
        if (null == this.businessObjects) {
            this.businessObjects= new HashSet<>();
        }
        return businessObjects;
    }

    public void setBusinessObjects(Set<BusinessObject> businessObjects) {
        this.businessObjects = businessObjects;
    }
    
    public void addBusinessObject(BusinessObject bo){
        getBusinessObjects().add(bo);
    }
    
    public Project knowsBusinessOnject(BusinessObject bo){
        addBusinessObject(bo);
        return this;
    } 
}
