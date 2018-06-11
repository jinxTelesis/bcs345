package oop;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class GuiJPanel extends JPanel implements ActionListener{
	
	Object[] objectarr = new Object[1000];
	public static final String Person = "Person";
	public static final String Employee = "Employee";
	public static final String Faculty = "Faculty";
	public static final String Undergraduate = "UnderGraduate";
	public static final String Graduate = "Graduate";
	public static final String Create = "Create";
	public static final String Remove = "Remove";
	public static final String Update = "Update";
	public static final String Display = "Display";
	private JLabel jlOne, jlTwo, jlThree,jlFour,jlFive, jlSelect;
	private JButton jbPer,jbEmp,jbFac,jbUnd,jbGra;
	private JButton jbCreate, jbRemove, jbUpdate, jbDisplay;
	private static final int NUM_COLUMNS = 10;
	private String typeDisplay = "\n\n\n\n\n     Type currently \n        selected is";
	private String selDisplay = " Person Selected ";
	private JTextArea jTAtypeDisplay;
	private JTextArea jTASelectionDisplay;
	
	public GuiJPanel() {
		jlOne = new JLabel("");
		jlTwo = new JLabel("");
		jlThree = new JLabel("Select a type of member to alter");
		jlFour = new JLabel("");
		jlFive = new JLabel("");
		jTAtypeDisplay = new JTextArea(typeDisplay, 10, 10);
		jTAtypeDisplay.setLineWrap(true);
		jTAtypeDisplay.setWrapStyleWord(true);
		jTASelectionDisplay = new JTextArea(selDisplay, 5, 5);
		jTASelectionDisplay.setLineWrap(true);
		jTASelectionDisplay.setWrapStyleWord(true);
		
		// add highlight for the data type
		add(jlOne);
		add(jlTwo);
		add(jlThree);
		add(jlFour);
		add(jlFive);
		jbPer = new JButton(Person);
		jbEmp = new JButton(Employee);
		jbFac = new JButton(Faculty);
		jbUnd = new JButton(Undergraduate);
		jbGra = new JButton(Graduate);
		add(jbPer);
		add(jbEmp);
		add(jbFac);
		add(jbUnd);
		add(jbGra);
		
		jbCreate = new JButton(Create);
		jbRemove = new JButton(Remove);
		jbUpdate = new JButton(Update);
		jbDisplay = new JButton(Display);
		add(jbCreate);
		add(jbRemove);
		add(jTAtypeDisplay);
		add(jbUpdate);
		add(jbDisplay);
		
		add(jTASelectionDisplay);
		
		jbPer.addActionListener(this);
		jbEmp.addActionListener(this);
		jbFac.addActionListener(this);
		jbUnd.addActionListener(this);
		jbGra.addActionListener(this);
		jbCreate.addActionListener(this);
		jbRemove.addActionListener(this);
		jbUpdate.addActionListener(this);
		jbDisplay.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		String cmd = e.getActionCommand();
		
		switch(cmd) {
		case Person:
			
			System.out.println(" Person selected ");
			break;
			
		case Employee:
			System.out.println(" Employee selected ");
			break;
			
		case Faculty:
			System.out.println(" Faculty selected ");
			break;
			
		case Undergraduate:
			System.out.println(" Undergraduate selected ");
			break;
			
		case Graduate:
			System.out.println(" Graduate selected ");
			break;
			
		case Create:
			System.out.println(" Creating an object ");
			break;
			
		case Remove:
			System.out.println(" Removing an object ");
			break;
			
		case Update:
			System.out.println(" Updating an object ");
			break;
			
		case Display:
			System.out.println(" Displaying an object" );
			break;
		
		default:
			
			break;
		}
		
		
	}
	
	
	public int getIntFromTextField(JTextField jtf) {
		return Integer.parseInt(jtf.getText()); // assuming user always enters a number wrapper class!?
	}
	
	//inner class nested class for textfields
	
	//nested class for jbuttons

}