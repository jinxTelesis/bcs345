package oop;

public class Student implements Comparable<Student>{

	private String firstName;
	private String lastName;
	private static int ID;
	private int sID;
	private char matriculantStatus;
	public final static int MAX_NUM_COURSES = 7;
	private String[] coursesTaken = new String[7];
	
	Student() {
		this.firstName = "";
		this.lastName = "";
		ID++;
		this.sID = ID;
		this.matriculantStatus = 'U';
		this.coursesTaken = coursesTaken; // yeah i know sets to self
	}
	
	Student(String firstName, String lastName, char matriculantStatus, String[] coursesTaken)
	{
		this(); // remember to call this rather than just rebuild default
		this.firstName = firstName;
		this.lastName = lastName;
		this.matriculantStatus = matriculantStatus;
		
		
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
