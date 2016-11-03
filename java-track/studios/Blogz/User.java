package Blogz;
import java.lang.Object; //for regular expressions
import java.util.regex.Matcher;//for regular expressions
import java.util.regex.Pattern;//for regular expressions



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
	
	//Validate UserName  
	//TODO: MOVE -- NOTE THAT THIS CHECK SHOULD HAPPEN IN THE CONSTRUCTOR 
	//TODO: GET RegExpressions in the right place.
	private static boolean isValidUsername(String username){
		Pattern p = Pattern.compile("a*b");
		Matcher m = p.matcher("aaab");
		boolean b = m.matches();
		return b;
		//regular expression to use: [a-zA-Z][a-zA-Z0-9_-]{4,11} 
	}	
		
		
//ES' attempts before reading link re: patterns:		
//		if(username.length() < 13 && username.length() > 3 && username[0].isalpha == true ){ //TODO: look up regular expressions per the directions
//			return true;
//		}
//		else{
//			return false; //TODO:THROW AN EXCEPTION HERE
//		}

	
	
	
	
	
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
