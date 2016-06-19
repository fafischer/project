/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools.te2m.services.project.entity.system;

import tools.te2m.services.project.entity.requirement.*;
import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;
import tools.te2m.services.project.entity.AbstractEntity;
import tools.te2m.services.project.entity.service.Service;

/**
 *
 * @author ffi
 */
@RelationshipEntity(type = SystemInformation.RELATIONSHIP_PROVIDES)
public class Provides extends AbstractEntity{



    @StartNode
    private SystemInformation system;
    
    @EndNode
    private Service service;

    public SystemInformation getSystem() {
        return system;
    }

    public void setSystem(SystemInformation system) {
        this.system = system;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }    
}
