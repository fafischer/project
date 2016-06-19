/*
* HasConfiguration.java
*   
* Copyright 2009 - 2016 Frank Fischer (email: frank@te2m.de)
*
* This file is part of the project project which is a sub project of temtools 
* (http://temtools.sf.net).
* 
*/
package tools.te2m.services.project.entity.service;

import tools.te2m.services.project.entity.bo.*;
import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;
import tools.te2m.services.project.entity.AbstractEntity;


/**
 * The Class HasConfiguration.
 *
 * @author frank
 * @version 1.0
 * @since 1.0
 */
@RelationshipEntity(type = BusinessObject.RELATIONSHIP_ATTRIBUTE)
public class HasConfiguration extends AbstractEntity{

    /**
     * The service.
     */
    @StartNode
    private Service service;
    
    /**
     * The configuration.
     */
    @EndNode
    private BusinessObject configuration;

    /**
     * Gets the configuration.
     *
     * @return the configuration
     */
    public BusinessObject getConfiguration() {
        return configuration;
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
     * Sets the configuration.
     *
     * @param configuration the new configuration
     */
    public void setConfiguration(BusinessObject configuration) {
        this.configuration = configuration;
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
