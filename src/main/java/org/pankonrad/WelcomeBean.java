package org.pankonrad;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named(value="welcomeBean")
@SessionScoped
public class WelcomeBean implements Serializable {

	private static final long serialVersionUID = 7031192775476636021L;
	private String txt = "ala ma kota";
	private String name = "";

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
