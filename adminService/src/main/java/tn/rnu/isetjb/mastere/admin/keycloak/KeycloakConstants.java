package tn.rnu.isetjb.mastere.admin.keycloak;

import com.google.common.collect.ImmutableList;

/**
 * @author Laby D. Camara | ldamaro98@gmail.com
 * 
 * @since 0.0.1
 * @version 0.0.1
 */
public class KeycloakConstants {
    
    private KeycloakConstants() {
        
    }

    public static final String ROLE_API_ACCESS = "apiAccess";
    public static final String ROLE_GUI_ACCESS = "guiAccess";
    public static final String ROLE_ADMINISTRATOR = "administrator";
    public static final String ROLE_USER_MANAGEMENT = "userManagement";
    public static final ImmutableList<String> ROLE_KEYCLOAK_DEFAULT_EXCLUDED = ImmutableList.of("uma_authorization", "offline_access");
}
