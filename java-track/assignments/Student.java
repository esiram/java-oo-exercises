
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
	
	
	//should I add a spot for classStanding to go in the student constructor or student class? - es10/5/16
	public void getClassStanding() //Should this return void or should it return classStanding?? AND which: (int credits) or ()?-es10/5/16  
		{
		if(this.credits < 30) 
			{
				String classStanding = "Freshman";
			}
		else if(this.credits >= 30 & this.credits < 60)
			{
				String classStanding = "Sophomore";
			}
		else if(this.credits >= 60 & this.credits < 90)
			{
				String classStanding = "Junior";
			}
		else //this.credits >= 90
			{
				String classStanding = "Senior";
			}	
	}
	
}
		//submitGrade()
	//public void submitGrade(int)
	//{
		
	    //computeTuition()
	    //createLegacy() -- note: this involves making a new constructor for the new generation student

	
	
	
	
	
	
	
	
	
	
	
	//public static void main(String[] args) {
		// TODO Auto-generated method stub

	//}

//}
