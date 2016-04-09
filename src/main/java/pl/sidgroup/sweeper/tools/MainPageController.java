package pl.sidgroup.sweeper.tools;

import javax.enterprise.inject.Model;

@Model
@Named(value="welcomeBean")
public class MainPageController {
	
//	@EJB
//	private ConfigurationProvider configurationProvider;
//	@EJB
//	private RemoteConfigurationProvider remoteConfigurationProvider;
	
	private String message;
	
	public String reloadConfiguration() {
//		boolean sweeperConfig = configurationProvider.reloadConfiguration();
//		boolean remoteConfig = remoteConfigurationProvider.reloadConfiguration();
		
//		message = sweeperConfig && remoteConfig ? 
//				"konfiguracja wczytana" : "Bład podczas wczytywania konfiguracji " 
//				+ (sweeperConfig ? "sweeperConfig !" : "remoteConfig !");

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
