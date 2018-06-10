package oop;
import java.awt.FlowLayout;

import javax.swing.JFrame;

public class GuiJFrame extends JFrame{
	
	public GuiJFrame() {
		GuiJPanel jp = new GuiJPanel();
		add(jp);
		FlowLayout layout = new FlowLayout();
        jp.setLayout(layout);
	}

}