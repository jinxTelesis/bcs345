package oop;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class GuiJPanel extends JPanel implements ActionListener{
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
	private String typeDisplay = "Type currently \n selected is";
	private JTextArea jTAtypeDisplay;
	
	public GuiJPanel() {
		jlOne = new JLabel("");
		jlTwo = new JLabel("");
		jlThree = new JLabel("Select a type of member to alter");
		jlFour = new JLabel("");
		jlFive = new JLabel("");
		jTAtypeDisplay = new JTextArea(typeDisplay);
		jTAtypeDisplay.setLineWrap(true);
		jTAtypeDisplay.setWrapStyleWord(true);
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
		
		
		//jbAdd.addActionListener(this);
		//jbSub.addActionListener(this);
		//jbMult.addActionListener(this);
		//jbDiv.addActionListener(this);

		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//USE e.getSource(): // to decide... or
		//USE e.getActionCommand() // to decide
		
		//jlDisplay1.setText(e.getActionCommand() + "clicked");
		
		// if one button is clicked could use setText to change sign in middle of them
		
/*		if(cmd.equals(jbAdd))
		{
			result = num1 + num2;
			operator = " + ";
		}
		else if(cmd.equals(jbSub))
		{
			result = num1 - num2;
			operator = " - ";
		}
		else {
			result = Integer.MAX_VALUE;
			operator = " bicycles ";
		}
*/		
		
		
		
		//Math.addExact(num1, num2);
		//get the nums from jtf1 and jtf2
		//calculate using the nums from jtf1 and jtf2
		//display the result 
		//jlDisplayResult.setText("result is " + num1 + operator + num2 + " = " + result);
		
		
	}
	
	
	public int getIntFromTextField(JTextField jtf) {
		return Integer.parseInt(jtf.getText()); // assuming user always enters a number wrapper class!?
	}
	
	//inner class nested class for textfields
	
	//nested class for jbuttons

}