package oop;

public class Student implements Comparable<Student>{

	private String firstName;
	private String lastName;
	private static int ID;
	private int sID;
	private char matriculantStatus;
	public final static int MAX_NUM_COURSES = 7;
	private String[] coursesTaken = new String[7];
	
	
	
	
	
	
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
