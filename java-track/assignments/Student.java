
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

	
//computeTuition()   //do I need to have a setter method up top for tuition?-Es 10/9/16
	public void computeTuition()
	{
		for int in submitGrade(double grade, int courseCredits)
		{
			this.credits = this.credits + semesterCredits;
//			if (semesterCredits > 0 & semesterCredits <= 15)  //should each semester's first 1-15 credits total $20,000, or should lesser amounts get prorated?
			if (this.credits == 15)	
			{
				int tuition = 20000;
			}
			else if (this.credits > 15)
			{
				int difference = this.credits - 15;
				int tuition = 20000 + ((difference * 20000) / 15);
			}
			else //(this.credits < 15)
			{
				int tuition = (this.credits * 20000) / 15;
			}
		}
	}	
	
	
//createLegacy() -- note: this involves making a new constructor for the new generation student

	
	
	
	
	
	
	
	
	
	
	
	//public static void main(String[] args) {
		// TODO Auto-generated method stub

	//}

}
