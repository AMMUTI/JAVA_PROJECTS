package cust_project;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Login {
	public static void main(String args[]) throws ClassNotFoundException, SQLException {
		
	/**JFrame f=new JFrame("MENU");
	JButton a=new JButton("Admin Login");
	a.setBounds(80,100,130,50);
	JButton l=new JButton("Agent Login");
	l.setBounds(220,100,130,50);
	JButton e=new JButton("EXIT");
	e.setBounds(360,100,130,50);
	
	f.add(a);
	f.add(l);
	f.add(e);
	f.setSize(600,300);
	f.setLayout(null);
	f.setVisible(true);
	
	
	
	//action listener of Admin login
	
	a.addActionListener(new ActionListener()
	{public void actionPerformed(ActionEvent e) {
		Admin obj=new Admin();
		obj.adm();
		
	}
	});**/
	Scanner sc=new Scanner(System.in);
	int n;
	do
	{
		System.out.println("1. Admin login\n 2.Agent Login \n 3.Exit\n");
		 n=sc.nextInt();
		switch(n) 
		{
		 case 1: System.out.println("admin");
			break;
		 case 2:
			System.out.println("display");
			break;
		 case 3:
		      
			break;
		}
	}while(n!=3);
}
	
	
	
	
	
	
	
}

