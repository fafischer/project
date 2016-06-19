/*
* KnowsSystem.java
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
import tools.te2m.services.project.entity.system.SystemInformation;

/**
 * The Class KnowsSystem.
 *
 * @author frank
 * @version 1.0
 * @since 1.0
 */
@RelationshipEntity(type = Project.RELATIONSHIP_KNOWS_SYSTEM)
public class KnowsSystem extends AbstractEntity {

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
     * The system.
     */
    @EndNode
    private SystemInformation system;

    /**
     * Gets the system.
     *
     * @return the system
     */
    public SystemInformation getSystem() {
        return system;
    }

    /**
     * Sets the system.
     *
     * @param system the new system
     */
    public void setSystem(SystemInformation system) {
        this.system = system;
    }
    
    

}
