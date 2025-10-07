/*
4. Player High Score
Task:
 Create a Player class with fields: name and score.
 In the main method:
Create two individual Player objects.
Compare their scores and print the name of the player with the higher score.
Explanation:
 This helps to understand comparing fields between objects.
*/

import java.util.Scanner;
class Player
{
	private String name;
	private int score;
	
	public void setName(String n)
	{
		name = n;
	}
	public String getName()
	{
		return name;
	}
	public void setScore(int s)
	{
		score = s;
	}
	public int getScore()
	{
		return score;
	}
}


public class PlayerScoreApp
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		Player p[] = new Player[3];
		
		String name="";
		int score=0;
		for(int i=0;i<p.length;i++)
		{
			p[i]=new Player();
			System.out.println("Enter Name of player");
			name=sc.next();
			p[i].setName(name);
			System.out.println("Enter Score of player");
			score = sc.nextInt();
			p[i].setScore(score);
		}			
		int maxScore = p[0].getScore();
		boolean flag=false;
		for(int i=0;i<p.length;i++)
		{
			if(p[i].getScore()>maxScore)
			{
				maxScore=p[i].getScore();
			}
		}
		for(int i=0;i<p.length;i++)
		{
			if(p[i].getScore()==maxScore)
			{
				System.out.println("The higher score player is "+p[i].getName()+" and Score is "+p[i].getScore());
			}
			
		}
	}
}