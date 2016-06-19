package tools.te2m.services.project.entity.service;

import tools.te2m.services.project.entity.bo.*;
import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;
import tools.te2m.services.project.entity.AbstractEntity;
import tools.te2m.services.project.entity.operation.Operation;


@RelationshipEntity(type = Service.RELATIONSHIP_OPERATION)
public class HasOperation extends AbstractEntity{

    @StartNode
    private Service servicet;
    
    @EndNode
    private Operation operation;

    public Service getServicet() {
        return servicet;
    }

    public void setServicet(Service servicet) {
        this.servicet = servicet;
    }

    
    
    public Operation getOperation() {
        return operation;
    }

    public void setOperation(Operation operation) {
        this.operation = operation;
    }
 
}
