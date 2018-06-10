package oop;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GuiJPanel extends JPanel implements ActionListener{
	public static final String ADD = "Add";
	public static final String SUB = "Sub";
	public static final String MULT = "Mult";
	public static final String DIV = "Div";
	private static final int NUM_COLUMNS = 10;
	private JLabel jlDisplay0;
	private JLabel jlDisplay1;
	private JLabel jlDisplayResult;
	private JPanel jpTF, jpBtn;
	private JTextField jtf1, jtf2;
	private JButton jbAdd, jbSub, jbMult, jbDiv;
	
	public GuiJPanel() {
		jlDisplay0 = new JLabel("Value one");
		jlDisplayResult = new JLabel("Result Display");
		
		
		jtf1 = new JTextField(null, NUM_COLUMNS);
		jtf2 = new JTextField(null, NUM_COLUMNS);
		
		jlDisplay1 = new JLabel("Value two");
		jbAdd = new JButton(ADD);
		jbSub = new JButton(SUB);
		jbMult = new JButton(MULT);
		jbDiv = new JButton(DIV);
		
		
		jbAdd.addActionListener(this);
		jbSub.addActionListener(this);
		jbMult.addActionListener(this);
		jbDiv.addActionListener(this);
		
		
		add(jlDisplay0);
		add(jtf1);
		add(jlDisplay1);
		add(jtf2);
		add(jbAdd);
		add(jbSub);
		add(jbMult);
		add(jbDiv);
		add(jlDisplayResult);
		
		
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