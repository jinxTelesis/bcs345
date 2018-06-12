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
	private JButton jb1Exit;
	private String jlOneDis = "Enter a first name under me";
	private String jlTwoDis = "Enter a last name under me";
	private JLabel jlOne, jlTwo;
	private JTextArea pFirstjTA;
	private JTextArea pLastJTA; // rename
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
		add(pFirstjTA);
		//jTAtypeDisplay.setBorder(raisedbevel);
		pLastJTA = new JTextArea(PanelDataLast, 5, 5);
		pLastJTA.setLineWrap(true);
		pLastJTA.setWrapStyleWord(true);
		add(pLastJTA);
		//jTASelectionDisplay.setBorder(raisedbevel);
		
		jb1Exit = new JButton("Enter Data");
		add(jb1Exit);
		jb1Exit.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e)
		    {
		    	System.exit(0);
		    }
		});
		
		System.out.println(" Worked");}
	}
	

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	public int getIntFromTextField(JTextField jtf) {
		return Integer.parseInt(jtf.getText()); // assuming user always enters a number wrapper class!?
	}

}
