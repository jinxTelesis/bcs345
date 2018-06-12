package oop;

import javax.swing.JFrame;


public class driver {

	public static void main(String[] args) {
		
		String[] coursearr= new String[9];
		Employee emp = new Employee("Dave ", "Likes ", "Carrots");
		Faculty fac1 = new Faculty("George", "Bill", "Sales", coursearr);
		// need to test student 
		Student stu1 = new Student("bil","theBarbarian",'U', coursearr);
		
		System.out.print("Student object test" + stu1.getFirstName() + " " + stu1.getLastName() + " " + stu1.getMatriculantStatus());
		
		
		
		
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			
		@Override
		public void run() {
		GuiJFrame gui = new GuiJFrame();
		gui.setVisible(true);
		gui.setSize(600, 600);
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		});

		}
	

}
