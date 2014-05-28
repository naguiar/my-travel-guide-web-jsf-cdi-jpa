/**
 * 
 */
package com.naguiar.mytravelguide.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * @author naty
 *
 */
public class JPAUtil {
	
	private static EntityManagerFactory factory = Persistence.createEntityManagerFactory("mytravelguide");
	
	public EntityManager getEntityManager(){
		return factory.createEntityManager();
	}
}
