package gameOn;
import java.util.Random;

public class CompRdm extends ItemsAndResults {
	private Random rdm;
	// object Random, variable rdm;
	
	public CompRdm(){
		//contstructor, initialize random, make object
		super();
		rdm = new Random();
	}
	public PICKS getPicks()
	{
		int pick = 1 + rdm.nextInt(3);
		switch (pick)
		{//make our pick into paper rock or scissors
		case 1: 
			return PICKS.ROCK;
		case 2:
			return PICKS.PAPER;
		case 3:
			return PICKS.SCISSORS;
		} 
		return getPicks();
	}	
}
