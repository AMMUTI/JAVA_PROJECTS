package cust_project;

import java.util.Scanner;

public class First {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n;
		do
		{
			System.out.println("1.Admin login\n2.Agent Login \n3.Exit\n");
			 n=sc.nextInt();
			switch(n) 
			{
			 case 1: Admin1 obj=new Admin1();
				obj.admin();
				break;
			 case 2:
				 Agent obj1=new Agent();
				 obj1.agen();
				break;
			 case 3:
			      System.exit(0);
				break;
			}
		}while(n!=3);
	}
}
