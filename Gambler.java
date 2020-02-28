
import java.util.Random;
import java.util.Scanner;

public class Gambler {
	public static void main(String[] args) {
		int bets=1;
		int cash=100;  
		
		int result=0;
		int number=20;
		int totalamount=0;
		int counter=1;
		System.out.println("Welcome to Gambler Simulation");
	    // BY USING FOR LOOP COUNT TILL THE NUMBER
		for (int day=1;day<=number; day++) 
		{	
		int win=0;
		int lost=0;
			for(int game=1;game<=100;game++)
			{
				if (Math.random() < 0.5) 
				{ 
					result=cash+bets;
					win++;
					System.out.println("win :"+win);
					if(win==50)	
					{
						break;						// IF IT WILL WON 50% THAN CASH THEN IT WILL RESIGN
					}
					
				} else 
				{
					result=cash-bets;
					lost++;
					System.out.println("lost:"+lost);
					if(lost==50)
					{
						break;                           //IF IT WILL LOST 50% THAN CASH THEN IT WILL RESIGN		
					}
				}	
			}
			System.out.println( counter++ + ")"  + "perdayamount:"+result); //PERDAY RESULT
			System.out.println("win per day  :" + win);						// WIN COUNT
			System.out.println("lost per day :" +lost);						//LOST COUNT
			
			totalamount=totalamount+result;
		}
		System.out.println( "Total-amount cash  won or lost : "+totalamount);
		
	}
}