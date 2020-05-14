package tn.rnu.isetjb.mastere.admin.web.application;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.rnu.isetjb.mastere.admin.keycloak.service.KeycloakAdminClientService;

/**
 * We will be using
 * https://www.keycloak.org/docs-api/9.0/javadocs/org/keycloak/admin/client/resource/RolesResource.html
 * API.
 * 
 * @author Laby D. Camara | ldamaro98@gmail.com
 * 
 * @version 0.0.1
 * @since 0.0.1
 */
@RestController
@RequestMapping(path = "/keycloak")
public class KeycloakController {
	
	@Autowired
    private KeycloakAdminClientService keycloakAdminClientService;

    @GetMapping(path = "/hello")
    public String hello() {
        return "Hello World!";
    }

    @GetMapping(path = "/roles")
    public Collection<String> rolesOfCurrentUser() {
        return keycloakAdminClientService.getCurrentUserRoles();
    }

    @GetMapping(path = "/profile")
    public Object profileOfCurrentUser() {
        return keycloakAdminClientService.getUserProfileOfLoggedUser();
    }

}
