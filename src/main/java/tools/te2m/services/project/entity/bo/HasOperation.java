/*
* HasOperation.java
*   
* Copyright 2009 - 2016 Frank Fischer (email: frank@te2m.de)
*
* This file is part of the project project which is a sub project of temtools 
* (http://temtools.sf.net).
* 
*/
package tools.te2m.services.project.entity.bo;

import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;
import tools.te2m.services.project.entity.AbstractEntity;
import tools.te2m.services.project.entity.operation.Operation;


/**
 * The Class HasOperation.
 *
 * @author frank
 * @version 1.0
 * @since 1.0
 */
@RelationshipEntity(type = BusinessObject.RELATIONSHIP_OPERATION)
public class HasOperation extends AbstractEntity{

    /**
     * The business object.
     */
    @StartNode
    private BusinessObject businessObject;
    
    /**
     * The operation.
     */
    @EndNode
    private Operation operation;

    /**
     * Gets the business object.
     *
     * @return the business object
     */
    public BusinessObject getBusinessObject() {
        return businessObject;
    }

    /**
     * Gets the operation.
     *
     * @return the operation
     */
    public Operation getOperation() {
        return operation;
    }

    /**
     * Sets the business object.
     *
     * @param businessObject the new business object
     */
    public void setBusinessObject(BusinessObject businessObject) {
        this.businessObject = businessObject;
    }

    /**
     * Sets the operation.
     *
     * @param operation the new operation
     */
    public void setOperation(Operation operation) {
        this.operation = operation;
    }
 
}
