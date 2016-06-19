/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
 *
 * @author ffi
 */
@RelationshipEntity(type = Project.RELATIONSHIP_KNOWS_PERSONA)
public class KnowsPersona extends AbstractEntity{


    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }
    @StartNode
    private Project project;
    
    @EndNode
    private Persona persona;

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    
    
    
}
