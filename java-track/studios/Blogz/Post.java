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
	
	
}


