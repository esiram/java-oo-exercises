package Blogz;

public abstract class Entity {
	private final int UID;
	
	//Constructor (private and final)
	private Entity(int UID){
		this.UID = UID;
	}
	
	public int getUID(){
		return this.UID;
	}
}
	
	


