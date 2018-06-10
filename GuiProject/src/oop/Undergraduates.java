package oop;

public class Undergraduates extends Student {
	
	Undergraduates(){
		super();// need courses only to be U // and status 
	}
	
	Undergraduates(String firstName, String lastName, String[] coursesTaken)
	{
		super(firstName,lastName,'U',coursesTaken);
		for (int i = 0; i < coursesTaken.length;i++)
		{
			coursesTaken[i].toUpperCase();
		}
		for (int i = 0; i < coursesTaken.length;i++)
		{
			System.out.print(" " + coursesTaken[i].charAt(0) + " ");
			if(coursesTaken[i].charAt(0) != 'U')
			{
				System.out.println("Can't enroll in this class it is a Graduate class");
				setCoursesTakenSingle("Invalid_reenter", i);
			}
		}
		
	}
	
	

}
