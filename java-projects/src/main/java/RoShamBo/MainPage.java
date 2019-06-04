package RoShamBo;

import java.util.Random;
import java.util.Scanner;

public class MainPage 
{
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		//Get user name and choice
		String userName = getUsername();
		Player p1 = new Player(userName, null);
		p1.setChoice(getUserChoice());
		
		//Get CPU choice
		int cpuNumber = new Random().nextInt(4)+1;
		Choice cpuNum = getChoice(cpuNumber);
		Player cpu = new Player("CPU", cpuNum);
		System.out.println("Your challenger, CPU, has selected " + cpu.getChoice().getDisplayName());
		
		//Result
		int result = 0;
		Choice choice = p1.getChoice();
		result = choice.didWin(cpu.getChoice());
		
		switch (result)
		{
			case -1:
				System.out.print("Sorry " + p1.getName() + ", you have been decimated.");
				break;
			case 0:
				System.out.print("Shucks " + p1.getName() + ", you tied with the evil cpu.");
				break;
			case 1:
				System.out.print("Congratulations " + p1.getName() + "! You are the champion!.");
				break;
		}
	}
	
	//Get User Name
	public static String getUsername()
	{
		System.out.print("What is your name challenger?");
		String userName = sc.next();
		
		return userName;
	}
	
	public static Choice getUserChoice()
	{
		Choice c = null;
		do 
		{
			System.out.println("Choose your fate");
			System.out.println("1. Rock");
			System.out.println("2. Paper");
			System.out.println("3. Scissors");
			System.out.println("4. Lizard");
			System.out.println("5. Spock");
		
			int optionNumber = 0;
		
			try
			{
				optionNumber = Integer.parseInt(sc.next());
			}
		
			catch (NumberFormatException e)
			{
				System.out.println("That is not a number!!!");
				continue;
			}
			
			c = getChoice(optionNumber);
		}
		while (c == null);
		
		return c;
		
	}
	
	public static Choice getChoice(int optionNumber)
	{
		Choice c = null;
		
		switch(optionNumber)
		{
			case 1:
				c = new Paper();
				break;
			case 2:
				c = new Rock();
				break;
			case 3:
				c = new Scissors();
				break;
			case 4:
				c = new Lizard();
				break;
			case 5:
				c = new Spock();
				break;
			default:
			
				break;
		}
		return c;
	}

}
