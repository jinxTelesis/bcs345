package tictactoe;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class TictactoeJPanel extends JPanel implements ActionListener, DocumentListener{
	
	// got this from java documentation 
	Border blackline, raisedetched, loweredetched,
	raisedbevel, loweredbevel, empty;

		// got this from java documentation

	private String Xstr = "   X  ";
	private String Ostr = "   O  ";
	private JTextArea jtABlank;
	private JButton jb00,jb01,jb02,jb10,jb11,jb12,jb20,jb21,jb22;
	private JButton jbplayer1, jbplayer2;
	public static final String plaOneStr = "Player One";
	public static final String plaTwoStr = "Player two";

	
	TictactoeJPanel(){
		blackline = BorderFactory.createLineBorder(Color.black);
		raisedetched = BorderFactory.createEtchedBorder(EtchedBorder.RAISED);
		loweredetched = BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);
		raisedbevel = BorderFactory.createRaisedBevelBorder();
		loweredbevel = BorderFactory.createLoweredBevelBorder();
		empty = BorderFactory.createEmptyBorder();
		
		Font dresFont = new Font("Serif", Font.BOLD, 96);
		
		//jb00,jb01,jb02,jb10,jb11,jb12,jb20,jb21,jb22;
		JButton jb00 = new JButton(Xstr);
		JButton jb01 = new JButton(Ostr);
		JButton jb02 = new JButton(Xstr);
		JButton jb10 = new JButton(Ostr);
		JButton jb11 = new JButton(Xstr);
		JButton jb12 = new JButton(Ostr);
		JButton jb20 = new JButton(Xstr);
		JButton jb21 = new JButton(Ostr);
		JButton jb22 = new JButton(Xstr);
		
		//jb00,jb01,jb02,jb10,jb11,jb12,jb20,jb21,jb22;
		add(jb00);
		add(jb01);
		add(jb02);
		add(jb10);
		add(jb11);
		add(jb12);
		add(jb20);
		add(jb21);
		add(jb22);
		jb00.setFont(dresFont);
		
		JTextArea jtABlank = new JTextArea();
		
		JButton jbplayer1 = new JButton(plaOneStr);
		JButton jbplayer2 = new JButton(plaTwoStr);

		
		// add order // add order // add order

		add(jbplayer1);
		add(jtABlank);
		add(jbplayer2);
		

		jbplayer1.addActionListener(this);
		jbplayer2.addActionListener(this);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String testStr = new String();
		String cmd = e.getActionCommand();
		String playerState = "";

		switch(cmd) {
		case plaOneStr:
			playerState = "PlayerOne";
			break;
		case plaTwoStr:
			playerState = "PlayerTwo";
			break;
		
		}
		
	}


	@Override
	public void changedUpdate(DocumentEvent arg0) {
		// TODO Auto-generated method stub
		
	}













	@Override
	public void insertUpdate(DocumentEvent arg0) {
		// TODO Auto-generated method stub
		
	}













	@Override
	public void removeUpdate(DocumentEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
