package tictactoe;

import java.awt.GridLayout;

import javax.swing.JFrame;

public class TictactoeJFrame extends JFrame {
	
	public TictactoeJFrame() {
		TictactoeJPanel baseJPanel = new TictactoeJPanel();
		add(baseJPanel);
		GridLayout layout = new GridLayout(0,4);
        baseJPanel.setLayout(layout);
        setResizable(false);
	}

	

}
