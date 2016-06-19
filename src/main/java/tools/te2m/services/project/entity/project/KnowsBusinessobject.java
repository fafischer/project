/*
* KnowsBusinessobject.java
*   
* Copyright 2009 - 2016 Frank Fischer (email: frank@te2m.de)
*
* This file is part of the project project which is a sub project of temtools 
* (http://temtools.sf.net).
* 
*/
package tools.te2m.services.project.entity.project;

import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;
import tools.te2m.services.project.entity.AbstractEntity;
import tools.te2m.services.project.entity.bo.BusinessObject;
import tools.te2m.services.project.entity.requirement.Persona;

/**
 * The Class KnowsBusinessobject.
 *
 * @author ffi
 */
@RelationshipEntity(type = Project.RELATIONSHIP_KNOWS_BO)
public class KnowsBusinessobject extends AbstractEntity{


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
     * The project.
     */
    @StartNode
    private Project project;
    
    /**
     * The bo.
     */
    @EndNode
    private BusinessObject bo;

    /**
     * Gets the bo.
     *
     * @return the bo
     */
    public BusinessObject getBo() {
        return bo;
    }

    /**
     * Sets the bo.
     *
     * @param bo the new bo
     */
    public void setBo(BusinessObject bo) {
        this.bo = bo;
    }
}
