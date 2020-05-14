package tn.rnu.isetjb.mastere.admin.security;

import java.util.List;


/**
 * @author Laby D. Camara | ldamaro98@gmail.com
 * 
 * @version 0.0.1
 * @since 0.0.1
 */

public class CurrentUser {

    private String userId;
    private String username;
    private String email;
    private List<String> roles;
    
    
    
	public CurrentUser() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<String> getRoles() {
		return roles;
	}
	public void setRoles(List<String> roles) {
		this.roles = roles;
	}
    
    
}
