package com.player.main;

import java.sql.SQLException;
import java.util.Scanner;

import com.player.Dao.playerdao;
import com.player.bo.Playerbo;

public class search {
	
	public String Playername;
	public search() throws SQLException, Exception {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the player name: ");
	Playername=sc.next();
	Playerbo bo=new Playerbo();
	bo.setPlayername(Playername);
	this.Playername=bo.getPlayername();
	playerdao p=new playerdao();
	p.search(this);
	}
}
