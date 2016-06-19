/*
* Project.java
*   
* Copyright 2009 - 2016 Frank Fischer (email: frank@te2m.de)
*
* This file is part of the project project which is a sub project of temtools 
* (http://temtools.sf.net).
* 
*/
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

/**
 * The Class Project.
 *
 * @author frank
 * @version 1.0
 * @since 1.0
 */
@NodeEntity
public class Project extends AbstractNamedEntity<Project> {

    /**
     * The Constant RELATIONSHIP_KNOWS_PERSONA.
     */
    public static final String RELATIONSHIP_KNOWS_PERSONA = "KNOWS_PERSONA";

    /**
     * The Constant RELATIONSHIP_KNOWS_SYSTEM.
     */
    public static final String RELATIONSHIP_KNOWS_SYSTEM = "KNOWS_SYSTEM";

    /**
     * The Constant RELATIONSHIP_KNOWS_BO.
     */
    public static final String RELATIONSHIP_KNOWS_BO = "KNOWS_BO";
    
    /**
     * The Constant RELATIONSHIP_REQUIRES.
     */
    public static final String RELATIONSHIP_REQUIRES = "REQUIRES";
    
    /**
     * Creates the.
     *
     * @return the project
     */
    public static Project create(){
        return new Project();
    }
    
    /**
     * The personas.
     */
    @Relationship(type = RELATIONSHIP_KNOWS_PERSONA)
    private Set<Persona> personas;

    /**
     * The systems.
     */
    @Relationship(type = RELATIONSHIP_KNOWS_SYSTEM)
    private Set<SystemInformation> systems;

    /**
     * The business objects.
     */
    @Relationship(type = RELATIONSHIP_KNOWS_BO)
    private Set<BusinessObject> businessObjects;

    /**
     * The usecases.
     */
    @Relationship(type = RELATIONSHIP_REQUIRES)
    private Set<UseCase> usecases;

    
    /**
     * Gets the personas.
     *
     * @return the personas
     */
    public Set<Persona> getPersonas() {
        if (null == this.personas) {
            this.personas= new HashSet<>();
        }
        return personas;
    }

    /**
     * Adds the persona.
     *
     * @param persona the persona
     */
    public void addPersona(Persona persona)
    {
        getPersonas().add(persona);
    }
    
    /**
     * Knows persona.
     *
     * @param persona the persona
     * @return the project
     */
    public Project knowsPersona(Persona persona)
    {
        addPersona(persona);
        return this;
    }
    
    /**
     * Sets the personas.
     *
     * @param personas the new personas
     */
    public void setPersonas(Set<Persona> personas) {
        this.personas = personas;
    }

    /**
     * Gets the usecases.
     *
     * @return the usecases
     */
    public Set<UseCase> getUsecases() {
        if (null == this.usecases) {
            this.usecases= new HashSet<>();
        }
        return usecases;
    }

    /**
     * Sets the usecases.
     *
     * @param usecases the new usecases
     */
    public void setUsecases(Set<UseCase> usecases) {
        this.usecases = usecases;
    }

    /**
     * Adds the use case.
     *
     * @param usecase the usecase
     */
    public void addUseCase(UseCase usecase)
    {
        getUsecases().add(usecase);
    }
    
    /**
     * Requires.
     *
     * @param usecase the usecase
     * @return the project
     */
    public Project requires(UseCase usecase )
    {
        addUseCase(usecase);
        return this;
    }
    
    /**
     * Gets the systems.
     *
     * @return the systems
     */
    public Set<SystemInformation> getSystems() {
        if (null == this.systems) {
            this.systems= new HashSet<>();
        }
        return systems;
    }

    /**
     * Sets the systems.
     *
     * @param systems the new systems
     */
    public void setSystems(Set<SystemInformation> systems) {
        this.systems = systems;
    }

    /**
     * Adds the system.
     *
     * @param sysInfo the sys info
     */
    public void addSystem(SystemInformation sysInfo){
        getSystems().add(sysInfo);
    }
    
    /**
     * Knows system.
     *
     * @param sysInfo the sys info
     * @return the project
     */
    public Project knowsSystem(SystemInformation sysInfo)
    {
        addSystem(sysInfo);
        return this;
    }
    
    /**
     * Gets the business objects.
     *
     * @return the business objects
     */
    public Set<BusinessObject> getBusinessObjects() {
        if (null == this.businessObjects) {
            this.businessObjects= new HashSet<>();
        }
        return businessObjects;
    }

    /**
     * Sets the business objects.
     *
     * @param businessObjects the new business objects
     */
    public void setBusinessObjects(Set<BusinessObject> businessObjects) {
        this.businessObjects = businessObjects;
    }
    
    /**
     * Adds the business object.
     *
     * @param bo the bo
     */
    public void addBusinessObject(BusinessObject bo){
        getBusinessObjects().add(bo);
    }
    
    /**
     * Knows business onject.
     *
     * @param bo the bo
     * @return the project
     */
    public Project knowsBusinessOnject(BusinessObject bo){
        addBusinessObject(bo);
        return this;
    } 
}
