/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
 *
 * @author ffi
 */
@RelationshipEntity(type = "FULLFILLS")
public class Fullfills extends AbstractEntity{
    
    @StartNode
    private UseCase usecase;
    
    @EndNode
    private NonfunctionalRequirement nonfunctionalRequirement;

    public UseCase getUsecase() {
        return usecase;
    }

    public void setUsecase(UseCase usecase) {
        this.usecase = usecase;
    }

    public NonfunctionalRequirement getNonfunctionalRequirement() {
        return nonfunctionalRequirement;
    }

    public void setNonfunctionalRequirement(NonfunctionalRequirement nonfunctionalRequirement) {
        this.nonfunctionalRequirement = nonfunctionalRequirement;
    }

    
    
    
}
