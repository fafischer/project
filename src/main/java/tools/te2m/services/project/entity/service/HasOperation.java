/*
* HasOperation.java
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
import tools.te2m.services.project.entity.operation.Operation;


/**
 * The Class HasOperation.
 *
 * @author frank
 * @version 1.0
 * @since 1.0
 */
@RelationshipEntity(type = Service.RELATIONSHIP_OPERATION)
public class HasOperation extends AbstractEntity{

    /**
     * The servicet.
     */
    @StartNode
    private Service servicet;
    
    /**
     * The operation.
     */
    @EndNode
    private Operation operation;

    /**
     * Gets the servicet.
     *
     * @return the servicet
     */
    public Service getServicet() {
        return servicet;
    }

    /**
     * Sets the servicet.
     *
     * @param servicet the new servicet
     */
    public void setServicet(Service servicet) {
        this.servicet = servicet;
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
     * Sets the operation.
     *
     * @param operation the new operation
     */
    public void setOperation(Operation operation) {
        this.operation = operation;
    }
 
}
