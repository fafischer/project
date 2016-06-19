package tools.te2m.services.project.entity.bo;

import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;
import tools.te2m.services.project.entity.AbstractEntity;
import tools.te2m.services.project.entity.operation.Operation;


@RelationshipEntity(type = BusinessObject.RELATIONSHIP_OPERATION)
public class HasOperation extends AbstractEntity{

    @StartNode
    private BusinessObject businessObject;
    
    @EndNode
    private Operation operation;

    public BusinessObject getBusinessObject() {
        return businessObject;
    }

    public void setBusinessObject(BusinessObject businessObject) {
        this.businessObject = businessObject;
    }

    public Operation getOperation() {
        return operation;
    }

    public void setOperation(Operation operation) {
        this.operation = operation;
    }
 
}
