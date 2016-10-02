/*
* Comment.java
*   
* Copyright 2009 - 2016 Frank Fischer (email: frank@te2m.de)
*
* This file is part of the project project which is a sub project of temtools 
* (http://temtools.sf.net).
* 
*/
package tools.te2m.services.project.entity.comment;

import org.neo4j.ogm.annotation.NodeEntity;
import tools.te2m.services.project.entity.AbstractNamedEntity;

/**
 * The Class Comment.
 *
 * @author ffi
 */
@NodeEntity
public class Comment extends AbstractNamedEntity {

    public static final String RELATIONSHIP_HAS_REPLIES = "HAS_REPLIES";

}
