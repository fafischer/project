package tools.te2m.services.project.entity.comment;

import tools.te2m.services.project.entity.bo.*;
import tools.te2m.services.project.entity.project.*;
import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;
import tools.te2m.services.project.entity.AbstractEntity;


@RelationshipEntity(type = Comment.RELATIONSHIP_HAS_REPLIES)
public class HasReplies extends AbstractEntity{

    @StartNode
    private Comment srcComment;
    
    /**
     * The attribute.
     */
    @EndNode
    private Comment reply;

    public Comment getSrcComment() {
        return srcComment;
    }

    public void setSrcComment(Comment srcComment) {
        this.srcComment = srcComment;
    }

    public Comment getReply() {
        return reply;
    }

    public void setReply(Comment reply) {
        this.reply = reply;
    }

}
