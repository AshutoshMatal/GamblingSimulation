
import java.util.Random;
import java.util.Scanner;

public class Gambler {
	public static void main(String[] args) {
		int bets=1;
		int cash=100;  
		int win=0;
		int lost=0;
		int result=0;
		System.out.println("Welcome to Gambler Simulation");
	    Scanner sc=new Scanner (System.in);
		System.out.println("Enter a trials ");
		int trials = sc.nextInt();
		for (int day= 1; day<trials; day++) 
		{	
				if (Math.random() < 0.5) 
				{
					result=cash+bets;
					win++;
					
				} else 
				{
					result=cash-bets;
					lost++;
				}
				System.out.println(result);
			}
		System.out.println("win :" + win);
		System.out.println("lost :" +lost);
	}
}