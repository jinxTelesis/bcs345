package oop;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;

public class GuiJFrame extends JFrame{
	
	public GuiJFrame() {
		GuiJPanel jp = new GuiJPanel(); // the panel in the other file
		add(jp); // adds the planel
		//FlowLayout layout = new FlowLayout();
		GridLayout layout = new GridLayout(0,5);
        jp.setLayout(layout);
        setResizable(false);
       
	}

}