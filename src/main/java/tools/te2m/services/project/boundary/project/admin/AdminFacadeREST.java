package tools.te2m.services.project.boundary.project.admin;

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
import tools.te2m.services.project.entity.project.Project;

@Stateless
@Path("admin")
public class AdminFacadeREST {

    @Inject
    ProjectController controller;
    
    @GET
    @Path("setup")
    public Response setup() {

        if (controller.findAll().iterator().hasNext()) {
            return Response.status(Response.Status.BAD_REQUEST).build();
        }
        Project defaultProject = Project.create().withName("Default Project").withDescription("Default Project");
        controller.createOrUpdate(defaultProject);
        return Response.ok().build();
    }

}
