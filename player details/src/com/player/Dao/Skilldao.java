package com.player.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.player.bo.SkillBo;
import com.player.util.ConnectionMnager;

public class Skilldao {
 public void skillFindBySkillname(String Skillname) throws SQLException, Exception {
	 
	 ConnectionMnager con=new ConnectionMnager();
		Statement s=con.getConnection().createStatement();
		ResultSet rs = null;
		rs = s.executeQuery("select * from skill where name='"+Skillname+"' ");
		while(rs.next())
		{
		String name=rs.getString("name");
		int id=Integer.parseInt(rs.getString("id"));
		
		SkillBo sbo=new SkillBo();
		int skillid= (int) sbo.getSkilld();
		System.out.println("skill bo id : "+skillid);
		}
 }
 
 
 
public void skillFindBySkillid(long skilld) {
	 
 }
}
