package model;

public class User {

	private String nombreUser;
	private String password;
	
	public User(String nombreUser, String password) {
		this.nombreUser = nombreUser;
		this.password = password;
	}

	public String getNombreUser() {
		return nombreUser;
	}

	public void setNombreUser(String nombreUser) {
		this.nombreUser = nombreUser;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}
