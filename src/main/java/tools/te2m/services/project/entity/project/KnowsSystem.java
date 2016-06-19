package tools.te2m.services.project.entity.project;

import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;
import tools.te2m.services.project.entity.AbstractEntity;
import tools.te2m.services.project.entity.system.SystemInformation;

@RelationshipEntity(type = Project.RELATIONSHIP_KNOWS_SYSTEM)
public class KnowsSystem extends AbstractEntity {

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }
    @StartNode
    private Project project;

    @EndNode
    private SystemInformation system;

    public SystemInformation getSystem() {
        return system;
    }

    public void setSystem(SystemInformation system) {
        this.system = system;
    }
    
    

}
