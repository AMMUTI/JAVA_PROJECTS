package com.face.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.face.bo.ProductBo;

public class productdao {

	public static void save(Connection connection, ProductBo bo) throws SQLException {
		Statement s=connection.createStatement();
		String q= "insert into product (name,quantity,price) values('"+bo.getProduct()+"','"+bo.getQuantity()+"','"+bo.getPrice()+"')";
		s.executeUpdate(q);
		System.out.println("data added succesfully!!!!!");
	}

	public static void update(Connection connection, ProductBo bo) throws SQLException {
		Statement s=connection.createStatement();
		System.out.println("welcome to update dao");
		String id=bo.getId();
		String product=bo.getProduct();
		String quantity=bo.getQuantity();
		String price=bo.getPrice();
		if(product!=null&&price!=null&&quantity!=null) {
		String q="UPDATE product SET name='"+bo.getProduct()+"',quantity = '"+bo.getQuantity()+"',price='"+bo.getPrice()+"' WHERE  name = '"+bo.getProduct()+"'";
		s.executeUpdate(q);
		System.out.println("data updated succesfully!!!!");}
	}

}
