/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools.te2m.services.project.entity.system;

import java.util.HashSet;
import java.util.Set;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;
import tools.te2m.services.project.entity.AbstractNamedEntity;
import tools.te2m.services.project.entity.service.Service;

/**
 *
 * @author ffi
 */
@NodeEntity
public class SystemInformation extends AbstractNamedEntity<SystemInformation> {

    public static final String RELATIONSHIP_PROVIDES = "PROVIDES";
    public static final String RELATIONSHIP_CONSUMES = "CONSUMES";

    public static SystemInformation create() {
        return new SystemInformation();
    }

    @Relationship(type = RELATIONSHIP_PROVIDES)
    private Set<Service> providedServices;

    @Relationship(type = RELATIONSHIP_CONSUMES)
    private Set<Service> consumedServices;

    public Set<Service> getProvidedServices() {
        if (null == this.providedServices) {
            this.providedServices= new HashSet<>();
        }
        return providedServices;
    }

    public void setProvidedServices(Set<Service> providedServices) {
        this.providedServices = providedServices;
    }

    public Set<Service> getConsumedServices() {
        if (null == this.consumedServices) {
            this.consumedServices= new HashSet<>();
        }
        return consumedServices;
    }

    public void setConsumedServices(Set<Service> consumedServices) {
        this.consumedServices = consumedServices;
    }

}
