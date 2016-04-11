package org.pankonrad.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Entity implementation class for Entity: Person
 *
 */
@Entity

public class Person implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	@Column(name="id")
	private Long id;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	public Person() {
		super();
	}
	
	public Long getId() {
		return id;
	}
	


	public void setId(Long id) {
		this.id = id;
	}
	


	public String getFirstName() {
		return firstName;
	}
	


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	


	public String getLastName() {
		return lastName;
	}
	


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	@Override
	public String toString() {
		return "Person [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
}
