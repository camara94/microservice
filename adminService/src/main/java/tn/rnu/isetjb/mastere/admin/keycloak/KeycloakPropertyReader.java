package tn.rnu.isetjb.mastere.admin.keycloak;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

/**
 * @author Laby D. Camara | ldamaro98@gmail.com
 * 
 * @since 0.0.1
 * @version 0.0.1
 */
@Configuration
@PropertySource("classpath:application.properties")
public class KeycloakPropertyReader {

    @Autowired
    private Environment env;

    public String getProperty(String key) {
        return env.getProperty(key);
    }

}
