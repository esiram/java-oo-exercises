
public class Student {

//Fields:
	private String firstName;
	private String lastName;
	private int studentID;
	private int credits;
	private double gpa;
	
	
//Behaviors (methods):
//constructor
	public Student(String firstName, String lastName, int studentID)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.studentID = studentID;
		this.credits = 0;
		this.gpa = 0.000;
	}


	public Student(Student father, Student mother)
	{
		this.firstName = father.getName();
		this.lastName = mother.getName();
		this.studentID = father.getStudentID() + mother.getStudentID();
		this.gpa = (father.getGPA() + mother.getGPA()) / 2;
		this.credits = Math.max(father.getCredits(), mother.getCredits());
	}
	
	//getters and setters
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


	public String getClassStanding()  
	{
		if(this.credits < 30) 
			{
				return "Freshman";
			}
		else if(this.credits >= 30 & this.credits < 60)
			{
				return "Sophomore";
			}
		else if(this.credits >= 60 & this.credits < 90)
			{
				return "Junior";
			}
		else //(this.credits >= 90)
			{
				return "Senior";
			}	
	}
	
	
//submitGrade()
	public void submitGrade(double grade, int courseCredits) 
	{		
		double quality = grade * courseCredits;
		double previousQuality = this.gpa * this.credits;
		this.credits = this.credits + courseCredits;
		this.gpa = (quality + previousQuality) / this.credits;
		this.gpa = (double) (Math.round(this.gpa * 1000)) / 1000;
	 }

	
//computeTuition()
	public double computeTuition() //this doesn't have the appropriate [.33] at end of answer
	{
		double tuition = 0.00;
		if(this.credits == 15)
		{
			tuition = 20000;
		}
		else if(this.credits > 15)
		{
			tuition = 20000 + (1333.33 * (this.credits - 15));
		}
		else // this.credits < 15
		{
			tuition = (this.credits * 1333.33);
		}
		//double costPerCredit = 1333.33;
		//return (costPerCredit * this.credits);
		return (tuition);
	}	


//createLegacy (see add'l Student constructor under initial Student constructor)
	public Student createLegacy(Student father, Student mother)
	{
		Student legacy =  new Student(father, mother);	
		return legacy;			
	}	
	
//create toString
	public String toString()
	{
		return ("StudentName: " + firstName + " " + lastName + " Student ID: " + studentID);
}
} //class curly end brace

