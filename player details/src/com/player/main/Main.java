package com.player.main;

import java.sql.SQLException;
import java.util.Scanner;

import com.player.Dao.playerdao;
import com.player.bo.Playerbo;

public class Main {
	
		public static void main(String args[]) throws  SQLException,Exception
		{
			String Playername;
			String country;
			String skill;
			String team;
			Scanner sc=new Scanner(System.in);
			int n;
			do
			{
				System.out.println("1.List All player\n2.Add new player \n3.Search player\n");
				 n=sc.nextInt();
				switch(n) 
				{
				 case 1: Display dis=new Display();
					break;
				 case 2: 
					 Player p=new Player();
						break;
				 case 3:
				      search s=new search();
					break;
				}
			}while(n!=3);
		}
	}

	

