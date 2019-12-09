package com.face.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.face.bo.ProductBo;

public class Displaydao {

	public static List<String> List(Connection connection) throws SQLException  {
		System.out.println("welcome to dispaly dao");
		Statement s=connection.createStatement();
		ResultSet rs = null;
		//String product;
		//String quantity;
		//String price;
		rs = s.executeQuery("select * from product ");
		List<String> dataList =new ArrayList<String>();
		while(rs.next()) {
			//System.out.println("login success");
			dataList.add(rs.getString("name"));
			dataList.add(rs.getString("quantity"));
			dataList.add(rs.getString("price"));
			
			
		}
		return dataList;
	

	}

	public static void delete(Connection connection, ProductBo bo) throws SQLException {
		System.out.println("welcome to  delete doa");
		Statement s=connection.createStatement();
		ResultSet rs = null;
		String product;
		System.out.println(bo.getProduct());
		s.executeUpdate("delete from product where name='"+bo.getProduct()+"'");
		
		
	}

	 
}