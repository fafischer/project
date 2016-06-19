/*
* Fullfills.java
*   
* Copyright 2009 - 2016 Frank Fischer (email: frank@te2m.de)
*
* This file is part of the project project which is a sub project of temtools 
* (http://temtools.sf.net).
* 
*/
package tools.te2m.services.project.entity.requirement;

import tools.te2m.services.project.entity.project.*;
import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;
import tools.te2m.services.project.entity.AbstractEntity;
import tools.te2m.services.project.entity.requirement.UseCase;

/**
 * The Class Fullfills.
 *
 * @author ffi
 */
@RelationshipEntity(type = "FULLFILLS")
public class Fullfills extends AbstractEntity{
    
    /**
     * The usecase.
     */
    @StartNode
    private UseCase usecase;
    
    /**
     * The nonfunctional requirement.
     */
    @EndNode
    private NonfunctionalRequirement nonfunctionalRequirement;

    /**
     * Gets the nonfunctional requirement.
     *
     * @return the nonfunctional requirement
     */
    public NonfunctionalRequirement getNonfunctionalRequirement() {
        return nonfunctionalRequirement;
    }

    /**
     * Gets the usecase.
     *
     * @return the usecase
     */
    public UseCase getUsecase() {
        return usecase;
    }

    /**
     * Sets the nonfunctional requirement.
     *
     * @param nonfunctionalRequirement the new nonfunctional requirement
     */
    public void setNonfunctionalRequirement(NonfunctionalRequirement nonfunctionalRequirement) {
        this.nonfunctionalRequirement = nonfunctionalRequirement;
    }

    /**
     * Sets the usecase.
     *
     * @param usecase the new usecase
     */
    public void setUsecase(UseCase usecase) {
        this.usecase = usecase;
    }

    
    
    
}
