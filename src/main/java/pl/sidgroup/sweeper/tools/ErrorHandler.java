package pl.sidgroup.sweeper.tools;

import java.io.Serializable;
import java.util.Map;

import javax.faces.context.FacesContext;

@ViewController
public class ErrorHandler implements Serializable {
	private static final long serialVersionUID = 3063574897431541158L;
	
	public String getMessage() {
		Map<String, Object> requestMap = FacesContext.getCurrentInstance().getExternalContext().getRequestMap();
		String message = (String) requestMap.get("javax.servlet.error.message");
		if (message != null) {
			if (message.equals("java.lang.NullPointerException"))
				return "Kod błędu: 102"; 
			if (message.contains("Not Found in ExternalContext as a Resource"))
				return "Strona o podanym adresie nie istnieje";
			if(message.contains("org.hibernate.hql.internal.ast.QuerySyntaxException"))
				return "Kod błędu: 103, skontaktuj się z administratorem";
		} 
		return message;
	}
}
