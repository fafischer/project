/*
* ProjectFacadeREST.java
*   
* Copyright 2009 - 2016 Frank Fischer (email: frank@te2m.de)
*
* This file is part of the project project which is a sub project of temtools 
* (http://temtools.sf.net).
* 
*/
package tools.te2m.services.project.boundary.project;

import java.util.List;
import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import tools.te2m.services.project.controller.project.ProjectController;
import tools.te2m.services.project.entity.project.Project;

/**
 * The Class ProjectFacadeREST.
 *
 * @author frank
 * @version 1.0
 * @since 1.0
 */
@Stateless
@Path("project")
public class ProjectFacadeREST {

    /**
     * Maps a project entity based on a ProjectVO
     *
     * @param pvo the pvo
     * @return the project
     */
    public static Project fromVO(ProjectVO pvo) {
        if (null == pvo) {
            return null;
        }

        Project project = Project.create()
                .withName(pvo.getName())
                .withDescription(pvo.getDescription());

        project.setId(pvo.getId());

        return project;
    }

    /**
     * Creates a ProjectVO based on an Project entity
     *
     * @param project the project
     * @return the project vo
     */
    public static ProjectVO toVO(Project project) {

        if (null == project) {
            return null;
        }

        ProjectVO projectVO = new ProjectVO();

        return projectVO;
    }

    /**
     * The controller.
     */
    private ProjectController controller = new ProjectController();


    /**
     * Creates a project.
     *
     * @param entity the entity
     * @return the response
     */
    @POST
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public Response create(ProjectVO entity) {

         if (null == entity) {
            return Response.status(Response.Status.BAD_REQUEST).build();
        }
        if(null!=entity.getId()){
            return Response.status(Response.Status.CONFLICT).build();
        }
        controller.createOrUpdate(fromVO(entity));
        
        return Response.ok().build(); 
    }

    /**
     * Edits the.
     *
     * @param id the id
     * @param entity the entity
     * @return the response
     */
    @PUT
    @Path("{id}")
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public Response edit(@PathParam("id") Long id, Project entity) {
        if (null == id) {
            return Response.status(Response.Status.BAD_REQUEST).build();
        }
        if (null == controller.find(id)) {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
        controller.createOrUpdate(entity);
        
        return Response.ok().build();
    }

    /**
     * Find.
     *
     * @param id the id
     * @return the project
     */
    @GET
    @Path("{id}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public Project find(@PathParam("id") Long id) {
        return controller.find(id);
    }

    /**
     * Find all.
     *
     * @return the list
     */
    @GET
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<Project> findAll() {
        return null;
        //Arrays.asList(controller.findAll().);
    }

    /**
     * Removes the.
     *
     * @param id the id
     * @return the response
     */
    @DELETE
    @Path("{id}")
    public Response remove(@PathParam("id") Long id) {

        if (null == id) {
            return Response.status(Response.Status.BAD_REQUEST).build();
        }
        if (null == controller.find(id)) {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
        controller.delete(id);

        return Response.ok().build();
    }

}
