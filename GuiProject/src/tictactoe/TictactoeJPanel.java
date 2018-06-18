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


public class TictactoeJPanel extends JPanel implements ActionListener{
	
	// got this from java documentation 
	Border blackline, raisedetched, loweredetched,
	raisedbevel, loweredbevel, empty;

		// got this from java documentation
	String playerState = "";
	private boolean[] bClicked = { false,false,false,false,false,false,false,false,false};
	private String[] winner = new String[3]; // could put buttons in an array
	private String Xstr = "   X  ";
	private String Ostr = "   O  ";
	private JTextArea jtABlank;
	private JButton jb00,jb01,jb02,jb10,jb11,jb12,jb20,jb21,jb22;
	private JButton jbplayer1, jbplayer2;
	public static final String plaOneStr = "Player One Start \n ( 0 )";
	public static final String plaTwoStr = "Player Two Start \n ( X )";
//	public static String b00 = "";
//	public static String b01 = "";
//	public static String b02 = "";
//	public static String b10 = "";
//	public static String b11 = "";
//	public static String b12 = "";
//	public static String b20 = "";
//	public static String b21 = "";
//	public static String b22 = "";

	private enum Actions {
		Button00, Button01, Button02,
		Button10,Button11,Button12,
		Button20,Button21,Button22;
	}
	
	TictactoeJPanel(){ // constructor
		CreateGui(); // moved button stuff to a method
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand() == Actions.Button00.name())
		{
			//System.out.println("but 00");
			if(playerState == "PlayerOne")
			{
				if(bClicked[0]!= true) {
				jb00.setText(Ostr);
				bClicked[0] = true;
				playerState = "PlayerTwo";}
			}
			else
			{	
				if(bClicked[0]!= true) {
				jb00.setText(Xstr);
				bClicked[0] = true;
				playerState = "PlayerOne";}
			}
		}
		
		if(e.getActionCommand() == Actions.Button01.name())
		{
			//System.out.println("but 01");
			{
				if(playerState == "PlayerOne")
				{
					if(bClicked[1]!= true) {
					jb01.setText(Ostr);
					bClicked[1] = true;
					playerState = "PlayerTwo";}
				}
				else
				{	
					if(bClicked[1]!= true) {
					jb01.setText(Xstr);
					bClicked[1] = true;
					playerState = "PlayerOne";}
				}
			}
		}
		
		if(e.getActionCommand() == Actions.Button02.name())
		{
			//System.out.println("but 02");
			{
				if(playerState == "PlayerOne")
				{
					if(bClicked[2]!= true) {
					jb02.setText(Ostr);
					bClicked[2] = true;
					playerState = "PlayerTwo";}
				}
				else
				{	
					if(bClicked[2]!= true) {
					jb02.setText(Xstr);
					bClicked[2] = true;
					playerState = "PlayerOne";}
				}
			}
		}
		
		if(e.getActionCommand() == Actions.Button10.name())
		{
			//System.out.println("but 10");
			{
				if(playerState == "PlayerOne")
				{
					if(bClicked[3]!= true) {
					jb10.setText(Ostr);
					bClicked[3] = true;
					playerState = "PlayerTwo";}
				}
				else
				{	
					if(bClicked[3]!= true) {
					jb10.setText(Xstr);
					bClicked[3] = true;
					playerState = "PlayerOne";}
				}
			}
		}
		
		if(e.getActionCommand() == Actions.Button11.name())
		{
			if(playerState == "PlayerOne")
			{
				if(bClicked[4]!= true) {
				jb11.setText(Ostr);
				bClicked[4] = true;
				playerState = "PlayerTwo";}
			}
			else
			{	
				if(bClicked[4]!= true) {
				jb11.setText(Xstr);
				bClicked[4] = true;
				playerState = "PlayerOne";}
			}
		}
		
		if(e.getActionCommand() == Actions.Button12.name())
		{
			//System.out.println("but 12");
			if(playerState == "PlayerOne")
			{
				if(bClicked[5]!= true) {
				jb12.setText(Ostr);
				bClicked[5] = true;
				playerState = "PlayerTwo";}
			}
			else
			{	
				if(bClicked[5]!= true) {
				jb12.setText(Xstr);
				bClicked[5] = true;
				playerState = "PlayerOne";}
			}
		}
		
		if(e.getActionCommand() == Actions.Button20.name())
		{
			//System.out.println("but 20");
			if(playerState == "PlayerOne")
			{
				if(bClicked[6]!= true) {
				jb20.setText(Ostr);
				bClicked[6] = true;
				playerState = "PlayerTwo";}
			}
			else
			{	
				if(bClicked[6]!= true) {
				jb20.setText(Xstr);
				bClicked[6] = true;
				playerState = "PlayerOne";}
			}
		}
		
		if(e.getActionCommand() == Actions.Button21.name())
		{
			//System.out.println("but 21");
			if(playerState == "PlayerOne")
			{
				if(bClicked[7]!= true) {
				jb21.setText(Ostr);
				bClicked[7] = true;
				playerState = "PlayerTwo";}
			}
			else
			{	
				if(bClicked[7]!= true) {
				jb21.setText(Xstr);
				bClicked[7] = true;
				playerState = "PlayerOne";}
			}
		}
		
		if(e.getActionCommand() == Actions.Button22.name())
		{
			//System.out.println("but 22");
			if(playerState == "PlayerOne")
			{
				if(bClicked[8]!= true) {
				jb22.setText(Ostr);
				bClicked[8] = true;
				playerState = "PlayerTwo";}
			}
			else
			{	
				if(bClicked[8]!= true) {
				jb22.setText(Xstr);
				bClicked[8] = true;
				playerState = "PlayerOne";}
			}
		}
		

		String testStr = new String();
		String cmd = e.getActionCommand();
		

		switch(cmd) {
		
		case plaOneStr:
			if(playerState != "PlayerTwo")
			playerState = "PlayerOne";
			
			break;
		case plaTwoStr:
			if(playerState !="PlayerOne")
			playerState = "PlayerTwo";
			break;
		
		}
		
	}
	public void checkWinner(String[] winner) {
		winner[0] = jb00.getText();
		winner[1] = jb01.getText();
		winner[2] = jb02.getText();
		winner[3] = jb10.getText();
		winner[4] = jb11.getText();
		winner[5] = jb12.getText();
		winner[6] = jb20.getText();
		winner[7] = jb21.getText();
		winner[8] = jb22.getText();
	}
	
	public static void CheckUpdate() {
		
	}

	public void CreateGui() {
		blackline = BorderFactory.createLineBorder(Color.black);
		raisedetched = BorderFactory.createEtchedBorder(EtchedBorder.RAISED);
		loweredetched = BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);
		raisedbevel = BorderFactory.createRaisedBevelBorder();
		loweredbevel = BorderFactory.createLoweredBevelBorder();
		empty = BorderFactory.createEmptyBorder();
		
		Font dresFont = new Font("Serif", Font.BOLD, 96);
		
		//jb00,jb01,jb02,jb10,jb11,jb12,jb20,jb21,jb22;
		jb00 = new JButton();
		jb01 = new JButton();
		jb02 = new JButton();
		jb10 = new JButton();
		jb11 = new JButton();
		jb12 = new JButton();
		jb20 = new JButton();
		jb21 = new JButton();
		jb22 = new JButton();
		
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
		jb01.setFont(dresFont);
		jb02.setFont(dresFont);
		jb10.setFont(dresFont);
		jb11.setFont(dresFont);
		jb12.setFont(dresFont);
		jb20.setFont(dresFont);
		jb21.setFont(dresFont);
		jb22.setFont(dresFont);
		jb00.setActionCommand(Actions.Button00.name());
		jb00.addActionListener(this);
		
		jb01.setActionCommand(Actions.Button01.name());
		jb01.addActionListener(this);
		
		jb02.setActionCommand(Actions.Button02.name());
		jb02.addActionListener(this);
		
		jb10.setActionCommand(Actions.Button10.name());
		jb10.addActionListener(this);
		
		jb11.setActionCommand(Actions.Button11.name());
		jb11.addActionListener(this);
		
		jb12.setActionCommand(Actions.Button12.name());
		jb12.addActionListener(this);
		
		jb20.setActionCommand(Actions.Button20.name());
		jb20.addActionListener(this);
		
		jb21.setActionCommand(Actions.Button21.name());
		jb21.addActionListener(this);
		
		jb22.setActionCommand(Actions.Button22.name());
		jb22.addActionListener(this);
		
		JTextArea jtABlank = new JTextArea();
		
		JButton jbplayer1 = new JButton(plaOneStr);
		JButton jbplayer2 = new JButton(plaTwoStr);
		
		add(jbplayer1);
		add(jtABlank);
		add(jbplayer2);
		
		
		jbplayer1.addActionListener(this);
		jbplayer2.addActionListener(this);
		
	}

}
