package tictactoe;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;

public class TictactoeJPanel extends JPanel implements ActionListener{
	
	// got this from java documentation 
	Border blackline, raisedetched, loweredetched,
	raisedbevel, loweredbevel, empty;

		// got this from java documentation

	private String Xstr = "X";
	private String Ostr = "O";
	private JTextArea jtA00,jtA01,jtA02,jtA10,jtA11,jtA12,jtA20,jtA21,jtA22,jtABlank;
	private JButton jbplayer1, jbplayer2;
	private String plaOneStr = "Player One";
	private String plaTwoStr = "Player two";
	
	TictactoeJPanel(){
		blackline = BorderFactory.createLineBorder(Color.black);
		raisedetched = BorderFactory.createEtchedBorder(EtchedBorder.RAISED);
		loweredetched = BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);
		raisedbevel = BorderFactory.createRaisedBevelBorder();
		loweredbevel = BorderFactory.createLoweredBevelBorder();
		empty = BorderFactory.createEmptyBorder();
		
		JTextArea jtA00 = new JTextArea();
		JTextArea jtA01 = new JTextArea();
		JTextArea jtA02 = new JTextArea();
		JTextArea jtA10 = new JTextArea();
		JTextArea jtA11 = new JTextArea();
		JTextArea jtA12 = new JTextArea();
		JTextArea jtA20 = new JTextArea();
		JTextArea jtA21 = new JTextArea();
		JTextArea jtA22 = new JTextArea();
		JTextArea jtABlank = new JTextArea();
		
		JButton jbplayer1 = new JButton(plaOneStr);
		JButton jbplayer2 = new JButton(plaTwoStr);
		
		
		// add order // add order // add order
		add(jtA00);
		add(jtA01);
		add(jtA02);
		add(jtA10);
		add(jtA11);
		add(jtA12);
		add(jtA20);
		add(jtA21);
		add(jtA22);
		add(jbplayer1);
		add(jtABlank);
		add(jbplayer2);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		
	}

}
