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

import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ws.rs.core.Application;

/**
 * The Class ApplicationConfig.
 *
 * @author ffi
 */
@javax.ws.rs.ApplicationPath("api")
public class ApplicationConfig extends Application {

    private static final Logger log = java.util.logging.Logger.getLogger(ApplicationConfig.class.getName());

    /*
    @Override
    public Set<Object> getSingletons() {
        Set<Object> set = new HashSet<>();
        log.log(Level.INFO, "Enabling custom Jackson JSON provider");
        set.add(new JacksonJsonProvider().configure(SerializationFeature.INDENT_OUTPUT, true));
        return set;
    }

    @Override
    public Map<String, Object> getProperties() {
        Map<String, Object> map = new HashMap<>();
        log.log(Level.INFO, "Disabling MOXy JSON provider");
        map.put("jersey.config.disableMoxyJson.server", true);
        return map;
    }
     */
 /* (non-Javadoc)
     * @see javax.ws.rs.core.Application#getClasses()
     */
    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }



    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(tools.te2m.services.project.boundary.project.ProjectFacadeREST.class);
    }
}
