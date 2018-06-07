

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class MyJFrame extends JFrame{

	public MyJFrame(){
		//in here I will...
		JPanel allContent = new JPanel();//A- create a JPanel that will hold multiple components
		//allContent.setLayout(new GridLayout(1,2));
		//allContent.setLayout(new BorderLayout());//N,S,E,W,C
		MyJPanel myJP = new MyJPanel();//1 create an instance of MyJPanel
		myJP.setBackground(Color.YELLOW);
		
//		MyJPanel myJP2 = new MyJPanel();//1 create an instance of MyJPanel
//		myJP2.setBackground(Color.MAGENTA);		
		allContent.add(myJP);//2 add the MyJPanel object to the allContent JPanel
//		allContent.add(myJP2);//2 add the MyJPanel object to the allContent JPanel
//		allContent.add(myJP, BorderLayout.NORTH);
//		allContent.add(myJP2, BorderLayout.SOUTH);
		
		add(allContent);//B- add the allContent object to this current JFrame
		
		
		setVisible(true);
		setSize(300,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
