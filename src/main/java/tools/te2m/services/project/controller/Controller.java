/*
* Controller.java
*   
* Copyright 2009 - 2016 Frank Fischer (email: frank@te2m.de)
*
* This file is part of the project project which is a sub project of temtools 
* (http://temtools.sf.net).
* 
*/
package tools.te2m.services.project.controller;

/**
 * The Interface Controller.
 *
 * @author ffi
 * @param <T> the generic type
 */
public interface Controller<T> {

    /**
     * Find all.
     *
     * @return the iterable
     */
    Iterable<T> findAll();

    /**
     * Find.
     *
     * @param id the id
     * @return the t
     */
    T find(Long id);

    /**
     * Delete.
     *
     * @param id the id
     */
    void delete(Long id);

    /**
     * Creates the or update.
     *
     * @param object the object
     * @return the t
     */
    T createOrUpdate(T object);

}