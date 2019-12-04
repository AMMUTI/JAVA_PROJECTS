package com.player.main;

import java.sql.SQLException;

import com.player.Dao.playerdao;
import com.player.bo.Displaybo;
import com.player.bo.Playerbo;
import com.player.doa.Displaydao;

public class Display {
	public Display() throws SQLException, Exception {
		System.out.println("Player Details");
		Displaybo bo=new Displaybo();
		
		String country = null;
		String Playername = null;
		String skill = null;
		String team = null;
		bo.setCountry(country);
		bo.setPlayername(Playername);
		bo.setSkill(skill);
		bo.setTeam(team); 
		playerdao p=new playerdao();
		p.dispaly();
		
	}
}
