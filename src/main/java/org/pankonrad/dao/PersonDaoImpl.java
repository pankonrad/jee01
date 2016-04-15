package org.pankonrad.dao;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.pankonrad.model.Person;

/**
 * Session Bean implementation class PersonDaoImpl
 */
@Stateless(mappedName = "personDao")
@LocalBean
public class PersonDaoImpl {
	@Inject
	private EntityManager em;	

	public PersonDaoImpl() {
    	
    }

	public List<Person> list() {
    	String sqlQuery = "from Person";
    	Query personQuery = em.createQuery(sqlQuery);
    	@SuppressWarnings("unchecked")
		List<Person> personList = personQuery.getResultList();
    	
    	return personList;
    }
    
	
    public EntityManager getEm() {
		return em;
	}
	

	public void setEm(EntityManager em) {
		this.em = em;
	}
}
