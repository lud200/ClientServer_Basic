package javaClientServer;

import java.lang.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.plaf.basic.BasicButtonListener;

public class GUI2 {
	private static JFrame j=null;
	private static JButton b=null;
	public static void main(String args[]){
		b=new JButton("ClickMe");
		b.setMnemonic(KeyEvent.VK_C);
		b.addActionListener(new ButtonListener());
		JPanel pane = new JPanel(new FlowLayout());
	    pane.add(b);
	    j = new JFrame();
	    j.setContentPane(pane);
	    j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	    j.setLocation(200, 200);
	    j.pack();
	    j.setVisible(true);
	}
	static class ButtonListener implements ActionListener {
	      public void actionPerformed(ActionEvent e) {
	         b.setEnabled(false); // Disable the button
	      }
	}
}
