
public class Student {

	//Fields:
	private String firstName;
	private String lastName;
	private int studentID;
	private int credits;
	private double gpa;
	
	//Behaviors (methods):
		//create constructor
	public Student(String firstName, String lastName, int studentID, int credits, double gpa)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.studentID = studentID;
		this.credits = credits;
		this.gpa = gpa;   
	}
	
		//create getters and setters per unit test
	public String getName()
	{
		String name = this.firstName + " " + this.lastName;
		return name;
	}
	
	
	public int getStudentID()
	{
		return this.studentID;
	}
	
	
	public int getCredits()
	{
		return this.credits;
	}
	
	public double getGPA()
	{
		return this.gpa;
	}
	
	
		//getClassStanding()
		//submitGrade()
	    //computeTuition()
	    //createLegacy() -- note: this involves making a new constructor for the new generation student

	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
