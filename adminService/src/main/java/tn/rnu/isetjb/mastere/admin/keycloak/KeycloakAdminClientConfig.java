package tn.rnu.isetjb.mastere.admin.keycloak;

import java.io.Serializable;

import lombok.Builder;
import lombok.Data;

/**
 * @author Laby D. Camara | ldamaro98@gmail.com
 * 
 * @since 0.0.1
 * @version 0.0.1
 */

@Data
@Builder
public class KeycloakAdminClientConfig implements Serializable {

    private String serverUrl;
    private String realm;
    private String clientId;
    private String clientSecret;
	/*public KeycloakAdminClientConfig() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getServerUrl() {
		return serverUrl;
	}
	public void setServerUrl(String serverUrl) {
		this.serverUrl = serverUrl;
	}
	public String getRealm() {
		return realm;
	}
	public void setRealm(String realm) {
		this.realm = realm;
	}
	public String getClientId() {
		return clientId;
	}
	public void setClientId(String clientId) {
		this.clientId = clientId;
	}
	public String getClientSecret() {
		return clientSecret;
	}
	public void setClientSecret(String clientSecret) {
		this.clientSecret = clientSecret;
	}*/
	
    
}