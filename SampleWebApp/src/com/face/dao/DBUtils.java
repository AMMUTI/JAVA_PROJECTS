package com.face.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.face.bo.UserAccount;


public class DBUtils {
	public static UserAccount findUser(Connection conn, //
	           String userName, String password) throws SQLException {
	       String sql = "Select a.User_Name, a.Password, a.Gender from User_Account a " //
	               + " where a.User_Name = ? and a.password= ?";
	       
	       PreparedStatement pstm = conn.prepareStatement(sql);
	      
	       pstm.setString(1, userName);
	       pstm.setString(2, password);
	       ResultSet rs = pstm.executeQuery();
	       if (rs.next()) {
	           String gender = rs.getString("Gender");
	           UserAccount user = new UserAccount();
	           user.setuserName(userName);
	           user.setPassword(password);
	           user.setGender(gender);
	           System.out.println("VALUE FROM DB");
	           System.out.println(userName+" "+password);
	           return user;
	       }
	       return null;
	   }
}
