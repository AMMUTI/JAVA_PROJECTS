package com.face.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.face.bo.RegisterBo;

public class RegisterDAO {

	public static void save(Connection connection, RegisterBo regbo) throws SQLException {
		// TODO Auto-generated method stub
		Statement s=connection.createStatement();
		try {
			
			String q= "insert into register values('"+regbo.getName()+"','"+regbo.getEmail()+"','"+regbo.getDob()+"','"+regbo.getAddress()+"','"+regbo.getPassword()+"')";
			
			
			s.executeUpdate(q);
			 //System.out.println(q);
			System.out.println("Data inserted Successfully");
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ResultSet rs = null;
		rs = s.executeQuery("select * from register ");
		while(rs.next())
		{
		String name=rs.getString("Name");
		System.out.print(name);
		}
	}

}
