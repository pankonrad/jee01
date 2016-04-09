package pl.sidgroup.sweeper.tools;

import static java.lang.annotation.ElementType.TYPE;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.enterprise.inject.Stereotype;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

@ViewScoped
@Named
@Stereotype
@Target(TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface ViewController {

}
