package week3.day1.banking;

public class AxisBank extends BankingInfo {

	public static void main(String[] args) {
		
		AxisBank axisbank = new AxisBank();
		
		System.out.println("************* Welcome to AXIS Bank *************");
		axisbank.accountName();
		axisbank.accountNumber();
		axisbank.accountBranch();
		axisbank.saving();
		axisbank.accountBalance();
	}
	
	public void accountName()
	{
		System.out.println("Account Name : Satheshkumar M");
	}
	
	public void accountNumber()
	{
		System.out.println("Account Number : ******************1234");
	}
	
	public void accountBranch()
	{
		System.out.println("Account Branch : Anna Nagar Madurai");
	}
	
	public void saving()
	{
		System.out.println("Saving Accout Type");
		
		System.out.println("*********************");
		//Using super keyword, invoking parent class for Overriding.
		super.saving();
	}
	
	public void accountBalance()
	{
		System.out.println("Account Name : 50,00.00 INR");
	}

}
