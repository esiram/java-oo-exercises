package Blogz;
import java.lang.Object; //for regular expressions
import java.util.regex.Matcher;//for regular expressions
import java.util.regex.Pattern;//for regular expressions
import java.util.ArrayList; // array list is a kind of list
import java.util.List; // list is an interface



public class User {
	private String username; 
	private String password; 
	private String hashedPW;
	static List<User> users = new ArrayList<User>();	
	
	//HashPassword:
	private static String hashPassword(String pwd){  //TODO: hashing will happen in Blogz2
		return pwd;
	}

	//Validate PW
	private boolean isValidPassword(String pwd){
		return User.hashPassword(pwd) == this.hashedPW;
	}
	
	//Validate UserName
	private static boolean isValidUsername(String username){
		 Pattern p = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]{4,11}");
		 Matcher m = p.matcher(username);
		 return m.matches();
	}	
		
	
	//Constructor:
	public User(String username, String hashedPW){
		this.hashedPW = hashPassword(this.password);
		if (!User.isValidUsername(username)){
			throw new IllegalArgumentException("Bad username.");	
		}
		else{
			this.username = username;
		}
	}
	
	public String getUserName(){
		return this.username;
	}

	public String getPassword(){
		return this.password;
	}
	
}
