package Blogz;

public abstract class Entity {
	private final int UID;
	
	//Constructor (private and final) -- how do you make this private if Entity remains a super class?
	public Entity(int UID){ //UID>0 and UID != anotherUID HOW DOES? 
		this.UID = UID; //we need to figure out how to store in a database (have we hit this topic yet?)
	}

	//Getter
	public int getUID(){
		return this.UID;
	}
}
	
	


