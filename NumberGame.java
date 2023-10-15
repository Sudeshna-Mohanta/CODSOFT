package TASK_1;

import java.util.Random;
import java.util.Scanner;

public class NumberGame {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		Random random = new Random();
		boolean flag=true;
		int round=1;
		
		
		while(flag) {
			
			System.out.println("Please enter your guessed no");
			
		int num;
		num=random.nextInt(100)+1;
		round++;
		System.out.println(num);
		int count=1;
		
		
			 
	    while(count<5) {
		
		int n =scn.nextInt();
		count++;
		if(n==num)
			{
			System.out.println("Congratulations! You have guessed the number correctly");
			System.out.println("You attempted "+round+"  round to guessed the correct no");

			break;
			}
			
		else if(n>num)
			{
			System.out.println("Please enter a smaller no");
			}
		
		else {
			
			System.out.println("Please enter a greater no");	
		}
	}
	
		System.out.println("Do you want to play again?");
		System.out.println("Yes/No");
		 String s=scn.next().toLowerCase();
		    if(!s.equals("yes")) {
		    break;
		    }
			

		    
		}
	
        System.out.println("Thanks for Playing!");
		System.out.println("Please Visit Again");
		}
		
	}



