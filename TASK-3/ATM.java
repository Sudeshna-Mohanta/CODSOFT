package TASK_3;

public class ATM{
	private Bank_Account usAccount;
	
	ATM(Bank_Account account){
		this.usAccount = account;
	}
	
	public void withdraw(double amount) {
		usAccount.withdraw(amount);
	}
	
	public void deposit(double amount) {
		usAccount.deposit(amount);
	}
	
	public double checkBalance() {
		return usAccount.checkBalance();
	}
}



































