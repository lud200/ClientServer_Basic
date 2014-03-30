package javaClientServer;

import java.lang.*;
import java.io.*;
import java.net.*;
import java.util.*;
import javax.swing.*;

public class Client {
	public static void main(String args[]) throws IOException{
		/*String serverAddress=JOptionPane.showInputDialog("Enter IP Address of machine that is \n"+
	"Running the date service at port 9090");
		Socket s=new Socket(serverAddress, 6789);
		BufferedReader input=new BufferedReader(new InputStreamReader(s.getInputStream()));
		String answer=input.readLine();
		JOptionPane.showMessageDialog(null, answer);
		System.exit(0);
		*/try{
			Socket s=new Socket("localhost", 1234);
			BufferedReader b=new BufferedReader(new InputStreamReader(s.getInputStream()));
			System.out.println("Receiving String...");
			while(!b.ready()){
				
			}
			System.out.println(b.readLine());
			b.close();
		}catch(Exception e){
			System.out.println("Failed");
		}
	}
}
