/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools.te2m.services.project.entity.bo;

import java.util.HashSet;
import java.util.Set;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;
import tools.te2m.services.project.entity.AbstractNamedEntity;
import tools.te2m.services.project.entity.operation.Operation;

/**
 *
 * @author ffi
 */
@NodeEntity
public class BusinessObject extends AbstractNamedEntity<BusinessObject> {

    public static final String RELATIONSHIP_ATTRIBUTE = "BO_HAS_ATTRIBUTE";

    public static final String RELATIONSHIP_OPERATION = "BO_HAS_OPERATION";

    public static BusinessObject create() {
        return new BusinessObject();
    }
    
    @Relationship(type = RELATIONSHIP_ATTRIBUTE)
    private Set<BusinessObject> attributes;

    @Relationship(type = RELATIONSHIP_OPERATION)
    private Set<Operation> operations;

    public Set<BusinessObject> getAttributes() {
        if(null==attributes){
            attributes= new HashSet<>();
        }
        return attributes;
    }

    public void setAttributes(Set<BusinessObject> attributes) {
        this.attributes = attributes;
    }

    public void addAttribute(BusinessObject bo){
        getAttributes().add(bo);
    }
    
    public BusinessObject withAttribute(BusinessObject bo){
        addAttribute(bo);
        return this;
    }
            
    
    public Set<Operation> getOperations() {
        if(null==operations)
        {
            operations= new HashSet<>();
        }
        return operations;
    }

    public void setOperations(Set<Operation> operations) {
        this.operations = operations;
    }
    
    public void addOperation(Operation bo){
        getOperations().add(bo);
    }
    
    public BusinessObject withOperation(Operation bo){
        addOperation(bo);
        return this;
    }    
}
