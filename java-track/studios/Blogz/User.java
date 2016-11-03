package Blogz;

public class User {
	private String username;  // should this be private?
	private static String password;  // should this be private?  should this be here? trying to be non-hashed pw
	private static String hashedPW;  // should this be private? should this be here?
	
	//HashPassword:
	private static String hashPassword(String password){
		password = hashedPW;
		return hashedPW;
	}
	
	//Validate PW
	private String isValidPassword(String hashedPW){
		String unHashedPW = "";
		String message = "";
		if(unHashedPW == password){ //how about .equals?????  fix variables
			message = "Congratulations, the password works!";
		}
		else{ // (unHashedPW != password)
			message = "Please try a different password.  Thank you.";
		}
		return message;
	}
	
	//Constructor:
	public User(String username, String hashedPW){  //constructor
		this.username = username;
		this.hashedPW = hashPassword(this.password);
	}
	
	public String getUserName(){
		return this.username;
	}

	public String getHashedPassword(){
		return User.hashedPW;
	}
	
	
}
