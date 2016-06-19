/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools.te2m.services.project.entity.comment;

import org.neo4j.ogm.annotation.NodeEntity;
import tools.te2m.services.project.entity.AbstractNamedEntity;

/**
 *
 * @author ffi
 */
@NodeEntity
public class Comment extends AbstractNamedEntity {

    public static final String RELATIONSHIP_HAS_PARAMETER = "HAS_PARAMETER";

}
