package oop;

import javax.swing.JFrame;


public class driver {

	public static void main(String[] args) {
		
		String[] coursearr= new String[9];
		Employee emp = new Employee("Dave ", "Likes ", "Carrots");
		//Faculty fac1 = new Faculty("George", "Bill", "Sales", coursearr);
		// need to test student 
		
		coursearr[0] = "U120";
		coursearr[1] = "U130";
		coursearr[2] = "UUUU";
		
		String[] badCourseArr = new String[9];
		badCourseArr[0] = "G120";
		badCourseArr[1] = "U145";
		badCourseArr[2] = "Burp";
		
		String[] gradCourseArr = new String[9];
		gradCourseArr[0] = "G140";
		gradCourseArr[1] = "G195";
		gradCourseArr[4] = "G390";
		
		
		
		Student stu1 = new Student("bil","theBarbarian",'U', coursearr);
		
		System.out.print("Student object test" + stu1.getFirstName() + " " + stu1.getLastName() + " " + stu1.getMatriculantStatus());
		
		
		
		
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			
		@Override
		public void run() {
		GuiJFrame gui = new GuiJFrame();
		gui.setVisible(true);
		gui.setSize(850, 850);
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		});

		}
	

}
