
public class Student {

//Fields:
	private String firstName;
	private String lastName;
	private int studentID;
	private int credits;
	private double gpa;
	
	
//Behaviors (methods):
//create constructor
	public Student(String firstName, String lastName, int studentID)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.studentID = studentID;
		this.credits = 0;
		this.gpa = 0.000;
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
	public void submitGrade(double grade, int courseCredits) // FIGURE OUT HOW TO ROUND THIS TO 3 DECIMALS per test-ES 10-6-16 (float?????)
	{		
		double initQualityGPA = this.gpa * this.credits;
		double courseQualityGPA = courseCredits * grade; 
		this.credits = this.credits + courseCredits;
		this.gpa = (initQualityGPA + courseQualityGPA) / this.credits;
//		long roundedGPA = (long) (Math.round(this.gpa) * 1000.0);  //attempt to round GPA cast it as a long, then truncate it to 3 decimal spots
//		this.gpa = 	(double) roundedGPA/ 1000.0;
		this.gpa = (this.gpa * 1000.0) / 1000.0;
//		double gpatotal = this.gpa + (grade * courseCredits);  // attempt to round GPA and change to 3 decimal places (Deech's method on 10/6/16)
//		this.credits = this.credits + courseCredits;
//		this.gpa = (Math.round (gpatotal / this.credits) * 10000.000) / 10000.000;
	 }

	
//computeTuition()
	public void computeTuition(int courseCredits)
	{
//		if (semesterCredits > 0 & semesterCredits <= 15)  //should each semester's first 1-15 credits total $20,000, or should lesser amounts get prorated?
		if (this.credits == 15)	{
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
	
	
//createLegacy() -- note: this involves making a new constructor for the new generation student

	
	
	
	
	
	
	
	
	
	
	
	//public static void main(String[] args) {
		// TODO Auto-generated method stub

	//}

}
