package oop;

public class Student extends Person implements Comparable<Student>{

//	private String firstName;
//	private String lastName;
	public static int ID;
	protected int sID;
	private char matriculantStatus;
	public final static int MAX_NUM_COURSES = 7;
	private String[] coursesTaken = new String[7];
	
	protected int arrLength =0;
	
	// changed a lot of code in this one compared to rest coursesTaken.length replace with arrLength
	// worked before testing again
	//
	//
	//
	//
	//retest might have broken Student
	
	
	
	Student() {
		super();
		//this.firstName = "";
		//this.lastName = "";
		++ID;
		this.sID = ID;
		this.matriculantStatus = 'U';
		this.coursesTaken = coursesTaken; // yeah i know sets to self
	}
	
	Student(String firstName, String lastName,char matriculantStatus, String[] coursesTaken, int arrLength)
	{
		super(firstName,lastName);// remember to call this rather than just rebuild default
		this.matriculantStatus = matriculantStatus;
		this.coursesTaken = coursesTaken;
		this.arrLength = arrLength;
		++ID;
		this.sID = ID;
		//System.out.println(coursesTaken.length);
		
		for(int i = 0; i < arrLength;i++)
		{
			System.out.println(coursesTaken[i]);
		}
		
		if(this.matriculantStatus == 'U' || this.matriculantStatus == 'u')
		{
			for (int i = 0; i < arrLength;i++)
			{
				//if(coursesTaken[i] != null)
				coursesTaken[i].toUpperCase();
			}
			for (int i = 0; i < arrLength;i++)
			{
				//if(coursesTaken[i] != null)
				System.out.print(" " + coursesTaken[i].charAt(0) + " ");
				//if(coursesTaken[i] != null)
				if(coursesTaken[i].charAt(0) != 'U')
				{
					System.out.println("Can't enroll in this class it is a Graduate class");
					setCoursesTakenSingle("Invalid_reenter", i);
				}
			}
			
		}
		
		if(this.matriculantStatus == 'G' || this.matriculantStatus == 'g')
		{
			
			for (int i = 0; i < arrLength;i++)
			{
				if(coursesTaken[i] != null)
				coursesTaken[i].toUpperCase();
			}
			for (int i = 0; i < arrLength;i++)
			{
				if(coursesTaken[i] != null)
				System.out.print(" " + coursesTaken[i].charAt(0) + " ");
				if(coursesTaken[i] != null)
				if(coursesTaken[i].charAt(0) != 'G')
				{
					System.out.println("Can't enroll in this class it is a Graduate class");
					setCoursesTakenSingle("Invalid_reenter", i);
				}
			}
		}
		
	}

	public char getMatriculantStatus() {
		return matriculantStatus;
	}

	public void setMatriculantStatus(char matriculantStatus) {
		this.matriculantStatus = matriculantStatus;
	}

	public String[] getCoursesTaken() {
		return coursesTaken;
	}

	public void setCoursesTaken(String[] coursesTaken) {
		
		this.coursesTaken = coursesTaken;
		
		if(this.matriculantStatus == 'U' || this.matriculantStatus == 'u')
		{
			for (int i = 0; i < arrLength;i++)
			{
				if(coursesTaken[i] != null)
				coursesTaken[i].toUpperCase();
			}
			for (int i = 0; i < arrLength;i++)
			{
				if(coursesTaken[i] != null)
				System.out.print(" " + coursesTaken[i].charAt(0) + " ");
				//if(coursesTaken[i] != null)
				if(coursesTaken[i].charAt(0) != 'U')
				{
					System.out.println("Can't enroll in this class it is a Graduate class");
					setCoursesTakenSingle("Invalid_reenter", i);
				}
			}
			
		}
		
		if(this.matriculantStatus == 'G' || this.matriculantStatus == 'g')
		{
			
			for (int i = 0; i < arrLength;i++)
			{
				if(coursesTaken[i] != null)
				coursesTaken[i].toUpperCase();
			}
			for (int i = 0; i < arrLength;i++)
			{
				if(coursesTaken[i] != null)
				System.out.print(" " + coursesTaken[i].charAt(0) + " ");
				if(coursesTaken[i] != null)
				if(coursesTaken[i].charAt(0) != 'G')
				{
					System.out.println("Can't enroll in this class it is a Graduate class");
					setCoursesTakenSingle("Invalid_reenter", i);
				}
			}
		}
		
	}
	
	public void setCoursesTakenSingle(String coursesTaken, int pos)
	{
		this.coursesTaken[pos] = coursesTaken;
	}

	public int getsID() {
		return sID;
	}
	
	public String toString() {
		String s = super.toString();
		//s+= "The student's first name is: " + this.firstName + " ";
		//s+= "The student's last name is : " + this.lastName + " ";
		s+= "The student's id is : " + this.sID + " ";
		s+= "The student's matriculant status is : " + this.matriculantStatus + " ";
		
		// this might need work here
		for (int i = 0; i < arrLength;i++)
		{
			if(coursesTaken[i] != null);
			s+= "The student is enrolled in : " + coursesTaken[i] + " ";
		}
		
		return s.replaceAll("null", "");
	}
	
	public boolean equals(Object o)
	{
		if(o instanceof Student)
		{
			Student otherS = (Student)o; // cast
			if (this.sID == otherS.sID)// allows name changes, which mirror reality
			{//student equivlency only based on id
				return true; 
			}
		}
		return false;
	}
	
	
	@Override
	public int compareTo(Student o) {
		if(this.sID > o.sID)
		{
			return 1;
		}
		else if(this.sID == o.sID)
		{
			return 0;
		}
		else
		{
			return -1;
		}
	}
	

}
