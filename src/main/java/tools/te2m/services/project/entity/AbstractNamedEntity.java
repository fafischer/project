/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools.te2m.services.project.entity;

/**
 *
 * @author ffi
 */
public abstract class AbstractNamedEntity<T extends AbstractNamedEntity<T>> extends AbstractEntity {
    private String name;
    private String description;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public T withName(String name) {
        this.name = name;
        return (T)this;
    }

    public T withDescription(String description) {
        this.description = description;
        return (T)this;
    }

    
}
