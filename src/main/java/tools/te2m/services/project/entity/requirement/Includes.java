/*
* Includes.java
*   
* Copyright 2009 - 2016 Frank Fischer (email: frank@te2m.de)
*
* This file is part of the project project which is a sub project of temtools 
* (http://temtools.sf.net).
* 
*/
package tools.te2m.services.project.entity.requirement;

import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;
import tools.te2m.services.project.entity.AbstractEntity;

/**
 * The Class Includes.
 *
 * @author frank
 * @version 1.0
 * @since 1.0
 */
@RelationshipEntity(type = UseCase.RELATIONSHIP_INCLUDES)
public class Includes extends AbstractEntity{

    /**
     * The source.
     */
    @StartNode
    private UseCase source;
    
    /**
     * The target.
     */
    @EndNode
    private UseCase target;

    /**
     * Gets the source.
     *
     * @return the source
     */
    public UseCase getSource() {
        return source;
    }

    /**
     * Gets the target.
     *
     * @return the target
     */
    public UseCase getTarget() {
        return target;
    }

    /**
     * Sets the source.
     *
     * @param source the new source
     */
    public void setSource(UseCase source) {
        this.source = source;
    }

    /**
     * Sets the target.
     *
     * @param target the new target
     */
    public void setTarget(UseCase target) {
        this.target = target;
    }
}
