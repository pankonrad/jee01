package org.pankonrad.util;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@ApplicationScoped
public class Resources {
	   @Produces
	   @PersistenceContext
	   private EntityManager em;
	   
//	   @Produces
//	   @RequestScoped
//	   public FacesContext produceFacesContext() {
//	      return FacesContext.getCurrentInstance();
//	   }
	}
