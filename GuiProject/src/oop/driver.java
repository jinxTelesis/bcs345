package oop;

public class driver {

	public static void main(String[] args) {
		Employee emp = new Employee("Dave ", "Likes ", "Carrots");
		System.out.println(emp);
		String courseArray[] = new String[9];
		String testCourseArr[] = {"UMAT175", "UCMP326","UENG101"};
		String failCourseArr[] = {"AMAT170", "AMAT180", "GENG101"};
		courseArray[0] = "test1";
		courseArray[1] = "test2";
		Faculty fac = new Faculty("Bob", "Chris", "Frankie", courseArray);
		Faculty fac2 = new Faculty("Bob", "Chris", "Frankie",courseArray);
		//Undergraduates ug1 = new Undergraduates("Jinx","Rocks",courseArray);
		
		System.out.println(fac.getFirstName() + fac.getLastName() + fac.MAX_NUM_COURSES);
		System.out.println(fac.getcourseArr()[0] + fac.getcourseArr()[1]);
		System.out.println(fac.toString());
		//System.out.println("UnderGrade " + ug1.getMatriculantStatus());
		Undergraduates ug2 = new Undergraduates("blue","black",testCourseArr);
		Undergraduates ug3 = new Undergraduates("Rose", "Green", failCourseArr);
		System.out.println(ug3.getCoursesTaken().toString());
		
		for (int i =0; i < ug2.getCoursesTaken().length;i++)
		{
			System.out.println(" " + ug2.getCoursesTaken()[i] + " ");
		}
	}

}
