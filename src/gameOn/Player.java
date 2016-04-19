package gameOn;
import java.util.Scanner;

public class Player extends ItemsAndResults{
	
	Scanner sc;
	
	public Player()
	{
		super();
		sc = new Scanner(System.in);
	}
	
	public PICKS getPicks()
	{
		System.out.println("Choose your weapon:");
		System.out.println("R for Rock, P for Paper, S for Scissors");
		char playerChoice = sc.nextLine().toUpperCase().charAt(0);
		
		switch (playerChoice)
		{
		case 'R':
			return PICKS.ROCK;
		case 'P':
			return PICKS.PAPER;
		case 'S': 
			return PICKS.SCISSORS;
		}
		//if invalid pick, back to beginning of method (getPicks)
		System.out.println("Please try again (Bad input)");
		return getPicks();
	}
	
}
