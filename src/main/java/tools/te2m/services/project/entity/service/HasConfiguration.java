package tools.te2m.services.project.entity.service;

import tools.te2m.services.project.entity.bo.*;
import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;
import tools.te2m.services.project.entity.AbstractEntity;


@RelationshipEntity(type = BusinessObject.RELATIONSHIP_ATTRIBUTE)
public class HasConfiguration extends AbstractEntity{

    @StartNode
    private Service service;
    
    @EndNode
    private BusinessObject configuration;

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public BusinessObject getConfiguration() {
        return configuration;
    }

    public void setConfiguration(BusinessObject configuration) {
        this.configuration = configuration;
    }
 
}
