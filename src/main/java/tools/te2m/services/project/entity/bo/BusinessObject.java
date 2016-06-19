/*
* BusinessObject.java
*   
* Copyright 2009 - 2016 Frank Fischer (email: frank@te2m.de)
*
* This file is part of the project project which is a sub project of temtools 
* (http://temtools.sf.net).
* 
*/
package tools.te2m.services.project.entity.bo;

import java.util.HashSet;
import java.util.Set;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;
import tools.te2m.services.project.entity.AbstractNamedEntity;
import tools.te2m.services.project.entity.operation.Operation;

/**
 * The Class BusinessObject.
 *
 * @author ffi
 */
@NodeEntity
public class BusinessObject extends AbstractNamedEntity<BusinessObject> {

    /**
     * The Constant RELATIONSHIP_ATTRIBUTE.
     */
    public static final String RELATIONSHIP_ATTRIBUTE = "BO_HAS_ATTRIBUTE";

    /**
     * The Constant RELATIONSHIP_OPERATION.
     */
    public static final String RELATIONSHIP_OPERATION = "BO_HAS_OPERATION";

    /**
     * Creates the.
     *
     * @return the business object
     */
    public static BusinessObject create() {
        return new BusinessObject();
    }
    
    /**
     * The attributes.
     */
    @Relationship(type = RELATIONSHIP_ATTRIBUTE)
    private Set<BusinessObject> attributes;

    /**
     * The operations.
     */
    @Relationship(type = RELATIONSHIP_OPERATION)
    private Set<Operation> operations;

    /**
     * Adds the attribute.
     *
     * @param bo the bo
     */
    public void addAttribute(BusinessObject bo){
        getAttributes().add(bo);
    }

    /**
     * Adds the operation.
     *
     * @param bo the bo
     */
    public void addOperation(Operation bo){
        getOperations().add(bo);
    }

    /**
     * Gets the attributes.
     *
     * @return the attributes
     */
    public Set<BusinessObject> getAttributes() {
        if(null==attributes){
            attributes= new HashSet<>();
        }
        return attributes;
    }
    
    /**
     * Gets the operations.
     *
     * @return the operations
     */
    public Set<Operation> getOperations() {
        if(null==operations)
        {
            operations= new HashSet<>();
        }
        return operations;
    }
            
    
    /**
     * Sets the attributes.
     *
     * @param attributes the new attributes
     */
    public void setAttributes(Set<BusinessObject> attributes) {
        this.attributes = attributes;
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
     * With attribute.
     *
     * @param bo the bo
     * @return the business object
     */
    public BusinessObject withAttribute(BusinessObject bo){
        addAttribute(bo);
        return this;
    }
    
    /**
     * With operation.
     *
     * @param bo the bo
     * @return the business object
     */
    public BusinessObject withOperation(Operation bo){
        addOperation(bo);
        return this;
    }    
}
