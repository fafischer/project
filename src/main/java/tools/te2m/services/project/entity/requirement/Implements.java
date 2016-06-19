/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools.te2m.services.project.entity.requirement;

import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;
import tools.te2m.services.project.entity.AbstractEntity;

/**
 *
 * @author ffi
 */
@RelationshipEntity(type = "IMPLEMENTS")
public class Implements extends AbstractEntity{

    @StartNode
    private UseCase source;
    
    @EndNode
    private UseCase target;

    public UseCase getSource() {
        return source;
    }

    public void setSource(UseCase source) {
        this.source = source;
    }

    public UseCase getTarget() {
        return target;
    }

    public void setTarget(UseCase target) {
        this.target = target;
    }
    
    
    
}
