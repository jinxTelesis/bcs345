package oop;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class FormJPanel extends JPanel implements ActionListener {
	
	private static final boolean Verbose = true;
	private JButton jb1;
	private String jlOneDis = "Enter a first name under me";
	private String jlTwoDis = "Enter a last name under me";
	private JLabel jlOne, jlTwo;
	private JTextArea pFirstjTA;
	private JTextArea jTASelectionDisplay; // rename
	public String PanelDataFirst = " ";
	public String PanelDataLast = " ";
	public FormJPanel() {if(Verbose) {
		
		
		
		jlOne = new JLabel(jlOneDis);
		jlTwo = new JLabel(jlTwoDis);
		add(jlOne);
		add(jlTwo);
		
		pFirstjTA = new JTextArea(PanelDataFirst, 10, 10);
		pFirstjTA.setLineWrap(true);
		pFirstjTA.setWrapStyleWord(true);
		//jTAtypeDisplay.setBorder(raisedbevel);
		jTASelectionDisplay = new JTextArea(PanelDataLast, 5, 5);
		jTASelectionDisplay.setLineWrap(true);
		jTASelectionDisplay.setWrapStyleWord(true);
		//jTASelectionDisplay.setBorder(raisedbevel);
		
		
		System.out.println(" Worker");}
	}
	

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	public int getIntFromTextField(JTextField jtf) {
		return Integer.parseInt(jtf.getText()); // assuming user always enters a number wrapper class!?
	}

}
