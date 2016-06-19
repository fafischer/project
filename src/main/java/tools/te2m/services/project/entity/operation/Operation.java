/*
* Operation.java
*   
* Copyright 2009 - 2016 Frank Fischer (email: frank@te2m.de)
*
* This file is part of the project project which is a sub project of temtools 
* (http://temtools.sf.net).
* 
*/
package tools.te2m.services.project.entity.operation;

import java.util.Set;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;
import tools.te2m.services.project.entity.AbstractNamedEntity;
import tools.te2m.services.project.entity.requirement.Persona;
import tools.te2m.services.project.entity.requirement.UseCase;

/**
 * The Class Operation.
 *
 * @author ffi
 */
@NodeEntity
public class Operation extends AbstractNamedEntity {

    /**
     * The Constant RELATIONSHIP_HAS_PARAMETER.
     */
    public static final String RELATIONSHIP_HAS_PARAMETER = "HAS_PARAMETER";
    
    /**
     * The Constant RELATIONSHIP_RETURNS_RESPONSE.
     */
    public static final String RELATIONSHIP_RETURNS_RESPONSE = "RETURNS_RESPONSE";
    
    /**
     * The Constant RELATIONSHIP_RAISES_ERROR.
     */
    public static final String RELATIONSHIP_RAISES_ERROR = "RAISES_ERROR";
}
