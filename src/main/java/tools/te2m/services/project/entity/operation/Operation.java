/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools.te2m.services.project.entity.operation;

import java.util.Set;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;
import tools.te2m.services.project.entity.AbstractNamedEntity;
import tools.te2m.services.project.entity.requirement.Persona;
import tools.te2m.services.project.entity.requirement.UseCase;

/**
 *
 * @author ffi
 */
@NodeEntity
public class Operation extends AbstractNamedEntity {

    public static final String RELATIONSHIP_HAS_PARAMETER = "HAS_PARAMETER";
    
    public static final String RELATIONSHIP_RETURNS_RESPONSE = "RETURNS_RESPONSE";
    
    public static final String RELATIONSHIP_RAISES_ERROR = "RAISES_ERROR";
}
