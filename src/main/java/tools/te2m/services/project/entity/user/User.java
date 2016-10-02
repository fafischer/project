package tools.te2m.services.project.entity.user;

import java.util.HashSet;
import java.util.Set;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;
import tools.te2m.services.project.entity.AbstractNamedEntity;
import tools.te2m.services.project.entity.comment.Comment;
import tools.te2m.services.project.entity.requirement.UseCase;

@NodeEntity
public class User extends AbstractNamedEntity<User> {

    /**
     * The Constant RELATIONSHIP_COMMENTED.
     */
    public static final String RELATIONSHIP_COMMENTED = "HAS_COMMENTED";

    /**
     * The Constant RELATIONSHIP_REQUESTED.
     */
    public static final String RELATIONSHIP_REQUESTED = "HAS_REQUESTED";

    /**
     * The Constant RELATIONSHIP_APPROVED.
     */
    public static final String RELATIONSHIP_APPROVED = "HAS_APPROVED";

    /**
     * Creates the.
     *
     * @return the system information
     */
    public static User create() {
        return new User();
    }

    @Relationship(type = RELATIONSHIP_COMMENTED)
    private Set<Comment> comments;

    @Relationship(type = RELATIONSHIP_REQUESTED)
    private Set<UseCase> requestedUseCases;

    @Relationship(type = RELATIONSHIP_APPROVED)
    private Set<UseCase> approvedUseCases;

    public User requests(UseCase uc) {
        addRequestesUseCase(uc);
        return this;
    }

    public User approves(UseCase uc) {
        addApprovedUseCase(uc);
        return this;
    }

    public User comments(Comment comment) {
        addComment(comment);
        return this;
    }

    public Set<UseCase> getRequestedUseCases() {
        if (null == this.requestedUseCases) {
            this.requestedUseCases = new HashSet<>();
        }
        return requestedUseCases;
    }

    public Set<Comment> getComments() {
        if (null == this.comments) {
            this.comments = new HashSet<>();
        }
        return comments;
    }

    public void addComment(Comment comment) {
        if (null != comment) {
            getComments().add(comment);
        }
    }

    public void setComments(Set<Comment> newComments) {
        this.comments = newComments;
    }

    public void addRequestesUseCase(UseCase uc) {
        if (null != uc) {
            getRequestedUseCases().add(uc);
        }
    }

    public void addApprovedUseCase(UseCase uc) {
        if (null != uc) {
            getApprovedUseCases().add(uc);
        }

    }

    public Set<UseCase> getApprovedUseCases() {
        if (null == this.approvedUseCases) {
            this.approvedUseCases = new HashSet<>();
        }
        return this.approvedUseCases;
    }

}
