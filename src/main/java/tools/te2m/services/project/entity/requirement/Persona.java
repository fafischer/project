package tools.te2m.services.project.entity.requirement;

import java.util.HashSet;
import java.util.Set;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;
import tools.te2m.services.project.entity.AbstractNamedEntity;

@NodeEntity
public class Persona extends AbstractNamedEntity<Persona> {

    public static final String RELATIONSHIP_WANTS_TO = "WANTS_TO";

    @Relationship(type = RELATIONSHIP_WANTS_TO)

    private Set<UseCase> usecases;

    public static Persona create(){
        return new Persona();
    }
    
    public Set<UseCase> getUsecases() {
        if (null == this.usecases) {
            this.usecases = new HashSet<>();
        }
        return usecases;
    }

    public void setUsecases(Set<UseCase> usecases) {
        this.usecases = usecases;
    }

    public void addUseCase(UseCase usecase) {
        getUsecases().add(usecase);
    }

    public Persona wantsTo(UseCase usecase) {
        addUseCase(usecase);
        return this;
    }
}
