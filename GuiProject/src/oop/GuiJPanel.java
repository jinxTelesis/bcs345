package oop;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;

import java.util.Scanner;

public class GuiJPanel extends JPanel implements ActionListener{
	
	//Object[] objectarr = new Object[1000];
	
	// got this from java documentation 
	Border blackline, raisedetched, loweredetched,
    raisedbevel, loweredbevel, empty;

	// got this from java documentation
	
	
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
	
	private JTextArea jTAtypeDisplay;
	private JTextArea jTASelectionDisplay;
	private JTextArea jTADisData;
	public Scanner scan = new Scanner(System.in);
	public String UserInput = "";
	
	private Person p1[] = new Person[20];
	private Employee e1[] = new Employee[20];
	private Faculty f1[] = new Faculty[20];
	private Student s1[] = new Student[20];
	private Undergraduate u1[] = new Undergraduate[20];
	private Graduate g1[] = new Graduate[20];
	
	private static int personArrCount =0; // refactored
	private static int employeeArrCount =0;
	private static int facultyArrCount = 0;
	private static int studentArrCount = 0;
	private static int underArrCount = 0;
	private static int fsdsdf =0;
	
	//
	private String objState = new String();
	private String alterState = new String();
	
	private String typeDisplay = "\n\n\n\n\n     Type currently \n        selected is";
	private String selDisplay = " Person Selected ";
	private String jlOneDis = " ";
	private String jlTwoDis = " ";
	private String jlFourDis = " ";
	private String jlFiveDis = " ";
	private String jlTADisData = " ";
	
	public GuiJPanel() {
		// from java documentation
		blackline = BorderFactory.createLineBorder(Color.black);
		raisedetched = BorderFactory.createEtchedBorder(EtchedBorder.RAISED);
		loweredetched = BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);
		raisedbevel = BorderFactory.createRaisedBevelBorder();
		loweredbevel = BorderFactory.createLoweredBevelBorder();
		empty = BorderFactory.createEmptyBorder();
		// from java documentation 
		
		
		jlOne = new JLabel(jlOneDis);
		jlTwo = new JLabel(jlTwoDis);
		jlThree = new JLabel("Select a type of member to alter");
		jlFour = new JLabel(jlFourDis);
		jlFive = new JLabel(jlFiveDis);
		jTAtypeDisplay = new JTextArea(typeDisplay, 10, 10);
		jTAtypeDisplay.setLineWrap(true);
		jTAtypeDisplay.setWrapStyleWord(true);
		jTAtypeDisplay.setBorder(raisedbevel);
		jTASelectionDisplay = new JTextArea(selDisplay, 5, 5);
		jTASelectionDisplay.setLineWrap(true);
		jTASelectionDisplay.setWrapStyleWord(true);
		jTASelectionDisplay.setBorder(raisedbevel);
		jTADisData = new JTextArea(jlTADisData, 5, 5);
		jTADisData.setLineWrap(true);
		jTADisData.setWrapStyleWord(true);
		jTADisData.setBorder(loweredbevel);
		jTADisData.setEditable(false);
		
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
		add(jTADisData);
		
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
					if(alterState.equalsIgnoreCase(" Creating ") && personArrCount < 10) // worked needs output message for past 10
					{
						System.out.println("Person update worked " + objState);
						System.out.println("Person update worked " + alterState);
						
						// need an incrementor for id?
						p1[personArrCount] = new Person();
						p1[personArrCount].setFirstName("Tom");
						p1[personArrCount].setLastName("Brandy");
						personArrCount++;
					}
					
					if(alterState.equalsIgnoreCase(" Removing ") && personArrCount > 0)
					{
						System.out.println("Person update worked " + objState);
						System.out.println("Person update worked " + alterState);
						
						// need an incrementor for id?
						p1[personArrCount].setFirstName("");
						p1[personArrCount].setLastName("");
						personArrCount--;
					}
					
					if(alterState.equalsIgnoreCase(" Updating ") && personArrCount > -1)
					{
						System.out.println("Person update worked " + objState);
						System.out.println("Person update worked " + alterState);
						
						// need an incrementor for id?
						p1[personArrCount].setFirstName("Jim");
						p1[personArrCount].setLastName("Candy");
					}
					
					if(alterState.equals(" Displaying ") && personArrCount > -1)
					{
						System.out.println("Person update worked " + objState);
						System.out.println("Person update worked " + alterState);
						jlTADisData = " worked !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! ";
						//private String jlOneDis = " ";
						//private String jlTwoDis = " ";
						//private String jlFourDis = " ";
						//private String jlFiveDis = " ";
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