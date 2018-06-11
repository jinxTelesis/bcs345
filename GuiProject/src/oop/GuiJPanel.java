package oop;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.util.Scanner;

public class GuiJPanel extends JPanel implements ActionListener{
	
	Object[] objectarr = new Object[1000];
	private static int objArrCount =0;
	
	public static final String Person = "Person";
	public static final String Employee = "Employee";
	public static final String Faculty = "Faculty";
	public static final String Undergraduate = "UnderGraduate";
	public static final String Graduate = "Graduate";
	public static final String Create = "Create";
	public static final String Remove = "Remove";
	public static final String Update = "Update";
	public static final String Display = "Display";
	public static final String Enter = "Enter";
	private JLabel jlOne, jlTwo, jlThree,jlFour,jlFive, jlSelect;
	private JButton jbPer,jbEmp,jbFac,jbUnd,jbGra;
	private JButton jbCreate, jbRemove, jbUpdate, jbDisplay;
	private JButton jbEnter;
	private static final int NUM_COLUMNS = 10;
	private String typeDisplay = "\n\n\n\n\n     Type currently \n        selected is";
	private String selDisplay = " Person Selected ";
	private JTextArea jTAtypeDisplay;
	private JTextArea jTASelectionDisplay;
	public Scanner scan = new Scanner(System.in);
	public String UserInput = "";
	
	private Person p1[] = new Person[20];
	private Employee e1[] = new Employee[20];
	private Faculty f1[] = new Faculty[20];
	private Student s1[] = new Student[20];
	private Undergraduate u1[] = new Undergraduate[20];
	private Graduate g1[] = new Graduate[20];
	
	
	//
	private String objState = new String();
	private String alterState = new String();
	
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
		jbEnter = new JButton(Enter);
		add(jbEnter);
		
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
		jbEnter.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		String cmd = e.getActionCommand();
		//String objState = new String(); // need a static?
		//String alterState = new String();
		
		switch(cmd) {
		case Person:
			objState = "Person";
			jTAtypeDisplay.setText(objState + " type currently selected "); 
			System.out.println( objState + " selected ");
			break;
			
		case Employee:
			objState = "Employee";
			jTAtypeDisplay.setText(objState + " type currently selected ");
			System.out.println( objState + " selected ");
			break;
			
		case Faculty:
			objState = "Faculty";
			jTAtypeDisplay.setText(objState + " type currently selected ");
			System.out.println( objState + " selected ");
			break;
			
		case Undergraduate:
			objState = "Undergraduate";
			jTAtypeDisplay.setText(objState + " type currently selected ");
			System.out.println( objState + " selected ");
			break;
			
		case Graduate:
			objState = "Graduate";
			jTAtypeDisplay.setText(objState + " type currently selected ");
			System.out.println( objState + " selected ");
			break;
			
		case Create:
			alterState = " Creating ";
			System.out.println(alterState + " an object ");
			break;
			
		case Remove:
			alterState = " Removing ";
			System.out.println(alterState + " an object ");
			break;
			
		case Update:
			alterState = " Updating ";
			System.out.println(alterState + " an object ");
			break;
			
		case Display:
			alterState = " Displaying ";
			System.out.println(alterState + " an object" );
			break;
		case Enter:
			System.out.print("Entering ");
			System.out.println(alterState);
			System.out.println(" changes to" + objState);
			
			switch(objState) // add text field or set up text field for display
			{
				case Person:
					if(alterState.equalsIgnoreCase(" Creating ") && objArrCount < 10) // worked needs output message for past 10
					{
						System.out.println("Person update worked " + objState);
						System.out.println("Person update worked " + alterState);
						
						// need an incrementor for id?
						p1[objArrCount] = new Person();
						p1[objArrCount].setFirstName("Tom");
						p1[objArrCount].setLastName("Brandy");
						objArrCount++;
					}
					
					if(alterState.equalsIgnoreCase(" Removing ") && objArrCount > 0)
					{
						System.out.println("Person update worked " + objState);
						System.out.println("Person update worked " + alterState);
						
						// need an incrementor for id?
						p1[objArrCount].setFirstName("");
						p1[objArrCount].setLastName("");
						objArrCount--;
					}
					
					if(alterState.equalsIgnoreCase(" Updating ") && objArrCount > -1)
					{
						System.out.println("Person update worked " + objState);
						System.out.println("Person update worked " + alterState);
						
						// need an incrementor for id?
						p1[objArrCount].setFirstName("Tom");
						p1[objArrCount].setLastName("Brady");
					}
					
					if(alterState.equals(" Displaying ") && objArrCount > -1)
					{
						System.out.println("Person update worked " + objState);
						System.out.println("Person update worked " + alterState);
					}
					System.out.println("Person update worked " + objState);
					System.out.println("Person update worked " + alterState);
					break;
				
				case Employee:
					break;
					
				case Faculty:
					break;
				
				case Undergraduate:
					break;
					
				case Graduate:
					break;
			
			}
			
			
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