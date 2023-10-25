package TASK_3;

public class Bank_Account {
	 private double balance;
	 
	 Bank_Account(double balance){
		 this.balance=balance;
	 }
	 
	 public void withdraw(double amount) {
		   if(amount>0) {
			   if(amount<=balance) {
			   balance-=amount;
			   System.out.println(" You successfully Withdrew Rs "+amount+" from your respected bank account.");
		       }else {
		       System.out.println("Deficit amount...Please enter a lower amount."); 
		       }
	       }
		   else {
			 System.out.println("Please enter a non-negative withdrawal amount.");  
	            }
	  }
	   
	   public void deposit(double amount) {
		   if(amount>0) {
			   balance+=amount;
			   System.out.println("You have successfully deposited Rs "+amount+" Your updated balance is Rs "+balance);
		   }
		   
	   }
	   
	   public double checkBalance() {
		   return balance;
	   }
	 
}
