/*
* KnowsPersona.java
*   
* Copyright 2009 - 2016 Frank Fischer (email: frank@te2m.de)
*
* This file is part of the project project which is a sub project of temtools 
* (http://temtools.sf.net).
* 
*/
package tools.te2m.services.project.entity.project;

import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;
import tools.te2m.services.project.entity.AbstractEntity;
import tools.te2m.services.project.entity.requirement.Persona;
import tools.te2m.services.project.entity.requirement.UseCase;

/**
 * The Class KnowsPersona.
 *
 * @author ffi
 */
@RelationshipEntity(type = Project.RELATIONSHIP_KNOWS_PERSONA)
public class KnowsPersona extends AbstractEntity{


    /**
     * The project.
     */
    @StartNode
    private Project project;

    /**
     * The persona.
     */
    @EndNode
    private Persona persona;
    
    /**
     * Gets the persona.
     *
     * @return the persona
     */
    public Persona getPersona() {
        return persona;
    }
    
    /**
     * Gets the project.
     *
     * @return the project
     */
    public Project getProject() {
        return project;
    }

    /**
     * Sets the persona.
     *
     * @param persona the new persona
     */
    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    /**
     * Sets the project.
     *
     * @param project the new project
     */
    public void setProject(Project project) {
        this.project = project;
    }
    
    
    
}
