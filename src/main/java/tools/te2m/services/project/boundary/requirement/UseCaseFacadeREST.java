package tools.te2m.services.project.boundary.requirement;

import tools.te2m.services.project.boundary.project.*;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import tools.te2m.services.project.controller.project.ProjectController;
import tools.te2m.services.project.controller.requirement.UseCaseController;
import tools.te2m.services.project.entity.project.Project;
import tools.te2m.services.project.entity.requirement.UseCase;

/**
 * The Class ProjectFacadeREST.
 *
 * @author frank
 * @version 1.0
 * @since 1.0
 */
@Stateless
@Path("usecase")
public class UseCaseFacadeREST {

    /**
     * Maps a UseCase entity based on a UseCaseVO
     *
     * @param pvo the pvo
     * @return the UseCase
     */
    public static UseCase fromVO(UseCaseVO pvo) {
        if (null == pvo) {
            return null;
        }

        UseCase uc = UseCase.create()
                .withName(pvo.getName())
                .withDescription(pvo.getDescription());

        uc.setId(pvo.getId());

        return uc;
    }

    /**
     * Creates a ProjectVO based on an Project entity
     *
     * @param uc The UseCase
     * @return the uc vo
     */
    public static UseCaseVO toVO(UseCase uc) {

        if (null == uc) {
            return null;
        }

        UseCaseVO ucVO = new UseCaseVO();

        ucVO.setName(uc.getName());
        ucVO.setDescription(uc.getDescription());
        ucVO.setId(uc.getId());
        
        return ucVO;
    }

    /**
     * The controller.
     */
    @Inject
    private UseCaseController controller;// = new ProjectController();


    /**
     * Creates a uc.
     *
     * @param entity the entity
     * @return the response
     */
    @POST
    @Consumes({MediaType.APPLICATION_JSON})
    public Response create(UseCaseVO entity) {

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
    @Consumes({MediaType.APPLICATION_JSON})
    public Response edit(@PathParam("id") Long id, UseCaseVO entity) {
        if (null == id) {
            return Response.status(Response.Status.BAD_REQUEST).build();
        }
        if (null == controller.find(id)) {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
        controller.createOrUpdate(fromVO(entity));
        
        return Response.ok().build();
    }

    /**
     * Find.
     *
     * @param id the id
     * @return the uc
     */
    @GET
    @Path("{id}")
    @Produces({MediaType.APPLICATION_JSON})
    public Response find(@PathParam("id") Long id) {
        
        if (null == id) {
            return Response.status(Response.Status.BAD_REQUEST).build();
        }
        
        UseCase uc = controller.find(id);
        
        if (null ==  uc){
            return Response.status(Response.Status.NOT_FOUND).build();
        }
        
        return Response.ok(toVO(uc)).build();
    }

    /**
     * Find all.
     *
     * @return the list
     */
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public Response findAll() {
       
        List<UseCaseVO> resultList = new ArrayList<>();
        
        for(UseCase uc: controller.findAll())
        {
            resultList.add(toVO(uc));
        }
        
        GenericEntity<List<UseCaseVO>> list = new GenericEntity<List<UseCaseVO>>(resultList) { };
        return Response.ok(list).build();
    }
    
    @GET
    @Path("ping")
    @Produces(MediaType.TEXT_PLAIN)
    public Response ping()
    {
        return Response.ok("OK").build();
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
