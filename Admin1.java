package cust_project;

import java.awt.HeadlessException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import javax.swing.JOptionPane;

import com.mysql.jdbc.Statement;

public class Admin1 {
	public static void admin() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Username: ");
		String user=sc.next();
		System.out.println("Enter the Password: ");
		String pass=sc.next();
		Cust_project obj1=new Cust_project();
		
		
		
		
		Statement statement = null;
		try {
			statement = (Statement) obj1.connect().createStatement();
		} catch (ClassNotFoundException | SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	   
        ResultSet rs = null;
		try {
			rs = statement.executeQuery("select name,PASSWORD from admin where name='"+user+"' AND PASSWORD='"+pass+"'");
		/*while(rs.next())
		{
			int k=rs.getInt("id");
		}*/
		} 
		
		catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        try {
			if(rs.next()){
				System.out.println("Success !!!");
            
				
				adm();
			}
			else
			{System.out.println("invalid ");
				
			}
		} catch (HeadlessException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	
        
		
	}


	public static void adm() throws SQLException
	{
		// calling connection
		Cust_project obj1=new Cust_project();
		Statement statement = null;
		try {
			statement = (Statement) obj1.connect().createStatement();
		} catch (ClassNotFoundException | SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	   //ending the call
		int n;
		 Scanner sc=new Scanner(System.in);
			do
			{
				System.out.println("__MENU__\n1.Add product\n2.Display \n3.Logout\n");
				n=sc.nextInt();
				switch(n) 
				{
				case 1:System.out.println("add");
				//System.out.println("Enter the Product id :");
				//int productid=sc.nextInt();
				//sc.next();
				System.out.println("Enter the Product name :");
				String productname=sc.next();
				System.out.println("Enter the Product Quantity :");
				String quantity=sc.next();
				System.out.println("Enter the Product price :");
				String price=sc.next();
				//System.out.println("Enter the Product id :");
				//int productid=sc.nextInt();
			
				
			statement.executeUpdate("INSERT INTO admin(`Product_name`, `Quantity`, `price`) VALUES('"+productname+"','"+quantity+"','"+price+"')");
			//statement.executeUpdate("INSERT INTO agent(`Product_name`, `price`) VALUES('"+productname+"','"+price+"')");
			
			//	statement.executeUpdate("INSERT INTO log VALUES('"+  +"','"+ pas +"')");
					break;
				case 2:
					System.out.println("display");
					
					System.out.printf("Id\tProduct Name\t Quantity\tPrice\n\n");
					ResultSet rs = null;
				    rs = statement.executeQuery("select * from admin ");
					while(rs.next())
					{
						int k=rs.getInt("Product_id");
						System.out.printf("%d\t",+k);
						
						String name=rs.getString("product_name");
						System.out.print(name+"\t\t");
						
						int q=rs.getInt("Quantity");
						System.out.print("  "+q+"\t");
						int pri=rs.getInt("Price");
						
						System.out.print("\t"+pri+"\t");
						System.out.println("\n");
						
						
					}					
					break;
				case 3:First l=new First();
				       System.out.println("Thank you!!");
				       l.main(null);
				      
					break;
				}
			}while(n!=3);
	}
}