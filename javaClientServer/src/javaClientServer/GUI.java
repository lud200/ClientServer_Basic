package javaClientServer;
import java.lang.*;
import java.util.*;

import javax.swing.*;

import java.awt.*;
import java.awt.event.KeyEvent;

public class GUI {
	public static void main(String args[]){
		JButton b=new JButton("Click Me!");
		b.setMnemonic(KeyEvent.VK_C);
		JPanel j=new JPanel(new FlowLayout());
		j.add(b);
		
		JFrame f=new JFrame();
		f.setContentPane(j);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLocation(500, 500);
		f.pack();
		f.setVisible(true);
	}
}
