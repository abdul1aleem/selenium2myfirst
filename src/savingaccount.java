
public class savingaccount {

	 String accountNumber;
	 double balance;
	 static double bonus=200;
	
	public savingaccount (String accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
		public void deposit(double amount){
			double sum =balance + amount+bonus;
			System.out.println(sum);

	}

		public static void main(String[] args){
			savingaccount deposit = new savingaccount("678909",100);
			deposit.deposit(2000);
			savingaccount deposit1 = new savingaccount("6789",200);
			deposit1.deposit(1000);
		}
}
