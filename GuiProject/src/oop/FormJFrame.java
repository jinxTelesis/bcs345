package oop;

import java.awt.GridLayout;
import javax.swing.JFrame;

public class FormJFrame extends JFrame {
	
	public FormJFrame() {
		FormJPanel jp = new FormJPanel();
		add(jp);
		GridLayout layout = new GridLayout(0,2);
        jp.setLayout(layout);
        setResizable(false);
	}

}
