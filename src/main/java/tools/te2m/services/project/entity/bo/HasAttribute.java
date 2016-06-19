package tools.te2m.services.project.entity.bo;

import tools.te2m.services.project.entity.project.*;
import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;
import tools.te2m.services.project.entity.AbstractEntity;


@RelationshipEntity(type = BusinessObject.RELATIONSHIP_ATTRIBUTE)
public class HasAttribute extends AbstractEntity{

    @StartNode
    private BusinessObject businessObject;
    
    @EndNode
    private BusinessObject attribute;

    public BusinessObject getBusinessObject() {
        return businessObject;
    }

    public void setBusinessObject(BusinessObject businessObject) {
        this.businessObject = businessObject;
    }
 
    public BusinessObject getAttribute() {
        return attribute;
    }

    public void setAttribute(BusinessObject attr) {
        this.attribute = attr;
    }
}
