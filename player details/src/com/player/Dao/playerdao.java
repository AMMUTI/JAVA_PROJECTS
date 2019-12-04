package com.player.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;


import com.player.main.Player;
import com.player.main.search;
import com.player.util.ConnectionMnager;

public class playerdao {
	

	public void createPlayer(Player player) throws  SQLException,Exception {
		String Playername=player.Playername;
		System.out.println(Playername);
		String country=player.country;
		String team=player.team;
		String skill=player.skill;
		int skillid=0,teamid=0;
		ConnectionMnager con=new ConnectionMnager();
		Statement s=con.getConnection().createStatement();
	
		
		ResultSet rs = null;
		rs = s.executeQuery("select * from skill where name='"+skill+"' ");
		while(rs.next())
		{
	//	String name=rs.getString("name");
		int id=Integer.parseInt(rs.getString("id"));
		skillid=id;
		}
		ResultSet rt = null;
		rt = s.executeQuery("select * from team where name='"+team+"' ");
		while(rt.next())
		{
		
		int id=Integer.parseInt(rt.getString("id"));
		teamid=id;
		System.out.println(id);
		}
		
		
String q= "insert into player(name,country,skill_id,team_id) values('"+Playername+"','"+country+"','"+skillid+"','"+teamid+"')";
		
		s.executeUpdate(q);
	}

	public void dispaly() throws SQLException, Exception {
		ConnectionMnager con=new ConnectionMnager();
		Statement s=con.getConnection().createStatement();
	
		ResultSet rt = null;
		System.out.println("name\t country\t TeamId");
		rt = s.executeQuery("select * from player ");
		while(rt.next())
		{
		
		int id=Integer.parseInt(rt.getString("team_id"));
		String name=rt.getString("name");
		
		String country=rt.getString("country");
		
		System.out.println(name+" \t "+country+"\t \t  "+id);
		}
	}

	public void search(search search) throws SQLException, Exception {
		// TODO Auto-generated method stub
		String Playername=search.Playername;
		ConnectionMnager con=new ConnectionMnager();
		Statement s=con.getConnection().createStatement();
		ResultSet rt = null;
		System.out.println("player name: "+Playername);
		rt = s.executeQuery("select * from player where name='"+Playername+"' ");
		if(rt.next())
		{
		
		int id=Integer.parseInt(rt.getString("id"));
		String name=rt.getString("name");
		
		String country=rt.getString("country");
		
		System.out.println(name+" \t "+country+"\t \t  "+id);
		}
		else {
			System.out.println("No data found");
		}
	}

	
	

	

	
}
