package tools.te2m.services.project.entity.project;

import org.junit.Test;
import static org.junit.Assert.*;
import tools.te2m.services.project.entity.bo.BusinessObject;
import tools.te2m.services.project.entity.project.Project;
import tools.te2m.services.project.entity.requirement.Persona;
import tools.te2m.services.project.entity.requirement.UseCase;
import tools.te2m.services.project.entity.system.SystemInformation;

public class ProjectTest {

    @Test
    public void testGettersForCollectionsNeverReturnNull() {
        // must never return null
        Project p1 = new Project();
        assertNotNull("Get Usecases must not return null", p1.getUsecases());
        assertNotNull("GetBOs must not return null", p1.getBusinessObjects());
        assertNotNull("Get Personas must not return null", p1.getPersonas());
        assertNotNull("GetSystems must not return null", p1.getSystems());
    }

    @Test
    public void testFluentCreation() {
        // must never return null
        Project p1 = Project.create().withName("Name")
                .withDescription("Description")
                .requires(UseCase.create())
                .knowsBusinessOnject(BusinessObject.create())
                .knowsSystem(SystemInformation.create())
                .knowsPersona(Persona.create());

        assertEquals(p1.getDescription(), "Description");
        assertEquals(p1.getName(), "Name");
        assertEquals("Wrong number of personas returned ", 1, p1.getPersonas().size());
        assertEquals("Wrong number of usecases returned ", 1, p1.getUsecases().size());
        assertEquals("Wrong number of systems returned ", 1, p1.getSystems().size());
        assertEquals("Wrong number of BOs returned ", 1, p1.getBusinessObjects().size());
    }
}
