package tictactoe;
import javax.swing.JFrame;

public class Driver {

	public static void main(String[] args) {
		
		javax.swing.SwingUtilities.invokeLater(new Runnable()
		{
		public void run()
		{
		TictactoeJFrame frame = new TictactoeJFrame();
		frame.setVisible(true);
		frame.setSize(700, 600);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			
		}
			
			
		});

	}

}
