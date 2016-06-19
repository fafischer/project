package tools.te2m.services.project.entity.project;

import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;
import tools.te2m.services.project.entity.AbstractEntity;
import tools.te2m.services.project.entity.bo.BusinessObject;
import tools.te2m.services.project.entity.requirement.Persona;

/**
 *
 * @author ffi
 */
@RelationshipEntity(type = Project.RELATIONSHIP_KNOWS_BO)
public class KnowsBusinessobject extends AbstractEntity{


    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }
    @StartNode
    private Project project;
    
    @EndNode
    private BusinessObject bo;

    public BusinessObject getBo() {
        return bo;
    }

    public void setBo(BusinessObject bo) {
        this.bo = bo;
    }
}
