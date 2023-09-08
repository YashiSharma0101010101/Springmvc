package springmvc.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class User {
	 @Id
	 @GeneratedValue(strategy=GenerationType.AUTO)
	 private int id;
     private String useremail;
     private String username;
     private String userpass;
	public String getUseremail() {
		return useremail;
	}
	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUserpass() {
		return userpass;
	}
	public void setUserpass(String userpass) {
		this.userpass = userpass;
	}
	@Override
	public String toString() {
		return "User [useremail=" + useremail + ", username=" + username + ", userpass=" + userpass + "]";
	}
     
     
}