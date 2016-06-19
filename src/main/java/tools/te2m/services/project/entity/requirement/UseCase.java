/*
* UseCase.java
*   
* Copyright 2009 - 2016 Frank Fischer (email: frank@te2m.de)
*
* This file is part of the project project which is a sub project of temtools 
* (http://temtools.sf.net).
* 
*/
package tools.te2m.services.project.entity.requirement;

import java.util.HashSet;
import java.util.Set;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;
import tools.te2m.services.project.entity.AbstractNamedEntity;

/**
 * The Class UseCase.
 *
 * @author ffi
 */
@NodeEntity
public class UseCase extends AbstractNamedEntity<UseCase> {
    
    /**
     * The Constant RELATIONSHIP_INCLUDES.
     */
    public static final String RELATIONSHIP_INCLUDES = "INCLUDES";
    
    /**
     * The Constant RELATIONSHIP_EXTENDS.
     */
    public static final String RELATIONSHIP_EXTENDS = "EXTENDS";

    /**
     * Creates the.
     *
     * @return the use case
     */
    public static UseCase create(){
        return new UseCase();
    }

    /**
     * The included usecases.
     */
    @Relationship(type = RELATIONSHIP_INCLUDES)
    private Set<UseCase> includedUsecases;
    
    /**
     * The extended use case.
     */
    @Relationship(type = RELATIONSHIP_EXTENDS)
    private UseCase extendedUseCase;
    
    /**
     * Adds the included use case.
     *
     * @param usecase the usecase
     */
    public void addIncludedUseCase(UseCase usecase) {
        getIncludedUsecases().add(usecase);
    }

    /**
     * Extend.
     *
     * @param usecase the usecase
     * @return the use case
     */
    public UseCase extend(UseCase usecase) {
        setExtendedUseCase(usecase);
        return this;
    }

    /**
     * Gets the extended use case.
     *
     * @return the extended use case
     */
    public UseCase getExtendedUseCase() {
        return extendedUseCase;
    }

    /**
     * Gets the included usecases.
     *
     * @return the included usecases
     */
    public Set<UseCase> getIncludedUsecases() {
        if (null == this.includedUsecases) {
            this.includedUsecases = new HashSet<>();
        }
        return includedUsecases;
    }

    /**
     * Includes.
     *
     * @param usecase the usecase
     * @return the use case
     */
    public UseCase includes(UseCase usecase) {
        addIncludedUseCase(usecase);
        return this;
    }

    /**
     * Sets the extended use case.
     *
     * @param extendedUseCase the new extended use case
     */
    public void setExtendedUseCase(UseCase extendedUseCase) {
        this.extendedUseCase = extendedUseCase;
    }
    
    
    /**
     * Sets the included usecases.
     *
     * @param usecases the new included usecases
     */
    public void setIncludedUsecases(Set<UseCase> usecases) {
        this.includedUsecases = usecases;
    }
}
