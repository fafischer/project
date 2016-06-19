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

@Stateless
@Path("project")
public class ProjectFacadeREST {

    private ProjectController controller = new ProjectController();

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

    @GET
    @Path("{id}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public Project find(@PathParam("id") Long id) {
        return controller.find(id);
    }

    @GET
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<Project> findAll() {
        return null;
        //Arrays.asList(controller.findAll().);
    }

    /*
    @GET
    @Path("{from}/{to}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<Project> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
        return null;
    }
     */
    @GET
    @Path("count")
    @Produces(MediaType.TEXT_PLAIN)
    public String countREST() {
        return "0";
    }

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

    public static ProjectVO toVO(Project project) {

        if (null == project) {
            return null;
        }

        ProjectVO projectVO = new ProjectVO();

        return projectVO;
    }

}
