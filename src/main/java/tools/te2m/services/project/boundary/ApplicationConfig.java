/*
* ApplicationConfig.java
*   
* Copyright 2009 - 2016 Frank Fischer (email: frank@te2m.de)
*
* This file is part of the project project which is a sub project of temtools 
* (http://temtools.sf.net).
* 
*/
package tools.te2m.services.project.boundary;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 * The Class ApplicationConfig.
 *
 * @author ffi
 */
@javax.ws.rs.ApplicationPath("api")
public class ApplicationConfig extends Application {

    /**
     * Do not modify addRestResourceClasses() method.
     * It is automatically populated with
     * all resources defined in the project.
     * If required, comment out calling this method in getClasses().
     *
     * @param resources the resources
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(tools.te2m.services.project.boundary.project.ProjectFacadeREST.class);
    }

    /* (non-Javadoc)
     * @see javax.ws.rs.core.Application#getClasses()
     */
    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }
    
}
