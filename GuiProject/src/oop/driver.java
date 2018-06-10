package oop;

import javax.swing.JFrame;


public class driver {

	public static void main(String[] args) {
		Employee emp = new Employee("Dave ", "Likes ", "Carrots");
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			
		@Override
		public void run() {
		GuiJFrame gui = new GuiJFrame();
		gui.setVisible(true);
		gui.setSize(215, 500);
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		});

		}
	

}
