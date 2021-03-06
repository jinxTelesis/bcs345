package oop;

// maybe reimplement the person type array
// using equals testing and a while loop to next object of that type
// refactor code with split into more class // functions
// build a form to collect data
// update class checking logic for constructors and course registration
//inner class nested class for textfields
//nested class for jbuttons
//need to clear output display text

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;

import java.util.Arrays;

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
	private static final Boolean Verbose = false;
	
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
	
	public static final String jbCycDisStr = "Traverse Object Index";
	
	
	
	private JLabel jlOne, jlTwo, jlThree,jlFour,jlFive, jlSelect;
	private JButton jbPer,jbEmp,jbFac,jbSta,jbStu,jbUnd,jbGra;  // could use enums here
	private JButton jbCreate, jbRemove, jbUpdate, jbDisplay;// could use enums here
	private JButton jbEnter;
	
	private JButton jbCycleDisplay;
	
	private static final int NUM_COLUMNS = 10;
	
	private JTextArea jTAtypeDisplay;
	private JTextArea jTASelectionDisplay;
	private JTextArea jTADisData;
	private JTextArea jTAInstructions;
	private JTextArea jTAPrimaryInstr;
	public Scanner scan = new Scanner(System.in);
	public String UserInput = "";
	
	private Person p1[] = new Person[20];
	private Employee e1[] = new Employee[20];
	private Faculty f1[] = new Faculty[20];
	private Student s1[] = new Student[20];
	private Staff st1[] = new Staff[20];
	private UnderGraduate u1[] = new UnderGraduate[20];
	private Graduate g1[] = new Graduate[20];
	private String tempStrArr[] = new String[15];
	
	
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
	//private String selDisplay = "Enter data here one line at a time ";
	private String selDisplay = " Enter text here (delete this)";
	private String instrDIsplay = " ";
	private String jlFourDis = " ";
	private String jlFiveDis = " ";
	private String jlTADisData = " ";
	private String jlTAPrimaryInstructionString = " First Select a type \n If creating or updating \n enter text seperated \n word"
			+ " by word with return \n in the bottom center panel \n second select the operation \n create, remove, update \n or display \n"
			+ "lastly hit enter ";
	
	public GuiJPanel() {
		// from java documentation
		blackline = BorderFactory.createLineBorder(Color.black);
		raisedetched = BorderFactory.createEtchedBorder(EtchedBorder.RAISED);
		loweredetched = BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);
		raisedbevel = BorderFactory.createRaisedBevelBorder();
		loweredbevel = BorderFactory.createLoweredBevelBorder();
		empty = BorderFactory.createEmptyBorder();
		// from java documentation 
		
		
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
		
		
		jTAInstructions = new JTextArea(instrDIsplay,5,5);
		jTAInstructions.setLineWrap(true);
		jTAInstructions.setWrapStyleWord(true);
		jTAInstructions.setBorder(loweredbevel);
		jTADisData.setEditable(false);
		
		jTAPrimaryInstr = new JTextArea(jlTAPrimaryInstructionString,5,5);
		jTAPrimaryInstr.setLineWrap(true);
		jTAPrimaryInstr.setWrapStyleWord(true);
		jTAPrimaryInstr.setBorder(loweredbevel);
		jTAPrimaryInstr.setEditable(false);
		
		// add highlight for the data type
		add(jlThree);
		add(jTAPrimaryInstr);
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
		
		add(jTAInstructions);
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
			 
			instrDIsplay = "Enter first name: \n";
			instrDIsplay += "Enter last name: ";
			jTAInstructions.setText(instrDIsplay);
			instrDIsplay = " ";
			break;
			
		case Employee:
			objState = "Employee";
			jTAtypeDisplay.setText(objState + " type currently selected ");
			if(Verbose)System.out.println( objState + " selected ");
			instrDIsplay = "Enter first name: \n";
			instrDIsplay += "Enter last name: ";
			instrDIsplay += "Enter dept name: ";
			jTAInstructions.setText(instrDIsplay);
			instrDIsplay = " ";
			break;
			
		case Faculty:
			objState = "Faculty";
			jTAtypeDisplay.setText(objState + " type currently selected ");
			if(Verbose)
			System.out.println( objState + " selected ");
			instrDIsplay = "Enter first name: \n";
			instrDIsplay += "Enter last name: ";
			instrDIsplay += "Enter dept name: ";
			instrDIsplay += "Enter 0-9 courses: ";
			jTAInstructions.setText(instrDIsplay);
			instrDIsplay = " ";
			break;

		case Staff:
			objState = "Staff";
			jTAtypeDisplay.setText(objState + " type currently selected ");
			if(Verbose)System.out.println( objState + " selected ");
			instrDIsplay = "Enter first name: \n";
			instrDIsplay += "Enter last name: ";
			instrDIsplay += "Enter dept name: ";
			instrDIsplay += "Enter 0-9 duties: ";
			jTAInstructions.setText(instrDIsplay);
			instrDIsplay = " ";
			break;
		
		case Student:
			objState = "Student";
			jTAtypeDisplay.setText(objState + "type currently selected ");
			if(Verbose)System.out.println( objState + " selected ");
			instrDIsplay = "Enter first name: \n";
			instrDIsplay += "Enter last name: ";
			instrDIsplay += "matr status U or G";
			instrDIsplay += "Enter 0-7 courses";
			jTAInstructions.setText(instrDIsplay);
			instrDIsplay = " ";
			break;
			
		case Undergraduate:
			objState = "Undergraduate";
			jTAtypeDisplay.setText(objState + " type currently selected ");
			if(Verbose)System.out.println( objState + " selected ");
			instrDIsplay = "Enter first name: \n";
			instrDIsplay += "Enter last name: ";
			instrDIsplay += "Enter 0-7 courses";
			instrDIsplay += "only undergraduate";
			jTAInstructions.setText(instrDIsplay);
			instrDIsplay = " ";
			break;
			
		case Graduate:
			objState = "Graduate";
			jTAtypeDisplay.setText(objState + " type currently selected ");
			if(Verbose)System.out.println( objState + " selected ");
			instrDIsplay = "Enter first name: \n";
			instrDIsplay += "Enter last name: ";
			instrDIsplay += "Enter 0-7 courses";
			instrDIsplay += "only graduate";
			jTAInstructions.setText(instrDIsplay);
			instrDIsplay = " ";
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
						createPer();
						++personArrCount;
//						/*javax.swing.SwingUtilities.invokeLater(new Runnable() {
//							
//							@Override
//							public void run() {
//							FormJFrame formJFrame1 = new FormJFrame();
//							formJFrame1.setVisible(true);
//							formJFrame1.setSize(600, 600);
//							formJFrame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//							}
//							});*/
						
//						
					}
					
					if(alterState.equalsIgnoreCase(" Removing ") && personArrCount > 0)
					{
						testStr = "Person"; if(Verbose) {
						System.out.println(testStr + " update worked " + objState);
						System.out.println(testStr + " update worked " + alterState);}
						p1[personArrCount-1].setFirstName(" ");
						p1[personArrCount-1].setLastName(" ");
						
						// or
						//p1[personArrCount-1] = null;
						personArrCount--;
					}
					
					if(alterState.equalsIgnoreCase(" Updating ") && personArrCount > 0)
					{
						testStr = "Person"; if(Verbose) {
						System.out.println(testStr + " update worked " + objState);
						System.out.println(testStr + " update worked " + alterState);}
						
						String s = jTASelectionDisplay.getText();
						
						String[] tempStrArrfPer = new String[15];
						boolean newLine = true;
						int wordIndex = 0;
						char ch;
						for (int i =0; i < s.length();i++)
						{
							ch = s.charAt(i);
							if(Character.isLetter(ch))
							{
								tempStrArrfPer[wordIndex] += ch;
								newLine = false;
							}
							else
							{
								if (newLine == false)
								{
									wordIndex++;
									newLine = true;
								}
							}
							
						}
						s ="";
						
						for(int i = 0;i < wordIndex;i++)
						{
							tempStrArrfPer[i].replace("null", "");
						}
						
						p1[personArrCount-1].setFirstName(tempStrArrfPer[0]);
						p1[personArrCount-1].setLastName(tempStrArrfPer[1]);
					}
					
					if(alterState.equals(" Displaying ") && personArrCount > 0)
					{
						testStr = "Person";if(Verbose) {
						System.out.println(testStr + " update worked " + objState);
						System.out.println(testStr + " update worked " + alterState);}
						//jlTADisData = testStr + " 's name is: " + p1[personArrCount-1].getFirstName() +" \n ";
						//jlTADisData += testStr + " 's last name is: " + p1[personArrCount-1].getLastName() + " \n ";
						
						jlTADisData = " ";
						jTADisData.setText(jlTADisData);
						
						System.out.println("this is count number " + personArrCount);
						jlTADisData += p1[personArrCount-1].toString();
						jTADisData.setText(jlTADisData);
					}
					break;

				case Employee: 
					if(alterState.equalsIgnoreCase(" Creating ") && employeeArrCount < 20) // worked needs output message for past 10
					{
						createEmp();
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
						
						String[] tempStrArrfEMP = new String[15];
						String s = jTASelectionDisplay.getText();
						boolean newLine = true;
						int wordIndex = 0;
						char ch;
						for (int i =0; i < s.length();i++)
						{
							ch = s.charAt(i);
							if(Character.isLetter(ch))
							{
								tempStrArrfEMP[wordIndex] += ch;
								newLine = false;
							}
							else
							{
								if (newLine == false)
								{
									wordIndex++;
									newLine = true;
								}
							}
							
						}
						s = "";
						
						for(int i = 0;i < wordIndex;i++)
						{
							tempStrArr[i].replace("null", "");
						}
						
						e1[employeeArrCount-1].setFirstName(tempStrArrfEMP[0]);
						e1[employeeArrCount-1].setLastName(tempStrArrfEMP[1]);
						e1[employeeArrCount-1].setDeptName(tempStrArrfEMP[2]);
					}
					
					if(alterState.equals(" Displaying ") && employeeArrCount > 0)
					{
						testStr = "Employee";if(Verbose) {
						System.out.println(testStr + " update worked " + objState);
						System.out.println(testStr + " update worked " + alterState);}
						//jlTADisData = testStr + " 's name is: " + e1[employeeArrCount-1].getFirstName() +" \n ";
						//jlTADisData += testStr + " 's last name is: " + e1[employeeArrCount-1].getLastName() + " \n ";
						//jlTADisData += testStr + " 's department name is : " +e1[employeeArrCount-1].getDeptName();
						jlTADisData = " ";
						jTADisData.setText(jlTADisData);
						jlTADisData += e1[employeeArrCount-1].toString();
						jTADisData.setText(jlTADisData);
					}
					break;
					
				case Faculty:
					if(alterState.equalsIgnoreCase(" Creating ") && facultyArrCount < 20) // worked needs output message for past 10
					{
						facultyArrCount++;
						createFac();
					}
					
					if(alterState.equalsIgnoreCase(" Removing ") && facultyArrCount > 0)
					{
						testStr = "Faculty";if(Verbose) {
						System.out.println(testStr + " update worked " + objState);
						System.out.println(testStr + " update worked " + alterState);}

						f1[facultyArrCount-1].setFirstName(" ");
						f1[facultyArrCount-1].setLastName(" ");
						
						f1[facultyArrCount-1] = null;
						facultyArrCount--;
					}
					
					if(alterState.equalsIgnoreCase(" Updating ") && facultyArrCount > 0)
					{
						
						String[] tempStrArrf = new String[15];
						String s = jTASelectionDisplay.getText();
						boolean newLine = true;
						int wordIndex = 0;
						char ch;
						for (int i =0; i < s.length();i++)
						{
							ch = ' ';
							ch = s.charAt(i);
							if(Character.isLetter(ch))
							{
								tempStrArrf[wordIndex] += ch;
								newLine = false;
							}
							else
							{
								if (newLine == false)
								{
									wordIndex++;
									newLine = true;
								}
							}
						}

						String courseArr[] = new String[9];
						
						for(int i = 3; i <wordIndex;i++)
						{
							courseArr[i] = tempStrArrf[i].replaceAll("null", "");
						}
						
						f1[facultyArrCount-1].setFirstName(tempStrArrf[0].replaceAll("null", ""));
						f1[facultyArrCount-1].setLastName(tempStrArrf[1].replaceAll("null", ""));
						f1[facultyArrCount-1].setDeptName(tempStrArrf[2].replaceAll("null", ""));
						f1[facultyArrCount-1].setCourseArr(courseArr, wordIndex);
						
					}
					
					if(alterState.equals(" Displaying ") && facultyArrCount> 0)
					{
						jlTADisData = " ";
						jTADisData.setText(jlTADisData);
						
						jlTADisData += f1[facultyArrCount - 1].toString(); 
						jTADisData.setText(jlTADisData);
					}
					break;
					
				case Staff:
					if(alterState.equalsIgnoreCase(" Creating ") && staffArrCount < 20) // worked needs output message for past 10
					{
						
						staffArrCount++;
						createSta();
						
					}
					
					if(alterState.equalsIgnoreCase(" Removing ") && staffArrCount > 0)
					{
						testStr = "Staff";if(Verbose) {
						System.out.println(testStr + " update worked " + objState);
						System.out.println(testStr + " update worked " + alterState);}
						st1[staffArrCount-1].setFirstName(" ");
						st1[staffArrCount-1].setLastName(" ");
						
						st1[staffArrCount-1] = null;
						staffArrCount--;
					}
					
					if(alterState.equalsIgnoreCase(" Updating ") && staffArrCount > 0)
					{
							String[] tempStrArrStaff = new String[15];
							String s = jTASelectionDisplay.getText();
							boolean newLine = true;
							int wordIndex = 0;
							char ch;
							for (int i =0; i < s.length();i++)
							{
								ch = ' ';
								ch = s.charAt(i);
								if(Character.isLetter(ch))
								{
									tempStrArrStaff[wordIndex] += ch;
									newLine = false;
								}
								else
								{
									if (newLine == false)
									{
										wordIndex++;
										newLine = true;
									}
								}
							}

							String dutiesArr[] = new String[9];
							
							for(int i = 3; i <wordIndex;i++)
							{
								dutiesArr[i] = tempStrArrStaff[i].replaceAll("null", "");
							}
							
						
						st1[staffArrCount-1].setFirstName(tempStrArrStaff[0].replaceAll("null", ""));
						st1[staffArrCount-1].setLastName(tempStrArrStaff[1].replaceAll("null", ""));
						st1[staffArrCount-1].setDeptName(tempStrArrStaff[2].replaceAll("null", ""));
						st1[staffArrCount-1].setDuties(dutiesArr, wordIndex);
					}
					
					if(alterState.equals(" Displaying ") && staffArrCount> 0)
					{
						testStr = "Staff";if(Verbose) {
						System.out.println(testStr + " update worked " + objState);
						System.out.println(testStr + " update worked " + alterState);}
						//jlTADisData = testStr + " 's name is: " + st1[staffArrCount-1].getFirstName() +" \n ";
						//jlTADisData += testStr + " 's last name is: " + st1[staffArrCount-1].getLastName() + " \n ";
						jlTADisData = " ";
						jTADisData.setText(jlTADisData);
						jlTADisData += st1[staffArrCount-1].toString();
						jTADisData.setText(jlTADisData);
					}
					break;
					
				case Student:
					
					if(alterState.equalsIgnoreCase(" Creating ") && studentArrCount < 20) // worked needs output message for past 10
					{
						
						studentArrCount++;
						createStu();
					}
					
					if(alterState.equalsIgnoreCase(" Removing ") && studentArrCount > 0)
					{
						testStr = "Student";if(Verbose) {
						System.out.println(testStr + " update worked " + objState);
						System.out.println(testStr + " update worked " + alterState);}
						s1[studentArrCount-1].setFirstName(" ");
						s1[studentArrCount-1].setLastName(" ");
						
						s1[studentArrCount-1] = null;
						studentArrCount--;
					}
					
					if(alterState.equalsIgnoreCase(" Updating ") && studentArrCount > 0)
					{
						String[] tempStrArrSTU = new String[15];
						String s = jTASelectionDisplay.getText();
						boolean newLine = true;
						int wordIndex = 0;
						char ch;
						for (int i =0; i < s.length();i++)
						{
							ch = ' ';
							ch = s.charAt(i);
							if(Character.isLetter(ch))
							{
								tempStrArrSTU[wordIndex] += ch;
								newLine = false;
							}
							else
							{
								if (newLine == false)
								{
									wordIndex++;
									newLine = true;
								}
							}
						}

						String courseArr[] = new String[9];
						
						for(int i = 3; i <wordIndex;i++)
						{
							courseArr[i] = tempStrArrSTU[i].replaceAll("null", "");
						}
						
						s1[studentArrCount-1].setFirstName(tempStrArrSTU[0]);
						s1[studentArrCount-1].setLastName(tempStrArrSTU[1]);
						s1[studentArrCount-1].setMatriculantStatus(tempStrArrSTU[2].charAt(0));
						s1[studentArrCount-1].setCoursesTaken(courseArr, wordIndex);
					}
					
					if(alterState.equals(" Displaying ") && studentArrCount> 0)
					{
						testStr = "Student";if(Verbose) {
						System.out.println(testStr + " update worked " + objState);
						System.out.println(testStr + " update worked " + alterState);}
						//jlTADisData = testStr + " 's name is: " + st1[staffArrCount-1].getFirstName() +" \n ";
						//jlTADisData += testStr + " 's last name is: " + st1[staffArrCount-1].getLastName() + " \n ";
						jlTADisData = " ";
						jTADisData.setText(jlTADisData);
						jlTADisData += s1[studentArrCount-1].toString();
						jTADisData.setText(jlTADisData);
					}
					break;
			
				case Undergraduate: // could just pass this all to a constructor... 
					
					if(alterState.equalsIgnoreCase(" Creating ") && underArrCount < 20) // worked needs output message for past 10
					{
						System.out.println("bdafssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssss\ndasf\ndsafffffffff\n");
						underArrCount++;
						System.out.println("this was called");
						createUnG();
					}
					
					if(alterState.equalsIgnoreCase(" Removing ") && underArrCount > 0)
					{
						System.out.println("bdafssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssss\ndasf\ndsafffffffff\n");
						testStr = "Undergraduate";if(Verbose) {
						System.out.println(testStr + " update worked " + objState);
						System.out.println(testStr + " update worked " + alterState);}
						u1[underArrCount-1].setFirstName(" ");
						u1[underArrCount-1].setLastName(" ");
						underArrCount--;
					}
					
					if(alterState.equalsIgnoreCase(" Updating ") && underArrCount > 0)
					{
						String[] tempStrArrTen = new String[15];
						String s = jTASelectionDisplay.getText();
						boolean newLine = true;
						int wordIndex = 0;
						char ch;
						for (int i =0; i < s.length();i++)
						{
							ch = ' ';
							ch = s.charAt(i);
							if(Character.isLetter(ch))
							{
								tempStrArrTen[wordIndex] += ch;
								newLine = false;
							}
							else
							{
								if (newLine == false)
								{
									wordIndex++;
									newLine = true;
								}
							}
						}

						String courseArr[] = new String[9];
						
						for(int i = 3; i <wordIndex;i++)
						{
							courseArr[i] = tempStrArrTen[i].replaceAll("null", "");
						}

						
						u1[underArrCount-1].setFirstName(tempStrArrTen[0]);
						u1[underArrCount-1].setLastName(tempStrArrTen[1]);
						u1[underArrCount-1].setCoursesTaken(courseArr, wordIndex);
					}
					
					if(alterState.equals(" Displaying ") && underArrCount> 0)
					{
						System.out.println("bdafssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssss\ndasf\ndsafffffffff\n");
						testStr = "Undergraduate";if(Verbose) {
						System.out.println(testStr + " update worked " + objState);
						System.out.println(testStr + " update worked " + alterState);}
						//jlTADisData = testStr + " 's name is: " + u1[underArrCount-1].getFirstName() +" \n ";
						//jlTADisData += testStr + " 's last name is: " + u1[underArrCount-1].getLastName() + " \n ";
						jlTADisData = " ";
						jTADisData.setText(jlTADisData);
						jlTADisData += u1[underArrCount-1].toString();
						jTADisData.setText(jlTADisData);
					}
					
					break;

				case Graduate:
					if(alterState.equalsIgnoreCase(" Creating ") && gradeArrCount < 20) // worked needs output message for past 10
					{
						createGra();
						gradeArrCount++;						
					}
					
					if(alterState.equalsIgnoreCase(" Removing ") && gradeArrCount > 0)
					{

						g1[gradeArrCount-1].setFirstName(" ");
						g1[gradeArrCount-1].setLastName(" ");
						gradeArrCount--;
						g1[gradeArrCount-1] = null;
					}
					
					if(alterState.equalsIgnoreCase(" Updating ") && gradeArrCount > 0)
					{
						String[] tempStrArrUnder = new String[15];
						String s = jTASelectionDisplay.getText();
						boolean newLine = true;
						int wordIndex = 0;
						char ch;
						for (int i =0; i < s.length();i++)
						{
							ch = ' ';
							ch = s.charAt(i);
							if(Character.isLetter(ch))
							{
								tempStrArrUnder[wordIndex] += ch;
								newLine = false;
							}
							else
							{
								if (newLine == false)
								{
									wordIndex++;
									newLine = true;
								}
							}
						}

						String courseArr[] = new String[9];
						
						for(int i = 3; i <wordIndex;i++)
						{
							courseArr[i] = tempStrArrUnder[i].replaceAll("null", "");
						}
						
						//Graduate(String firstName, String lastName, String[] coursesTaken)
						
						g1[gradeArrCount-1].setFirstName(tempStrArrUnder[0].replaceAll("null", ""));
						g1[gradeArrCount-1].setLastName(tempStrArrUnder[1].replaceAll("null", ""));
						g1[gradeArrCount-1].setCoursesTaken(courseArr, wordIndex);
					}
					
					if(alterState.equals(" Displaying ") && gradeArrCount> 0)
					{
						testStr = "Undergraduate";if(true) {
						System.out.println(testStr + " update worked " + objState);
						System.out.println(testStr + " update worked " + alterState);}
						//jlTADisData = testStr + " 's name is: " + g1[gradeArrCount-1].getFirstName() +" \n ";
						//jlTADisData += testStr + " 's last name is: " + g1[gradeArrCount-1].getLastName() + " \n ";
						
						
						jlTADisData = " ";
						jTADisData.setText(jlTADisData);
						jlTADisData += g1[gradeArrCount-1].toString();
						jTADisData.setText(jlTADisData);
					}
					break;
			
			}

		}
		
		
	}

	public void createPer() {
		String[] tempStrArr = new String[15];
		String s = jTASelectionDisplay.getText();
		boolean newLine = true;
		int wordIndex = 0;
		char ch;
		for (int i =0; i < s.length();i++){
			
			ch = ' ';
			ch = s.charAt(i);
			if(Character.isLetter(ch))
			{
				tempStrArr[wordIndex] += ch;
				newLine = false;
			}
			else
			{
				if (newLine == false)
				{
					wordIndex++;
					newLine = true;
				}
			}
		}
		p1[personArrCount] = new Person(tempStrArr[0].replaceAll("null", ""),tempStrArr[1].replaceAll("null", ""));
	}
	
	public void createEmp()
	{

		String[] tempStrArr = new String[15];
		String s = jTASelectionDisplay.getText();
		boolean newLine = true;
		int wordIndex = 0;
		char ch;
		for (int i =0; i < s.length();i++)
		{
			ch = ' ';
			ch = s.charAt(i);
			if(Character.isLetter(ch))
			{
				tempStrArr[wordIndex] += ch;
				newLine = false;
			}
			else
			{
				if (newLine == false)
				{
					wordIndex++;
					newLine = true;
				}
			}
		}
		
		e1[employeeArrCount] = new Employee(tempStrArr[0].replaceAll("null", ""), tempStrArr[1].replaceAll("null", ""), tempStrArr[2].replaceAll("null", ""));
	}
	
	public void createFac()
	{
		String[] tempStrArr = new String[15];
		String s = jTASelectionDisplay.getText();
		boolean newLine = true;
		int wordIndex = 0;
		char ch;
		for (int i =0; i < s.length();i++)
		{
			ch = ' ';
			ch = s.charAt(i);
			if(Character.isLetter(ch))
			{
				tempStrArr[wordIndex] += ch;
				newLine = false;
			}
			else
			{
				if (newLine == false)
				{
					wordIndex++;
					newLine = true;
				}
			}
		}

		String courseArr[] = new String[9];
		
		for(int i = 3; i <wordIndex;i++)
		{
			courseArr[i] = tempStrArr[i].replaceAll("null", "");
		}

		f1[facultyArrCount] = new Faculty(tempStrArr[0].replaceAll("null", ""), tempStrArr[1].replaceAll("null", ""), tempStrArr[2].replaceAll("null", ""),courseArr, wordIndex);
	}
	
	public void createSta() {
		String[] tempStrArr = new String[15];
		String s = jTASelectionDisplay.getText();
		boolean newLine = true;
		int wordIndex = 0;
		char ch;
		for (int i =0; i < s.length();i++)
		{
			ch = ' ';
			ch = s.charAt(i);
			if(Character.isLetter(ch))
			{
				tempStrArr[wordIndex] += ch;
				newLine = false;
			}
			else
			{
				if (newLine == false)
				{
					wordIndex++;
					newLine = true;
				}
			}
		}

		String dutiesArr[] = new String[9];
		
		for(int i = 3; i <wordIndex;i++)
		{
			dutiesArr[i] = tempStrArr[i].replaceAll("null", "");
		}
		
		st1[staffArrCount] = new Staff(tempStrArr[0],tempStrArr[1],tempStrArr[2],dutiesArr, wordIndex);
		
	}
	
	public void createStu() {
		String[] tempStrArr = new String[15];
		String s = jTASelectionDisplay.getText();
		boolean newLine = true;
		int wordIndex = 0;
		char ch;
		for (int i =0; i < s.length();i++)
		{
			ch = ' ';
			ch = s.charAt(i);
			if(Character.isLetter(ch))
			{
				tempStrArr[wordIndex] += ch;
				newLine = false;
			}
			else
			{
				if (newLine == false)
				{
					wordIndex++;
					newLine = true;
				}
			}
		}

		String courseArr[] = new String[9];
		
		for(int i = 3; i <wordIndex;i++)
		{
			courseArr[i] = tempStrArr[i].replaceAll("null", "");
		}
			
			
		s1[studentArrCount] = new Student(tempStrArr[0],tempStrArr[1],tempStrArr[2].charAt(0),courseArr, wordIndex);	
	}
	
	public void createUnG() {
		String[] tempStrArr = new String[15];
		String s = jTASelectionDisplay.getText();
		boolean newLine = true;
		int wordIndex = 0;
		char ch;
		for (int i =0; i < s.length();i++)
		{
			ch = ' ';
			ch = s.charAt(i);
			if(Character.isLetter(ch))
			{
				tempStrArr[wordIndex] += ch;
				newLine = false;
			}
			else
			{
				if (newLine == false)
				{
					wordIndex++;
					newLine = true;
				}
			}
		}

		String courseArr[] = new String[9];
		
		for(int i = 3; i <wordIndex;i++)
		{
			courseArr[i] = tempStrArr[i].replaceAll("null", "");
		}
		
		System.out.println("this was called");
		u1[underArrCount] = new oop.UnderGraduate(tempStrArr[0].replaceAll("null", ""),tempStrArr[1].replaceAll("null", ""),courseArr, wordIndex);
	}
	
	public void createGra() {
		
		String[] tempStrArr = new String[15];
		String s = jTASelectionDisplay.getText();
		boolean newLine = true;
		int wordIndex = 0;
		char ch;
		for (int i =0; i < s.length();i++)
		{
			ch = ' ';
			ch = s.charAt(i);
			if(Character.isLetter(ch))
			{
				tempStrArr[wordIndex] += ch;
				newLine = false;
			}
			else
			{
				if (newLine == false)
				{
					wordIndex++;
					newLine = true;
				}
			}
		}

		String courseArr[] = new String[9];
		
		for(int i = 3; i <wordIndex;i++)
		{
			courseArr[i] = tempStrArr[i].replaceAll("null", "");
		}
		//g1[gradeArrCount] = new Graduate(tempStrArr[0], tempStrArr[1], courseArr);
		
		g1[gradeArrCount] = new Graduate(tempStrArr[0].replaceAll("null",  ""), tempStrArr[0].replaceAll("null", ""), courseArr, wordIndex);
	}
	
}