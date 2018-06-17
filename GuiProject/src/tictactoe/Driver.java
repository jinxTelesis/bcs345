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
		frame.setSize(850, 850);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			
		}
			
			
		});

	}

}
