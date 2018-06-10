package oop;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GuiJPanel extends JPanel implements ActionListener{
	public static final String Person = "Person";
	public static final String Employee = "Employee";
	public static final String Faculty = "Faculty";
	public static final String Undergraduate = "UnderGraduate";
	public static final String Graduate = "Graduate";
	private static final int NUM_COLUMNS = 10;
	
	public GuiJPanel() {
		JLabel jlone = new JLabel("");
		JLabel jltwo = new JLabel("");
		JLabel jlthree = new JLabel("Select a type of member to alter");
		JLabel jlfour = new JLabel("");
		JLabel jlfive = new JLabel("");
		add(jlone);
		add(jltwo);
		add(jlthree);
		add(jlfour);
		add(jlfive);
		JButton jbPer = new JButton(Person);
		JButton jbEmp = new JButton(Employee);
		JButton jbFac = new JButton(Faculty);
		JButton jbUnd = new JButton(Undergraduate);
		JButton jbGra = new JButton(Graduate);
		add(jbPer);
		add(jbEmp);
		add(jbFac);
		add(jbUnd);
		add(jbGra);
		
		
		
		
		
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