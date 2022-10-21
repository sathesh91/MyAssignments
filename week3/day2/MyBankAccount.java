package week3.day2;

public class MyBankAccount {

	public static void main(String[] args) {
		
		HdfcBank hdfc = new HdfcBank();
		hdfc.minimumBalance();
		hdfc.provideDebitCard();
		hdfc.provideCreditCard();
		
		RBI rbi = new HdfcBank();
		rbi.minimumBalance();
		rbi.provideDebitCard();
	}
}
