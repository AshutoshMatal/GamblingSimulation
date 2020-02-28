
import java.util.Random;
import java.util.Scanner;

public class Gambler {
	public static void main(String[] args) {
		int bets=1;
		int cash=100;  
		int win=0;
		int lost=0;
		int result=0;
		int number=1000;
		System.out.println("Welcome to Gambler Simulation");
	    // BY USING FOR LOOP COUNT TILL THE NUMBER
		for (int count=1;count<number; count++) 
		{	
				if (Math.random() < 0.5) 
				{
					result=cash+bets;
					win++;
					win=cash+50;				// IF IT WILL WON 50% THAN CASH THEN IT WILL RESIGN
					break;
					
				} else 
				{
					result=cash-bets;
					lost++;
					lost=cash-50;				//IF IT WILL LOST 50% THAN CASH THEN IT WILL RESIGN
					break;
				}
			}
		System.out.println("win :" + win);		// WIN COUNT
		System.out.println("lost :" +lost);		//LOST COUNT
	}
}