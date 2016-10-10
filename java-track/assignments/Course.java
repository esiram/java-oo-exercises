
public class Course {
//Fields:
	private String name;
	private int credits;
	private int seatBalance;
	private Student[] roster;

//Behaviors:
	//constructor
	public Course(String name, int credits, int seats)
	{
		this.name = name;
		this.credits = credits;
		this.seatBalance = seats;
		this.roster = new Student[seats];
	}
	
	
	//getters and setters
	public String getName()
	{
		return this.name;
	}
	
		
	public int getCredits()
	{
		return this.credits;
	}

	
	public int getRemainingSeats()
	{
		return this.seatBalance;
	}

	
	public Student[] getRoster()
	{
		return this.roster;
	}
	
	
	//addStudent -- 1) check if enrolled
	public boolean studentEnrolled(Student student)
	{
        for(Student enrolled : this.roster) 
        {
        	if (enrolled != null) 
        	{
        		if (enrolled.getName() == student.getName())
        		{
        			return true;
        		}
        	}
        }
        return false;
	}
	
	
	//addStudent() -- 2) add student if not enrolled and if seats remain in class
	public boolean addStudent(Student student)
	{
		if (this.seatBalance == 0)
		{
			return false;
		}
		else if (this.studentEnrolled(student))
		{
			return false;
		}
		else
		{
			for(Integer i = 0; i < this.roster.length; i = i + 1)
			{
				if (this.roster[i] == null)
				{
					this.roster[i] = student;
					this.seatBalance = this.seatBalance - 1;
					return true;
				}
			}	
		}
		return false;
	}

	
	//generateRoster()	
	public void generateRoster()
	{
		System.out.println("Roster for " + this.name + ":");
        for(Student student : this.roster) 
        {
        	if (student == null) 
        	{
        		System.out.println("  Empty");
        	}
        	else
        	{
            	System.out.println("  " + student.getName());
        	}
        }
	}

	
	//averageGPA()
	public double averageGPA()
	{
		double totalGPA = 0; 
		for(Student student : this.roster)
		{
			if (student != null)
			{
				totalGPA = totalGPA + student.getGPA();
			}
			else
			{	
				totalGPA = totalGPA;
			}
		}
		double averageGPA = totalGPA / (this.roster.length - this.seatBalance); 
		return averageGPA;
	}
	
	

	//toString()
	public String toString()
	{
		return("Course Number: " + this.name + "; CourseCredits: " + this.credits);
	}
	
	
}
