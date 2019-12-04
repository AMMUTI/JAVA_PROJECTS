package com.player.main;
import java.sql.SQLException;
import java.util.Scanner;

import com.player.Dao.Skilldao;
import com.player.Dao.playerdao;
import com.player.bo.Playerbo;



public class Player {
	public String Playername;
	public String country;
	public String skill;
	public String team;
	
public Player() throws  SQLException,Exception {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the player name: ");
	Playername=sc.next();
	System.out.println("Enter the player country: ");
	country=sc.next();
	System.out.println("Enter the player skill: ");
	skill=sc.next();
	System.out.println("Enter the player team: ");
	team=sc.next();
	
	Playerbo bo=new Playerbo();
	bo.setCountry(country);
	bo.setPlayername(Playername);
	bo.setSkill(skill);
	bo.setTeam(team); 
	playerdao p=new playerdao();
	
	this.Playername=bo.getPlayername();
	this.country=bo.getCountry();
	this.skill=bo.getSkill();
	this.team=bo.getTeam();
	p.createPlayer(this);
	Skilldao skill=new Skilldao();
	String skillname= bo.getSkill();
	skill.skillFindBySkillname(skillname);
	
	
}
	
	public Player(String Playername,String country,String skill, String team) throws ClassNotFoundException, SQLException 
	{
		
		
		
		
		
	}


	

	
}
