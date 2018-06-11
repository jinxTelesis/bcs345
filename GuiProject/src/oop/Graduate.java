package oop;

public class Graduate extends Student{
	
	Graduate() {
		super();
	}
	
	Graduate(String firstName, String lastName, String[] coursesTaken)
	{
		super(firstName,lastName,'G',coursesTaken);
		for (int i = 0; i < coursesTaken.length;i++)
		{
			coursesTaken[i].toUpperCase();
		}
		for (int i = 0; i < coursesTaken.length;i++)
		{
			System.out.print(" " + coursesTaken[i].charAt(0) + " ");
			if(coursesTaken[i].charAt(0) != 'G')
			{
				System.out.println("Can't enroll in this class it is a Graduate class");
				setCoursesTakenSingle("Invalid_reenter", i);
			}
		}
		
	}
	
	public boolean equals(Object o)
	{
		if(o instanceof Undergraduates)
		{
			Undergraduates otherS = (Undergraduates)o; // cast
			if (super.sID == otherS.sID)// allows name changes, which mirror reality
			{//student equivlency only based on id
				return true; 
			}
		}
		return false;
	}

}
