package project;

public class SavingsAccount {
	public static double  AnnualInterestRate;
	private double SavingBalance;
public SavingsAccount(double SavingBalance) {
	this.SavingBalance=SavingBalance;
}
public static void ModifyInterestRate( double b) {
	AnnualInterestRate =b;
}
public void calculateMonthlyInterestRate() {
	double interest= (SavingBalance*(AnnualInterestRate/100))/12;
	SavingBalance=interest+SavingBalance;
}

public void showBal() {
	System.out.println("your balance is"+SavingBalance);
}
public static void main(String[] args) {
	SavingsAccount saver1=new SavingsAccount(2000);
	SavingsAccount saver2=new SavingsAccount(3000);
	SavingsAccount.ModifyInterestRate(4);
	saver1.calculateMonthlyInterestRate();
	saver1.showBal();
	saver2.calculateMonthlyInterestRate();
	saver2.showBal();
	SavingsAccount.ModifyInterestRate(5);
	saver1.calculateMonthlyInterestRate();
	saver1.showBal();
	saver2.calculateMonthlyInterestRate();
	saver2.showBal();
}
}

	

