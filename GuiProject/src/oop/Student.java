package oop;

public class Student implements Comparable<Student>{

	private String firstName;
	private String lastName;
	private static int ID;
	protected int sID;
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
		this.coursesTaken = coursesTaken;
		
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
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
	}
	
	public void setCoursesTakenSingle(String coursesTaken, int pos)
	{
		this.coursesTaken[pos] = coursesTaken;
	}

	public int getsID() {
		return sID;
	}
	
	public String toString() {
		String s = null;// not the best way to do it performance wise
		s+= "The student's first name is: " + this.firstName + " ";
		s+= "The student's last name is : " + this.lastName + " ";
		s+= "The student's id is : " + this.sID + " ";
		s+= "The student's matriculant status is : " + this.matriculantStatus + " ";
		for (int i = 0; i < coursesTaken.length;i++)
		{
			s+= "The student is enrolled in : " + coursesTaken[i] + " ";
		}
		
		return s;
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
