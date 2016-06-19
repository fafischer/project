/*
* Consumes.java
*   
* Copyright 2009 - 2016 Frank Fischer (email: frank@te2m.de)
*
* This file is part of the project project which is a sub project of temtools 
* (http://temtools.sf.net).
* 
*/
package tools.te2m.services.project.entity.system;

import tools.te2m.services.project.entity.requirement.*;
import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;
import tools.te2m.services.project.entity.AbstractEntity;
import tools.te2m.services.project.entity.service.Service;

/**
 * The Class Consumes.
 *
 * @author ffi
 */
@RelationshipEntity(type = SystemInformation.RELATIONSHIP_CONSUMES)
public class Consumes extends AbstractEntity{



    /**
     * The system.
     */
    @StartNode
    private SystemInformation system;
    
    /**
     * The service.
     */
    @EndNode
    private Service service;

    /**
     * Gets the system.
     *
     * @return the system
     */
    public SystemInformation getSystem() {
        return system;
    }

    /**
     * Sets the system.
     *
     * @param system the new system
     */
    public void setSystem(SystemInformation system) {
        this.system = system;
    }

    /**
     * Gets the service.
     *
     * @return the service
     */
    public Service getService() {
        return service;
    }

    /**
     * Sets the service.
     *
     * @param service the new service
     */
    public void setService(Service service) {
        this.service = service;
    }
    
    
    
}
