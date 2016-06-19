/*
* SystemInformation.java
*   
* Copyright 2009 - 2016 Frank Fischer (email: frank@te2m.de)
*
* This file is part of the project project which is a sub project of temtools 
* (http://temtools.sf.net).
* 
*/
package tools.te2m.services.project.entity.system;

import java.util.HashSet;
import java.util.Set;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;
import tools.te2m.services.project.entity.AbstractNamedEntity;
import tools.te2m.services.project.entity.service.Service;

/**
 * The Class SystemInformation.
 *
 * @author ffi
 */
@NodeEntity
public class SystemInformation extends AbstractNamedEntity<SystemInformation> {

    /**
     * The Constant RELATIONSHIP_PROVIDES.
     */
    public static final String RELATIONSHIP_PROVIDES = "PROVIDES";
    
    /**
     * The Constant RELATIONSHIP_CONSUMES.
     */
    public static final String RELATIONSHIP_CONSUMES = "CONSUMES";

    /**
     * Creates the.
     *
     * @return the system information
     */
    public static SystemInformation create() {
        return new SystemInformation();
    }

    /**
     * The provided services.
     */
    @Relationship(type = RELATIONSHIP_PROVIDES)
    private Set<Service> providedServices;

    /**
     * The consumed services.
     */
    @Relationship(type = RELATIONSHIP_CONSUMES)
    private Set<Service> consumedServices;

    /**
     * Gets the provided services.
     *
     * @return the provided services
     */
    public Set<Service> getProvidedServices() {
        if (null == this.providedServices) {
            this.providedServices= new HashSet<>();
        }
        return providedServices;
    }

    /**
     * Sets the provided services.
     *
     * @param providedServices the new provided services
     */
    public void setProvidedServices(Set<Service> providedServices) {
        this.providedServices = providedServices;
    }

    /**
     * Gets the consumed services.
     *
     * @return the consumed services
     */
    public Set<Service> getConsumedServices() {
        if (null == this.consumedServices) {
            this.consumedServices= new HashSet<>();
        }
        return consumedServices;
    }

    /**
     * Sets the consumed services.
     *
     * @param consumedServices the new consumed services
     */
    public void setConsumedServices(Set<Service> consumedServices) {
        this.consumedServices = consumedServices;
    }

}
