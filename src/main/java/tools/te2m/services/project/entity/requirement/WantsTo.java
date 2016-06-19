/*
* WantsTo.java
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
 * The Class WantsTo.
 *
 * @author frank
 * @version 1.0
 * @since 1.0
 */
@RelationshipEntity(type = Persona.RELATIONSHIP_WANTS_TO)
public class WantsTo extends AbstractEntity{

    /**
     * The persone.
     */
    @StartNode
    private Persona persone;
    
    /**
     * The usecase.
     */
    @EndNode
    private UseCase usecase;
    
    /**
     * Gets the usecase.
     *
     * @return the usecase
     */
    public UseCase getUsecase() {
        return usecase;
    }
    
    /**
     * Sets the usecase.
     *
     * @param usecase the new usecase
     */
    public void setUsecase(UseCase usecase) {
        this.usecase = usecase;
    }

    /**
     * Gets the persone.
     *
     * @return the persone
     */
    public Persona getPersone() {
        return persone;
    }

    /**
     * Sets the persone.
     *
     * @param persone the new persone
     */
    public void setPersone(Persona persone) {
        this.persone = persone;
    }
    
    
    
}
