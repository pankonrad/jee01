package org.pankonrad;

import javax.enterprise.inject.Model;
import javax.inject.Named;

@Model
@Named(value="mainPageController")
public class MainPageController {

	private String message;
	
	public String reloadConfiguration() {

		message = "konfiguracja wczytana!";
		return message;
	}
	
	public String getMessage() {
		return message;
	}
	
	public void clearMessage() {
		message = null;
	}
	
}
