package tools.te2m.services.project.entity.requirement;

import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;
import tools.te2m.services.project.entity.AbstractEntity;

@RelationshipEntity(type = Persona.RELATIONSHIP_WANTS_TO)
public class WantsTo extends AbstractEntity{

    @StartNode
    private Persona persone;
    
    @EndNode
    private UseCase usecase;
    public UseCase getUsecase() {
        return usecase;
    }
    public void setUsecase(UseCase usecase) {
        this.usecase = usecase;
    }

    public Persona getPersone() {
        return persone;
    }

    public void setPersone(Persona persone) {
        this.persone = persone;
    }
    
    
    
}
