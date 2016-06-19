/*
* Persona.java
*   
* Copyright 2009 - 2016 Frank Fischer (email: frank@te2m.de)
*
* This file is part of the project project which is a sub project of temtools 
* (http://temtools.sf.net).
* 
*/
package tools.te2m.services.project.entity.requirement;

import java.util.HashSet;
import java.util.Set;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;
import tools.te2m.services.project.entity.AbstractNamedEntity;

/**
 * The Class Persona.
 *
 * @author frank
 * @version 1.0
 * @since 1.0
 */
@NodeEntity
public class Persona extends AbstractNamedEntity<Persona> {

    /**
     * The Constant RELATIONSHIP_WANTS_TO.
     */
    public static final String RELATIONSHIP_WANTS_TO = "WANTS_TO";

    /**
     * The usecases.
     */
    @Relationship(type = RELATIONSHIP_WANTS_TO)

    private Set<UseCase> usecases;

    /**
     * Creates the.
     *
     * @return the persona
     */
    public static Persona create(){
        return new Persona();
    }
    
    /**
     * Gets the usecases.
     *
     * @return the usecases
     */
    public Set<UseCase> getUsecases() {
        if (null == this.usecases) {
            this.usecases = new HashSet<>();
        }
        return usecases;
    }

    /**
     * Sets the usecases.
     *
     * @param usecases the new usecases
     */
    public void setUsecases(Set<UseCase> usecases) {
        this.usecases = usecases;
    }

    /**
     * Adds the use case.
     *
     * @param usecase the usecase
     */
    public void addUseCase(UseCase usecase) {
        getUsecases().add(usecase);
    }

    /**
     * Wants to.
     *
     * @param usecase the usecase
     * @return the persona
     */
    public Persona wantsTo(UseCase usecase) {
        addUseCase(usecase);
        return this;
    }
}
