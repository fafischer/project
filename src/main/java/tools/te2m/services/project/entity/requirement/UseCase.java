/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools.te2m.services.project.entity.requirement;

import java.util.HashSet;
import java.util.Set;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;
import tools.te2m.services.project.entity.AbstractNamedEntity;

/**
 *
 * @author ffi
 */
@NodeEntity
public class UseCase extends AbstractNamedEntity<UseCase> {
    public static final String RELATIONSHIP_INCLUDES = "INCLUDES";
    public static final String RELATIONSHIP_EXTENDS = "EXTENDS";

    @Relationship(type = RELATIONSHIP_INCLUDES)
    private Set<UseCase> includedUsecases;

    @Relationship(type = RELATIONSHIP_EXTENDS)
    private UseCase extendedUseCase;
    
    public static UseCase create(){
        return new UseCase();
    }
    
    public Set<UseCase> getIncludedUsecases() {
        if (null == this.includedUsecases) {
            this.includedUsecases = new HashSet<>();
        }
        return includedUsecases;
    }

    public void setIncludedUsecases(Set<UseCase> usecases) {
        this.includedUsecases = usecases;
    }

    public void addIncludedUseCase(UseCase usecase) {
        getIncludedUsecases().add(usecase);
    }

    public UseCase getExtendedUseCase() {
        return extendedUseCase;
    }

    public void setExtendedUseCase(UseCase extendedUseCase) {
        this.extendedUseCase = extendedUseCase;
    }

    public UseCase extend(UseCase usecase) {
        setExtendedUseCase(usecase);
        return this;
    }
    
    
    public UseCase includes(UseCase usecase) {
        addIncludedUseCase(usecase);
        return this;
    }
}
