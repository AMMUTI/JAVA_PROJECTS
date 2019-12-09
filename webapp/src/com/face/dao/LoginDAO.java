package com.face.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.face.bo.LoginBO;
import com.face.bo.RegisterBo;
import com.mysql.jdbc.PreparedStatement;

public class LoginDAO {
	public static boolean save(Connection connection, LoginBO b) throws SQLException {

		
	
	// TODO Auto-generated method stub
			Statement s=connection.createStatement();
			ResultSet rs = null;
			boolean status;
			
			String name;
			String email;
			String dob;
			String address;
			rs = s.executeQuery("select * from register where email='"+b.getEmail()+"'and Password='"+b.getPassword()+"'");
			if(rs.next()) {
				System.out.println("login success");
				// name=rs.getString("name");
				 b.setName(rs.getString("name"));
				 
				 
				// System.out.println("\n"+name);
				// email=rs.getString("email");
				 b.setEmail(rs.getString("email"));
				
				 
				// System.out.println("\n"+email);
				 //dob =rs.getString("dob");
				 b.setDob(rs.getString("dob"));
				 
				// System.out.println("\n"+dob);
				 
				 //address=rs.getString("address");
				 //System.out.println("\n"+address);
				 b.setAddress(rs.getString("address"));
				 
				 
				 status=true;
				 return status;
			}
			else
			{
				System.out.println("login fail");
				 status=false;
				 return status;
			}
//			while(rs.next())
//			{
//			String email=rs.getString("Email");
//			//System.out.print("\t"+email+"\t");
//			
//			String e=b.getEmail();
//			//System.out.print("\n your input  \t"+e+"\t");
//			if((b.getEmail().equals(rs.getString("email")))&&(b.getPassword().equals(rs.getString("Password")))) {
//				System.out.println("login success");
//				break;
//			}
//			else
//			System.out.println("login fail");
//		}
			}}
	
	
	
	
	
//second way to get value
//	public static Object get(String name) {
//		// TODO Auto-generated method stub
//		LoginBO reg= null;
//	//try
//		
//		try {
//		reg=new LoginBO();
//		String sql="select * from register where name=?";
//		PreparedStatement st=cm.getConnection().preparedStatement()
//				st.setString(1,name);
//		ResultSet resultset=st.executeQuery();
//		if(resultset.next()) {
//			reg.setName(resultset.getString("name"));
//			reg.setName(resultset.getString("email"));
//			reg.setName(resultset.getString("dob"));
//			reg.setName(resultset.getString("address"));
//		}
//		return null;
//	}
//	catch(SQLException e) {
//		e.printStackTrace();
//	}
//		return reg;
//}}
//end of the second way