package oop;

// maybe reimplement the person type array
// using equals testing and a while loop to next object of that type
// refactor code with split into more class // functions
// build a form to collect data
// update class checking logic for constructors and course registration

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

// ask about the threading optimization
// stuff didn't work as expected with third level switch statements
// grading criteria? any filtering of user input // try exceptions
// aesthetics

import java.util.Scanner;

public class GuiJPanel extends JPanel implements ActionListener{
	
	//Object[] objectarr = new Object[1000];
	
	// just use a whiles than equals to remove items
	// dont need different types. 
	
	// got this from java documentation 
	Border blackline, raisedetched, loweredetched,
    raisedbevel, loweredbevel, empty;

	// got this from java documentation
	private static final Boolean Verbose = true;
	
	public static final String Person = "Person"; // could use a enum
	public static final String Employee = "Employee";
	public static final String Faculty = "Faculty";
	public static final String Staff = "Staff";
	public static final String Student = "Student";
	public static final String Undergraduate = "UnderGraduate";
	public static final String Graduate = "Graduate";
	public static final String Create = "Create";
	public static final String Remove = "Remove";
	public static final String Update = "Update";
	public static final String Display = "Display";
	public static final String Enter = "Enter";
	
	private JLabel jlOne, jlTwo, jlThree,jlFour,jlFive, jlSelect;
	private JButton jbPer,jbEmp,jbFac,jbSta,jbStu,jbUnd,jbGra;  // could use enums here
	private JButton jbCreate, jbRemove, jbUpdate, jbDisplay;// could use enums here
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
	private Staff st1[] = new Staff[20];
	private Undergraduate u1[] = new Undergraduate[20];
	private Graduate g1[] = new Graduate[20];
	
	
	private static int personArrCount =0; // refactored
	private static int employeeArrCount =0;
	private static int facultyArrCount = 0;
	private static int studentArrCount = 0;
	private static int underArrCount = 0;
	private static int staffArrCount =0;
	private static int gradeArrCount = 0;
	
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
		jbSta = new JButton(Staff);
		jbStu = new JButton(Student);
		jbUnd = new JButton(Undergraduate);
		jbGra = new JButton(Graduate);
		add(jbPer);
		add(jbEmp);
		add(jbFac);
		add(jbStu);
		add(jbSta);
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
		jbSta.addActionListener(this);
		jbStu.addActionListener(this);
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
		String testStr = new String();
		String cmd = e.getActionCommand();
		//String objState = new String(); // need a static?
		//String alterState = new String();
		
		switch(cmd) {
		case Person:
			objState = "Person";
			jTAtypeDisplay.setText(objState + " type currently selected ");
			if(Verbose)System.out.println( objState + " selected ");
			break;
			
		case Employee:
			objState = "Employee";
			jTAtypeDisplay.setText(objState + " type currently selected ");
			if(Verbose)System.out.println( objState + " selected ");
			break;
			
		case Faculty:
			objState = "Faculty";
			jTAtypeDisplay.setText(objState + " type currently selected ");
			if(Verbose)
			System.out.println( objState + " selected ");
			break;
			// need to add constant first
		case Staff:
			objState = "Staff";
			jTAtypeDisplay.setText(objState + " type currently selected ");
			if(Verbose)System.out.println( objState + " selected ");
			break;
		
		case Student:
			objState = "Student";
			jTAtypeDisplay.setText(objState + "type currently selected ");
			if(Verbose)System.out.println( objState + " selected ");
			break;
			
		case Undergraduate:
			objState = "Undergraduate";
			jTAtypeDisplay.setText(objState + " type currently selected ");
			if(Verbose)System.out.println( objState + " selected ");
			break;
			
		case Graduate:
			objState = "Graduate";
			jTAtypeDisplay.setText(objState + " type currently selected ");
			if(Verbose)System.out.println( objState + " selected ");
			break;
			
		case Create:
			alterState = " Creating ";
			if(Verbose)System.out.println(alterState + " an object ");
			break;
			
		case Remove:
			alterState = " Removing ";
			if(Verbose)System.out.println(alterState + " an object ");
			break;
			
		case Update:
			alterState = " Updating ";
			if(Verbose)System.out.println(alterState + " an object ");
			break;
			
		case Display:
			alterState = " Displaying ";
			if(Verbose)System.out.println(alterState + " an object" );
			break;
			
		case Enter:
			if(Verbose) {
			System.out.print("Entering ");
			System.out.println(alterState);
			System.out.println(" changes to" + objState);}
			
			switch(objState) // add text field or set up text field for display
			{
				case Person:
					if(alterState.equalsIgnoreCase(" Creating ") && personArrCount < 20) // worked needs output message for past 10
					{
						testStr = "Person"; if(Verbose) {// deliberate odd spacing
						System.out.println(testStr + " update worked " + objState);
						System.out.println(testStr + "Person update worked " + alterState);}
						p1[personArrCount] = new Person();
						p1[personArrCount].setFirstName("Tom");
						p1[personArrCount].setLastName("Brandy");
						personArrCount++;
					}
					
					if(alterState.equalsIgnoreCase(" Removing ") && personArrCount > 0)
					{
						testStr = "Person"; if(Verbose) {
						System.out.println(testStr + " update worked " + objState);
						System.out.println(testStr + " update worked " + alterState);}
						p1[personArrCount-1].setFirstName(" ");
						p1[personArrCount-1].setLastName(" ");
						
						// or
						p1[personArrCount-1] = null;
						personArrCount--;
					}
					
					if(alterState.equalsIgnoreCase(" Updating ") && personArrCount > 0)
					{
						testStr = "Person"; if(Verbose) {
						System.out.println(testStr + " update worked " + objState);
						System.out.println(testStr + " update worked " + alterState);}
						p1[personArrCount-1].setFirstName("Jim");
						p1[personArrCount-1].setLastName("Candy");
					}
					
					if(alterState.equals(" Displaying ") && personArrCount > 0)
					{
						testStr = "Person";if(Verbose) {
						System.out.println(testStr + " update worked " + objState);
						System.out.println(testStr + " update worked " + alterState);}
						jlTADisData = testStr + " 's name is: " + p1[personArrCount-1].getFirstName() +" \n ";
						jlTADisData += testStr + " 's last name is: " + p1[personArrCount-1].getLastName() + " \n ";
						jTADisData.setText(jlTADisData);
					}
					break;

				case Employee: 
					if(alterState.equalsIgnoreCase(" Creating ") && employeeArrCount < 20) // worked needs output message for past 10
					{
						testStr = "Employee"; if(Verbose) {
						System.out.println(testStr + " update worked " + objState);
						System.out.println(testStr + " update worked " + alterState);}
						
						e1[employeeArrCount] = new Employee("Jimbo ", " Ghost ", "Space Marine");
						employeeArrCount++;
					}
					
					if(alterState.equalsIgnoreCase(" Removing ") && employeeArrCount > 0)
					{
						testStr = "Employee"; if(Verbose) {
						System.out.println(testStr + " update worked " + objState);
						System.out.println(testStr + " update worked " + alterState);}
						e1[employeeArrCount-1].setFirstName(" ");
						e1[employeeArrCount-1].setLastName(" ");
						e1[employeeArrCount-1].setDeptName(" ");
						
						// or
						e1[employeeArrCount-1] = null;
						employeeArrCount--;
					}
					
					if(alterState.equalsIgnoreCase(" Updating ") && employeeArrCount > 0)
					{
						testStr = "Employee";if(Verbose) {
						System.out.println(testStr + " update worked " + objState);
						System.out.println(testStr + " update worked " + alterState);}
						e1[employeeArrCount-1].setFirstName("Jim");
						e1[employeeArrCount-1].setLastName("Candy");
						e1[employeeArrCount-1].setDeptName("Accounting");
					}
					
					if(alterState.equals(" Displaying ") && employeeArrCount > 0)
					{
						testStr = "Employee";if(Verbose) {
						System.out.println(testStr + " update worked " + objState);
						System.out.println(testStr + " update worked " + alterState);}
						jlTADisData = testStr + " 's name is: " + e1[employeeArrCount-1].getFirstName() +" \n ";
						jlTADisData += testStr + " 's last name is: " + e1[employeeArrCount-1].getLastName() + " \n ";
						jlTADisData += testStr + " 's department name is : " +e1[employeeArrCount-1].getDeptName();
						jTADisData.setText(jlTADisData);
					}
					break;
					
				case Faculty:
					if(alterState.equalsIgnoreCase(" Creating ") && facultyArrCount < 20) // worked needs output message for past 10
					{
						testStr = "Faculty";if(Verbose) {
						System.out.println(testStr + " update worked " + objState);
						System.out.println(testStr + " update worked " + alterState);}

						f1[facultyArrCount] = new Faculty();// 
						//f1[facultyArrCount].setFirstName("Tom");
						//f1[facultyArrCount].setLastName("Brandy");
						facultyArrCount++;
					}
					
					if(alterState.equalsIgnoreCase(" Removing ") && facultyArrCount > 0)
					{
						testStr = "Faculty";if(Verbose) {
						System.out.println(testStr + " update worked " + objState);
						System.out.println(testStr + " update worked " + alterState);}

						f1[facultyArrCount-1].setFirstName(" ");
						f1[facultyArrCount-1].setLastName(" ");
						facultyArrCount--;
					}
					
					if(alterState.equalsIgnoreCase(" Updating ") && facultyArrCount > 0)
					{
						testStr = "Faculty";if(Verbose) {
						System.out.println(testStr + " update worked " + objState);
						System.out.println(testStr + " update worked " + alterState);}
						
						// need an incrementor for id?
						f1[facultyArrCount-1].setFirstName("Jim");
						f1[facultyArrCount-1].setLastName("Candy");
					}
					
					if(alterState.equals(" Displaying ") && facultyArrCount> 0)
					{
						testStr = "Faculty";
						System.out.println(testStr + " update worked " + objState);
						System.out.println(testStr + " update worked " + alterState);
						jlTADisData = testStr + " 's name is: " + f1[facultyArrCount-1].getFirstName() +" \n ";
						jlTADisData += testStr + " 's last name is: " + f1[facultyArrCount-1].getLastName() + " \n ";
						jTADisData.setText(jlTADisData);
					}
					break;
					
				case Staff:
					if(alterState.equalsIgnoreCase(" Creating ") && staffArrCount < 20) // worked needs output message for past 10
					{
						testStr = "Staff";
						System.out.println(testStr + " update worked " + objState);
						System.out.println(testStr + " update worked " + alterState);
						
						// need an incrementor for id?
						st1[staffArrCount] = new Staff();// 
						st1[staffArrCount].setFirstName("Tom");
						st1[staffArrCount].setLastName("Brandy");
						staffArrCount++;
					}
					
					if(alterState.equalsIgnoreCase(" Removing ") && staffArrCount > 0)
					{
						testStr = "Staff";
						System.out.println(testStr + " update worked " + objState);
						System.out.println(testStr + " update worked " + alterState);
						
						// need an incrementor for id?
						st1[staffArrCount-1].setFirstName(" ");
						st1[staffArrCount-1].setLastName(" ");
						staffArrCount--;
					}
					
					if(alterState.equalsIgnoreCase(" Updating ") && staffArrCount > 0)
					{
						testStr = "Staff";
						System.out.println(testStr + " update worked " + objState);
						System.out.println(testStr + " update worked " + alterState);
						
						// need an incrementor for id?
						st1[staffArrCount-1].setFirstName("Jim");
						st1[staffArrCount-1].setLastName("Candy");
					}
					
					if(alterState.equals(" Displaying ") && staffArrCount> 0)
					{
						testStr = "Staff";
						System.out.println(testStr + " update worked " + objState);
						System.out.println(testStr + " update worked " + alterState);
						jlTADisData = testStr + " 's name is: " + st1[staffArrCount-1].getFirstName() +" \n ";
						jlTADisData += testStr + " 's last name is: " + st1[staffArrCount-1].getLastName() + " \n ";
						jTADisData.setText(jlTADisData);
					}
					break;
				
				case Undergraduate: // could just pass this all to a constructor... 
					if(alterState.equalsIgnoreCase(" Creating ") && underArrCount < 20) // worked needs output message for past 10
					{
						testStr = "Undergraduate";
						System.out.println(testStr + " update worked " + objState);
						System.out.println(testStr + " update worked " + alterState);
						
						// need an incrementor for id?
						u1[underArrCount] = new oop.Undergraduate();// 
						u1[underArrCount].setFirstName("Tom");
						u1[underArrCount].setLastName("Brandy");
						underArrCount++;
					}
					
					if(alterState.equalsIgnoreCase(" Removing ") && underArrCount > 0)
					{
						testStr = "Undergraduate";
						System.out.println(testStr + " update worked " + objState);
						System.out.println(testStr + " update worked " + alterState);
						
						// need an incrementor for id?
						u1[underArrCount-1].setFirstName(" ");
						u1[underArrCount-1].setLastName(" ");
						underArrCount--;
					}
					
					if(alterState.equalsIgnoreCase(" Updating ") && underArrCount > 0)
					{
						testStr = "Undergraduate";
						System.out.println(testStr + " update worked " + objState);
						System.out.println(testStr + " update worked " + alterState);
						
						// need an incrementor for id?
						u1[underArrCount-1].setFirstName("Jim");
						u1[underArrCount-1].setLastName("Candy");
					}
					
					if(alterState.equals(" Displaying ") && underArrCount> 0)
					{
						testStr = "Undergraduate";
						System.out.println(testStr + " update worked " + objState);
						System.out.println(testStr + " update worked " + alterState);
						jlTADisData = testStr + " 's name is: " + u1[underArrCount-1].getFirstName() +" \n ";
						jlTADisData += testStr + " 's last name is: " + u1[underArrCount-1].getLastName() + " \n ";
						jTADisData.setText(jlTADisData);
					}
					break;
					
					
					// here
				case Graduate:
					if(alterState.equalsIgnoreCase(" Creating ") && gradeArrCount < 20) // worked needs output message for past 10
					{
						testStr = "Undergraduate";
						System.out.println(testStr + " update worked " + objState);
						System.out.println(testStr + " update worked " + alterState);
						
						// need an incrementor for id?
						g1[gradeArrCount] = new oop.Graduate();// 
						g1[gradeArrCount].setFirstName("Tom");
						g1[gradeArrCount].setLastName("Brandy");
						gradeArrCount++;
					}
					
					if(alterState.equalsIgnoreCase(" Removing ") && gradeArrCount > 0)
					{
						testStr = "Undergraduate";
						System.out.println(testStr + " update worked " + objState);
						System.out.println(testStr + " update worked " + alterState);
						
						// need an incrementor for id?
						g1[gradeArrCount-1].setFirstName(" ");
						g1[gradeArrCount-1].setLastName(" ");
						gradeArrCount--;
					}
					
					if(alterState.equalsIgnoreCase(" Updating ") && gradeArrCount > 0)
					{
						testStr = "Undergraduate";
						System.out.println(testStr + " update worked " + objState);
						System.out.println(testStr + " update worked " + alterState);
						
						// need an incrementor for id?
						g1[gradeArrCount-1].setFirstName("Jim");
						g1[gradeArrCount-1].setLastName("Candy");
					}
					
					if(alterState.equals(" Displaying ") && gradeArrCount> 0)
					{
						testStr = "Undergraduate";
						System.out.println(testStr + " update worked " + objState);
						System.out.println(testStr + " update worked " + alterState);
						jlTADisData = testStr + " 's name is: " + g1[gradeArrCount-1].getFirstName() +" \n ";
						jlTADisData += testStr + " 's last name is: " + g1[gradeArrCount-1].getLastName() + " \n ";
						jTADisData.setText(jlTADisData);
					}
					break;
			
			}
		// remove this??	
			
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