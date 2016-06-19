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
import tools.te2m.services.project.entity.requirement.UseCase;

/**
 *
 * @author ffi
 */
@RelationshipEntity(type = Project.RELATIONSHIP_REQUIRES)
public class HasRequirements extends AbstractEntity{
    @StartNode
    private Project project;
    @EndNode
    private UseCase usecase;


    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public UseCase getUsecase() {
        return usecase;
    }

    public void setUsecase(UseCase usecase) {
        this.usecase = usecase;
    }
        
   
}
