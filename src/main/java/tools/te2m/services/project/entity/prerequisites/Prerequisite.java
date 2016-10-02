package tools.te2m.services.project.entity.prerequisites;

import java.util.HashSet;
import java.util.Set;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;
import tools.te2m.services.project.entity.AbstractNamedEntity;
import tools.te2m.services.project.entity.requirement.UseCase;

/**
 * Prerequisite A prerequisite is required for realizing one or more usecases.
 *
 * @author ffischer
 */
@NodeEntity
public class Prerequisite extends AbstractNamedEntity<Prerequisite>{

    public static final String RELATIONSHIP_AFFECTS_USECASE = "AFFECTS";
    /**
     * The affected usecases.
     */
    @Relationship(type = RELATIONSHIP_AFFECTS_USECASE)
    private Set<UseCase> affectedUsecases;

    /**
     * Gets the affected usecases.
     */
    public Set<UseCase> getAffectedUsecases() {
        return affectedUsecases;
    }

    /**
     * Sets the affected usecases.
     *
     * @param affectedUsecases the new affected usecases
     */
    public void setAffectedUsecases(Set<UseCase> affectedUsecases) {
        this.affectedUsecases = affectedUsecases;
    }

    /**
     * Adds the affected usecase.
     *
     * @param u the u
     */
    public void addAffectedUsecase(UseCase u) {
        if (null == affectedUsecases) {
            affectedUsecases = new HashSet<UseCase>();

        }
        affectedUsecases.add(u);
    }
}
