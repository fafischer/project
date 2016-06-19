/*
* AbstractNamedEntity.java
*   
* Copyright 2009 - 2016 Frank Fischer (email: frank@te2m.de)
*
* This file is part of the project project which is a sub project of temtools 
* (http://temtools.sf.net).
* 
*/
package tools.te2m.services.project.entity;

/**
 * The Class AbstractNamedEntity.
 *
 * @author ffi
 * @param <T> the generic type
 */
public abstract class AbstractNamedEntity<T extends AbstractNamedEntity<T>> extends AbstractEntity {
    
    /**
     * The name.
     */
    private String name;
    
    /**
     * The description.
     */
    private String description;


    /**
     * Gets the name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name.
     *
     * @param name the new name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the description.
     *
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the description.
     *
     * @param description the new description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * With name.
     *
     * @param name the name
     * @return the t
     */
    public T withName(String name) {
        this.name = name;
        return (T)this;
    }

    /**
     * With description.
     *
     * @param description the description
     * @return the t
     */
    public T withDescription(String description) {
        this.description = description;
        return (T)this;
    }

    
}
