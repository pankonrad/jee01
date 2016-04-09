package pl.sidgroup.sweeper.tools;

import javax.inject.Named;

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
