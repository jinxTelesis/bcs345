

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyJPanel extends JPanel implements ActionListener{
	public static final String JB_NO_ME = "no me";
	public static final String JB_CLICK_ME = "click me";
	private int clickCounterJB1;
	private int clickCounterJB2;
	private JLabel jlDisplay;
	private JTextField jtf1, jtf2;
	private JButton jb1, jb2;
	
	public MyJPanel(){
		clickCounterJB1 = 0;
		clickCounterJB2 = 0;
		setLayout(new GridLayout(5, 1));
		jlDisplay = new JLabel("Hi Superman!");
		//jlDisplay.setText("HI ALL");
		/*
		 * Create the textfields and the button...
		 * add them to the jpanel
		 */
		jtf1 = new JTextField("i am 1 jtf");
		jtf2= new JTextField("i am 1 jtf");
		
		jb1 = new JButton(JB_CLICK_ME);
		jb1.addActionListener(this);//make jb1 listen for events and trigger actionPerformed
		
		jb2 = new JButton(JB_NO_ME);
		jb2.addActionListener(this);//make jb2 listen for events and trigger actionPerformed
		
		add(jlDisplay);
		add(jtf1);
		add(jtf2);
		add(jb1);
		add(jb2);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	//	String clicked = e.getActionCommand();
		JButton btnClicked = (JButton) e.getSource();
		if(btnClicked.equals(jb1)){
			clickCounterJB1++;
			jlDisplay.setText("jb1 clicked "+clickCounterJB1);
			if(clickCounterJB1 % 2 ==1){
				jb1.setText("hey");
			}
			else{
				jb1.setText(JB_CLICK_ME);
			}
		}
		else if(btnClicked.equals(jb2)){
			clickCounterJB2++;
			jlDisplay.setText("jb2 clicked "+clickCounterJB2);
			if(clickCounterJB2 % 2 ==1){
				jb2.setText("Yay");
			}
			else{
				jb2.setText(JB_NO_ME);
			}
		}
		
		
		//System.out.println("clicked something... ... "+ clicked);
		//jlDisplay.setText(clicked);
//		jtf1.setText(clicked);
//		jtf2.setText(clicked);
	}
	
}
