package oop;

import javax.swing.JFrame;


public class driver {

	public static void main(String[] args) {
		
		String[] coursearr= new String[9];
		Employee emp = new Employee("Dave ", "Likes ", "Carrots");
		Faculty fac1 = new Faculty("George", "Bill", "Sales", coursearr);
		emp.setFirstName("Jim");
		fac1.setFirstName("George2");
		
		
		System.out.println("Get test" + emp.getFirstName());
		System.out.println("");
		System.out.println("Get test fac1" + fac1.getFirstName());
		
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
