/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
 *
 * @author ffi
 */
@NodeEntity
public class Service extends AbstractNamedEntity<Service> {

    public static final String RELATIONSHIP_OPERATION = "SERVICE_HAS_OPERATION";

    public static final String RELATIONSHIP_CONFIGURATION = "SERVICE_HAS_CONFIGURATION";

    public static Service create() {
        return new Service();
    }

    @Relationship(type = RELATIONSHIP_CONFIGURATION)
    private Set<BusinessObject> configuration;

    @Relationship(type = RELATIONSHIP_OPERATION)
    private Set<Operation> operations;

    public Set<Operation> getOperations() {
        if (null == operations) {
            operations = new HashSet<>();
        }
        return operations;
    }

    public void setOperations(Set<Operation> operations) {
        this.operations = operations;
    }

    public void addOperation(Operation bo) {
        getOperations().add(bo);
    }

    public Service withOperation(Operation bo) {
        addOperation(bo);
        return this;
    }

    public Set<BusinessObject> getConfiguration() {
        if(null==configuration)
        {
            configuration=new HashSet<>();
        }
        return configuration;
    }

    public void setConfiguration(Set<BusinessObject> configuration) {
        this.configuration = configuration;
    }

    public void addConfiguration(BusinessObject config)
    {
        getConfiguration().add(config);
    }
    
    public Service withConfiguration(BusinessObject config)
    {
        addConfiguration(config);
        return this;
    }
}
