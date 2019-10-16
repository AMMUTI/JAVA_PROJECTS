package cust_project;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.jdbc.Statement;

public class Agent {
public static void agen()
{
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
		rs = statement.executeQuery("select name,PASSWORD from agent where name='"+user+"' AND PASSWORD='"+pass+"'");
	
	} 
	
	catch (SQLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
    try {
		if(rs.next()){
			System.out.println("Success !!!");
			agent();
		}
		else
		{System.out.println("invalid user name or password");
			
		}
}
    catch (SQLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
}

// next fuction for inside agent


public static void agent() throws SQLException
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
			System.out.println("__MENU__\n1.Sell/Buy\n2.Show History\n3.Logout\n");
			n=sc.nextInt();
			switch(n) 
			{
			case 1:
			
				
				//print the id and name
				System.out.printf("Id\tProduct Name\t\t\n\n");
				ResultSet r = null;
			    r = statement.executeQuery("select * from admin ");
				int qs=0;
			    while(r.next())
				{
					int k=r.getInt("Product_id");
					System.out.printf("%d\t",+k);
					
					String name=r.getString("product_name");
					System.out.print(name+"\t\t");
					System.out.println("\n");
					 qs=r.getInt("Quantity");
					
				}
				int pri=0,q=0;
				int pro_id=0;
			System.out.println("Enter the Product Id :");
			int id=sc.nextInt();
			System.out.println("Do you want to Buy Or Sell ?:");
			String ans=sc.next();
			if(ans.equalsIgnoreCase("buy")) 
			
			{
			System.out.println("Product Name\t Product Price \n");
			
			//code for print the name and price of product
			String name = null;
			
			ResultSet np = null;
		    np = statement.executeQuery("select  Product_name,price,Quantity from admin where Product_id='"+id+"' ");
			while(np.next())
			{
				name=np.getString("Product_name");
				System.out.print(name+"\t");
			
				 pri=np.getInt("Price");
				
				System.out.print("\t"+pri+"\t");
				System.out.println("\n");
				q=np.getInt("Quantity");
				pro_id=id;
				
			}
		    //calculating the product availability for buy
			System.out.println("Enter the Quantity of the product : \n");
			int quntity=sc.nextInt();

		if(quntity>q)
				{System.out.println("Product not available!!");
			
			      break;
				}
			else
			{int lessq=q-quntity;
				int total=quntity*pri;
				System.out.println("Total price : "+total);
				System.out.println("Do you want to confirm Booking ?");
				String book=sc.next();
				  if(book.equalsIgnoreCase("yes"))
				  
					  {statement.executeUpdate("INSERT INTO agent(`transaction`,`product_id`,`Product_name`, `price`,`total_price`) VALUES('"+ans+"','"+pro_id+"','"+name+"','"+pri+"','"+total+"')");
					  statement.executeUpdate("UPDATE `admin` SET `Quantity`='"+lessq+"' where Product_id='"+pro_id+"' ");
					  System.out.println("Thank youfor shoping...");
					  }
			}//statement.executeUpdate("UPDATE `agent` SET `total_price`='"+total+"' where Product_id='"+id+"' ");
			}
			else
			{
				System.out.println("Enter the Quantity of the product : \n");
				int quntity=sc.nextInt();
				int diffq=qs+quntity;
				statement.executeUpdate("UPDATE `admin` SET `Quantity`='"+diffq+"' where Product_id='"+id+"' ");
				System.out.println("prodect added success fully");
			}
			break;
			case 2:
				System.out.println("display");
				
				System.out.printf("Id\tProduct Name\tTotal Price\n\n");
				ResultSet rs = null;
			    rs = statement.executeQuery("select * from agent ");
				while(rs.next())
				{
					int k=rs.getInt("Product_id");
					System.out.printf("%d\t",+k);
					
					String names=rs.getString("product_name");
					System.out.print(names+"\t\t");
					
					
					 pri=rs.getInt("total_price");
					
					System.out.print("\t"+pri+"\t");
					System.out.println("\n");
					
					
				}					
				break;
			case 3:First l=new First();
			       System.out.println("Thank you!! ");
			       l.main(null);
			      
				break;
			}
		}while(n!=3);
}
}
