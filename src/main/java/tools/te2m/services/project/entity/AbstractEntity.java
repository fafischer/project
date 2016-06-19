/*
* AbstractEntity.java
*   
* Copyright 2009 - 2016 Frank Fischer (email: frank@te2m.de)
*
* This file is part of the project project which is a sub project of temtools 
* (http://temtools.sf.net).
* 
*/
package tools.te2m.services.project.entity;

/**
 * The Class AbstractEntity.
 *
 * @author ffi
 */
public class AbstractEntity {
    
    /**
     * The id.
     */
    protected Long id;

    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || id == null || getClass() != o.getClass()) {
            return false;
        }
        AbstractNamedEntity entity = (AbstractNamedEntity) o;
        if (!id.equals(entity.id)) {
            return false;
        }
        return true;
    }

    /**
     * Gets the id.
     *
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        return (id == null) ? -1 : id.hashCode();
    }

    /**
     * Sets the id.
     *
     * @param id the new id
     */
    public void setId(Long id) {
        this.id = id;
    }
    
}
