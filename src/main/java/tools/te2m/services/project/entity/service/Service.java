/*
* Service.java
*   
* Copyright 2009 - 2016 Frank Fischer (email: frank@te2m.de)
*
* This file is part of the project project which is a sub project of temtools 
* (http://temtools.sf.net).
* 
*/
package tools.te2m.services.project.entity.service;

import java.util.HashSet;
import java.util.Set;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;
import tools.te2m.services.project.entity.AbstractNamedEntity;
import tools.te2m.services.project.entity.bo.BusinessObject;
import tools.te2m.services.project.entity.operation.Operation;

/**
 * The Class Service.
 *
 * @author ffi
 */
@NodeEntity
public class Service extends AbstractNamedEntity<Service> {

    /**
     * The Constant RELATIONSHIP_OPERATION.
     */
    public static final String RELATIONSHIP_OPERATION = "SERVICE_HAS_OPERATION";

    /**
     * The Constant RELATIONSHIP_CONFIGURATION.
     */
    public static final String RELATIONSHIP_CONFIGURATION = "SERVICE_HAS_CONFIGURATION";

    /**
     * Creates the.
     *
     * @return the service
     */
    public static Service create() {
        return new Service();
    }

    /**
     * The configuration.
     */
    @Relationship(type = RELATIONSHIP_CONFIGURATION)
    private Set<BusinessObject> configuration;

    /**
     * The operations.
     */
    @Relationship(type = RELATIONSHIP_OPERATION)
    private Set<Operation> operations;

    /**
     * Adds the configuration.
     *
     * @param config the config
     */
    public void addConfiguration(BusinessObject config)
    {
        getConfiguration().add(config);
    }

    /**
     * Adds the operation.
     *
     * @param bo the bo
     */
    public void addOperation(Operation bo) {
        getOperations().add(bo);
    }

    /**
     * Gets the configuration.
     *
     * @return the configuration
     */
    public Set<BusinessObject> getConfiguration() {
        if(null==configuration)
        {
            configuration=new HashSet<>();
        }
        return configuration;
    }

    /**
     * Gets the operations.
     *
     * @return the operations
     */
    public Set<Operation> getOperations() {
        if (null == operations) {
            operations = new HashSet<>();
        }
        return operations;
    }

    /**
     * Sets the configuration.
     *
     * @param configuration the new configuration
     */
    public void setConfiguration(Set<BusinessObject> configuration) {
        this.configuration = configuration;
    }

    /**
     * Sets the operations.
     *
     * @param operations the new operations
     */
    public void setOperations(Set<Operation> operations) {
        this.operations = operations;
    }

    /**
     * With configuration.
     *
     * @param config the config
     * @return the service
     */
    public Service withConfiguration(BusinessObject config)
    {
        addConfiguration(config);
        return this;
    }
    
    /**
     * With operation.
     *
     * @param bo the bo
     * @return the service
     */
    public Service withOperation(Operation bo) {
        addOperation(bo);
        return this;
    }
}
