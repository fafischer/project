/*
* ProjectVO.java
*   
* Copyright 2009 - 2016 Frank Fischer (email: frank@te2m.de)
*
* This file is part of the project project which is a sub project of temtools 
* (http://temtools.sf.net).
* 
*/
package tools.te2m.services.project.boundary.project;

import java.util.Set;
import tools.te2m.services.project.boundary.EntityRefVO;

/**
 * The Class ProjectVO.
 *
 * @author frank
 * @version 1.0
 * @since 1.0
 */
public class ProjectVO extends EntityRefVO {

    /**
     * The personas.
     */
    private Set<EntityRefVO> personas;

    /**
     * The systems.
     */
    private Set<EntityRefVO> systems;

    /**
     * The business objects.
     */
    private Set<EntityRefVO> businessObjects;

    /**
     * The usecases.
     */
    private Set<EntityRefVO> usecases;

    /**
     * Gets the personas.
     *
     * @return the personas
     */
    public Set<EntityRefVO> getPersonas() {
        return personas;
    }

    /**
     * Sets the personas.
     *
     * @param personas the new personas
     */
    public void setPersonas(Set<EntityRefVO> personas) {
        this.personas = personas;
    }

    /**
     * Gets the systems.
     *
     * @return the systems
     */
    public Set<EntityRefVO> getSystems() {
        return systems;
    }

    /**
     * Sets the systems.
     *
     * @param systems the new systems
     */
    public void setSystems(Set<EntityRefVO> systems) {
        this.systems = systems;
    }

    /**
     * Gets the business objects.
     *
     * @return the business objects
     */
    public Set<EntityRefVO> getBusinessObjects() {
        return businessObjects;
    }

    /**
     * Sets the business objects.
     *
     * @param businessObjects the new business objects
     */
    public void setBusinessObjects(Set<EntityRefVO> businessObjects) {
        this.businessObjects = businessObjects;
    }

    /**
     * Gets the usecases.
     *
     * @return the usecases
     */
    public Set<EntityRefVO> getUsecases() {
        return usecases;
    }

    /**
     * Sets the usecases.
     *
     * @param usecases the new usecases
     */
    public void setUsecases(Set<EntityRefVO> usecases) {
        this.usecases = usecases;
    }
    
    
}
