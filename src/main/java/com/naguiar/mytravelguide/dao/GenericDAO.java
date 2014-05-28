/**
 * 
 */
package com.naguiar.mytravelguide.dao;

/**
 * @author naty
 *
 */
public interface GenericDAO<T> {
	
	T create(T t);

    void delete(Object id);

    T find(Object id);

    T update(T t);
    
}
