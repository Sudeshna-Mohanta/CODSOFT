package TASK_3;

import java.util.Scanner;

public class UserInterface {

	public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	Bank_Account usAccount = new Bank_Account(1000);
	ATM atm = new ATM(usAccount);
	
	boolean flag= true;
	
	while(true) {
		System.out.println("1. Withdraw");
		System.out.println("2. Deposit");
		System.out.println("3. Check Balance");
		System.out.println("4. Exit");
		System.out.println("Enter your choice: ");
		int choice = scn.nextInt();
		
		switch(choice) {
		case 1: 
			System.out.println("Enter withdrawal amount Rs: ");
			double withdrawal = scn.nextDouble();
			atm.withdraw(withdrawal);
			break;
			
		case 2:
			System.out.println("Enter the deposit amount Rs: ");
			double depositAmount = scn.nextDouble();
			atm.deposit(depositAmount);
			break;
			
		case 3:
			System.out.println("Current Balance: "+atm.checkBalance());
			break;
		case 4:
			flag = false;
			System.out.println("Thank You!");
			break;
		default:
			System.out.println("Invalid Choice...Pleasec try Again");
				
		}
		
		
			
	}
	

	}

}
