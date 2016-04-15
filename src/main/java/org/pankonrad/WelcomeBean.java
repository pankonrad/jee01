package org.pankonrad;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.pankonrad.dao.PersonDaoImpl;
import org.pankonrad.model.Person;

@Named(value="welcomeBean")
@SessionScoped
public class WelcomeBean implements Serializable {

	@Inject
	private PersonDaoImpl personDao;
	private static final long serialVersionUID = 7031192775476636021L;
	private String txt = "ala ma kota";
	private String name = "";
	List<Person> persons;

	public String refresh() {
		persons = personDao.list();
		return null;
	}
	
	public List<Person> getPersons() {
		return persons;
	}

	public void setPersons(List<Person> persons) {
		this.persons = persons;
	}
	

	public String getTxt() {
		return txt;
	}

	public void setTxt(String txt) {
		this.txt = txt;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
