package gameOn;

import java.util.Scanner;



public class GamePlay extends ItemsAndResults {
	private Player player;
	private TheDumbRock easyMode = new TheDumbRock();
	private CompRdm tryHard = new CompRdm();
	private PICKS playerPick;
	private PICKS compPick;
	private RESULT gameOver;
	Scanner sc = new Scanner(System.in);
	
	
	
	
	public GamePlay()
	{
		super();
		player = new Player();
		
	}
	
	public void play()
	{	
		
		
	
			
			char choice;
			System.out.println("Pick an opponent: 'R' for The Rock, 'T' for TryHard: ");
			choice = sc.nextLine().toUpperCase().charAt(0);
			
			switch(choice)
			{
			case 'R':
			compPick = easyMode.getPicks();
			break;
			case 'T':
			compPick = tryHard.getPicks();
			break;
			}

		playerPick = player.getPicks();
		//compPick = easyMode.getPicks();
		gameOver = getGameOver();
		displayGameOver();

        
	}
	
		
	private void displayGameOver()
	{
		switch (gameOver)
		{
		case WIN:
			System.out.println(playerPick + " beats " + compPick + ". Player wins!");
			break;
		case LOSE:
			System.out.println(playerPick + " lost to " + compPick + ". You Lose");
			break;
		case TIE:
			System.out.println(playerPick + " is the same as " + compPick + ". It's a tie!");
			break;
		}
	}
	private RESULT getGameOver()
	{
		if (playerPick == compPick)
			return RESULT.TIE;
		
		switch (playerPick)
		{
		case ROCK:
			return (compPick == PICKS.SCISSORS ? RESULT.WIN : RESULT.LOSE);
			//shorthand saying if comp pick scissors player wins; otherwise its a loss..
		case PAPER:
			return (compPick == PICKS.ROCK ? RESULT.WIN : RESULT.LOSE);
		case SCISSORS:
			return (compPick == PICKS.PAPER ? RESULT.WIN : RESULT.LOSE);
		}
		//wont make it here.
		return RESULT.LOSE;
	}
}
