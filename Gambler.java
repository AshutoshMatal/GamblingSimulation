
import java.util.Random;
import java.util.Scanner;

public class Gambler {
	int bets=1;
	int cash=100;  
	int result=0;
	int number=30;
	int totalamount=0;
	int counter=1;
	int win=0;
	int lost=0;
	int	perdaywin;
	int perdaylost;
	
		// BY USING FOR LOOP COUNT TILL THE NUMBER
	void month()
	{
		for (int day=1;day<=number; day++) 
		{	
			 win=0; lost=0;
			for(int game=1;game<=100;game++)
			{
				if (Math.random() < 0.5) 
				{ 
					result=cash+bets;
					win++;
					//System.out.println("win :"+win);
					if(win==50)	
					{
						break;						// IF IT WILL WON 50% THAN CASH THEN IT WILL RESIGN
					}	
				} 
				else 
				{
					result=cash-bets;
					lost++;
					//System.out.println("lost:"+lost);
					if(lost==50)
					{
						break;                           //IF IT WILL LOST 50% THAN CASH THEN IT WILL RESIGN		
					}
				}	
			}
			perdaywin=win;
			perdaylost=lost;
			
			//System.out.println( counter++ + ")"+"perdayamount:"+result); //PERDAY RESULT
			//System.out.println("win per day  :" + win);			// WIN COUNT
			//System.out.println("lost per day :" +lost);			//LOST COUNT
			totalamount=totalamount+result;
	}
	System.out.println("win per month :" + win);				// WIN COUNT PERMONTH
	System.out.println("lost per month :" +lost);				//LOST COUNT PERMONTH
	System.out.println( "Total-amount cash  won or lost PerMonth : "+totalamount);
	
}
public static void main(String[] args) {
	Gambler gm=new Gambler();
	System.out.println("Welcome to Gambler Simulation");
	for(int month=1;month<=12;month++)
	{
		gm.month();
	}
}
}
	
	
