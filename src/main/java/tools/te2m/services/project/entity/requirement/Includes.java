package tools.te2m.services.project.entity.requirement;

import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;
import tools.te2m.services.project.entity.AbstractEntity;

@RelationshipEntity(type = UseCase.RELATIONSHIP_INCLUDES)
public class Includes extends AbstractEntity{

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
