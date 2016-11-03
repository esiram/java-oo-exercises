package Blogz;
import java.util.Date;



public class Post {
	private String title;
	private String author;
	private String body; //what type should this be?
	private final Date created; // will need to be final: private final Date created
	private Date modified;

	//Constructor
	public Post(String title, String author, String body, Date created, Date modified){
		this.title = title;
		this.author = author;
		this.body = body;
		this.created = created;
		this.modified = modified;
	}
	
	//Getters
	public String getTitle(){
		return this.title;
	}
	
	public String getAuthor(){
		return this.author;
	}
	 
	public String getBody(){
		return this.body;
	}
	
	public Date getCreated(){
		return this.created;
	}

	public Date getModified(){
		return this.modified;
	}
	
	//Setters
	public void setTitle(){
		Date d = new Date();
		this.modified = d;
		this.title = title;
	}
	
	public void setAuthor(){
		Date d = new Date();
		this.modified = d;
		this.author = author;
	}
	
	public void setBody(){
		Date d = new Date();
		this.modified = d;
		this.body = body;
	}
	
}

	

