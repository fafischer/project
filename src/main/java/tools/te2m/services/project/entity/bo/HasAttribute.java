/*
* HasAttribute.java
*   
* Copyright 2009 - 2016 Frank Fischer (email: frank@te2m.de)
*
* This file is part of the project project which is a sub project of temtools 
* (http://temtools.sf.net).
* 
*/
package tools.te2m.services.project.entity.bo;

import tools.te2m.services.project.entity.project.*;
import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;
import tools.te2m.services.project.entity.AbstractEntity;


/**
 * The Class HasAttribute.
 *
 * @author frank
 * @version 1.0
 * @since 1.0
 */
@RelationshipEntity(type = BusinessObject.RELATIONSHIP_ATTRIBUTE)
public class HasAttribute extends AbstractEntity{

    /**
     * The business object.
     */
    @StartNode
    private BusinessObject businessObject;
    
    /**
     * The attribute.
     */
    @EndNode
    private BusinessObject attribute;

    /**
     * Gets the business object.
     *
     * @return the business object
     */
    public BusinessObject getBusinessObject() {
        return businessObject;
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
     * Gets the attribute.
     *
     * @return the attribute
     */
    public BusinessObject getAttribute() {
        return attribute;
    }

    /**
     * Sets the attribute.
     *
     * @param attr the new attribute
     */
    public void setAttribute(BusinessObject attr) {
        this.attribute = attr;
    }
}
