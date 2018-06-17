package tictactoe;

import java.awt.GridLayout;

import javax.swing.JFrame;

public class tictactoeJFrame extends JFrame {
	
	public tictactoeJFrame() {
		tictactoeJPanel baseJPanel = new tictactoeJPanel();
		add(baseJPanel);
		GridLayout layout = new GridLayout(3,4);
        baseJPanel.setLayout(layout);
        setResizable(false);
	}

	

}
