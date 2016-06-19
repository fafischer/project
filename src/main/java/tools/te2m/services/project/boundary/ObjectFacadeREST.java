/*
* ObjectFacadeREST.java
*   
* Copyright 2009 - 2016 Frank Fischer (email: frank@te2m.de)
*
* This file is part of the project project which is a sub project of temtools 
* (http://temtools.sf.net).
* 
*/
package tools.te2m.services.project.boundary;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * The Class ObjectFacadeREST.
 *
 * @author ffi
 */
@Stateless
@Path("object")
public class ObjectFacadeREST{

    /**
     * Creates the.
     *
     * @param entity the entity
     */
    @POST
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void create(Object entity) {
        //super.create(entity);
    }

    /**
     * Edits the.
     *
     * @param id the id
     * @param entity the entity
     */
    @PUT
    @Path("{id}")
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void edit(@PathParam("id") Long id, Object entity) {
        //super.edit(entity);
    }

    /**
     * Removes the.
     *
     * @param id the id
     */
    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") Long id) {
        //super.remove(super.find(id));
    }

    /**
     * Find.
     *
     * @param id the id
     * @return the object
     */
    @GET
    @Path("{id}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public Object find(@PathParam("id") Long id) {
        return null;
    }

    /**
     * Find all.
     *
     * @return the list
     */
    @GET
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<Object> findAll() {
        return null;
    }
/*
    @GET
    @Path("{from}/{to}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<Object> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
        return null;
    }
*/
    /**
 * Count rest.
 *
 * @return the string
 */
@GET
    @Path("count")
    @Produces(MediaType.TEXT_PLAIN)
    public String countREST() {
        return "0";
    }

    
}
