package oop;

public class driver {

	public static void main(String[] args) {
		Employee emp = new Employee("Dave ", "Likes ", "Carrots");
		System.out.println(emp);
		String courseArray[] = new String[9];
		courseArray[0] = "test1";
		courseArray[1] = "test2";
		Faculty fac = new Faculty("Bob", "Chris", "Frankie", courseArray);
		Faculty fac2 = new Faculty("Bob", "Chris", "Frankie",courseArray);
		Undergraduates ug1 = new Undergraduates("Jinx","Rocks",courseArray);
		
		System.out.println(fac.getFirstName() + fac.getLastName() + fac.MAX_NUM_COURSES);
		System.out.println(fac.getcourseArr()[0] + fac.getcourseArr()[1]);
		System.out.println(fac.toString());
		System.out.println("UnderGrade " + ug1.getMatriculantStatus());
		
		if (fac.equals(fac2))
		{
			System.out.println("Equal objects");
		}
		else
		{
			System.out.println("objects not equal");
		}
	}

}
