package oop;

import javax.swing.JFrame;


public class driver {

	public static void main(String[] args) {
		
		Employee emp = new Employee("Dave ", "Likes ", "Carrots");
		emp.setFirstName("Jim");
		
		
		System.out.println("Get test" + emp.getFirstName());
		System.out.println("");
		
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
