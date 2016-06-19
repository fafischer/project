/*
* HasRequirements.java
*   
* Copyright 2009 - 2016 Frank Fischer (email: frank@te2m.de)
*
* This file is part of the project project which is a sub project of temtools 
* (http://temtools.sf.net).
* 
*/
package tools.te2m.services.project.entity.project;

import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;
import tools.te2m.services.project.entity.AbstractEntity;
import tools.te2m.services.project.entity.requirement.UseCase;

/**
 * The Class HasRequirements.
 *
 * @author ffi
 */
@RelationshipEntity(type = Project.RELATIONSHIP_REQUIRES)
public class HasRequirements extends AbstractEntity{
    
    /**
     * The project.
     */
    @StartNode
    private Project project;
    
    /**
     * The usecase.
     */
    @EndNode
    private UseCase usecase;


    /**
     * Gets the project.
     *
     * @return the project
     */
    public Project getProject() {
        return project;
    }

    /**
     * Sets the project.
     *
     * @param project the new project
     */
    public void setProject(Project project) {
        this.project = project;
    }

    /**
     * Gets the usecase.
     *
     * @return the usecase
     */
    public UseCase getUsecase() {
        return usecase;
    }

    /**
     * Sets the usecase.
     *
     * @param usecase the new usecase
     */
    public void setUsecase(UseCase usecase) {
        this.usecase = usecase;
    }
        
   
}
