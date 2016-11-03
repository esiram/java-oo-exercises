package Blogz;

public class User {
	private String username;  // should this be private?
	private String hashedPW;  // should this be private?
	
	public User(String username, String hashedPW){
		this.username = username;
		this.hashedPW = hashedPW;
	}
	
	public String getUserName(){
		return this.username;
	}
	
	public String getHashedPW(){
		return this.hashedPW;
	}

}
