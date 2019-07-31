package BankAccount;

public class BankAccountClass {
	
	private long accountNumber=123456789;
	private double accountBalance= 100;
	private String phoneNumber = "9999999999";
	private String customerName = "Sajida";
	private String email = "sajimemon81@gmail.com";
	
	
	
	public double depositFunds(float DepAmount){
				
		this.accountBalance=this.accountBalance+DepAmount;
		return this.accountBalance;
		
		}
	public double withdrawFunds(double withdrawAmount)
	{
		if (withdrawAmount>500)
		{
			System.out.println("you cannot withdraw more than 500");
			return this.accountBalance;
		}
		else {
		if(withdrawAmount<=this.accountBalance) 
		{
			this.accountBalance= this.accountBalance-withdrawAmount;
			return this.accountBalance;
			
		} else
		if(withdrawAmount>this.accountBalance) 
		{
			System.out.println("OPERATION NOT POSSIBLE BECAUSE THE withdraw amount SPECIFIED IS MORE THan the balance");
			return this.accountBalance;
		}
		else {
			return this.accountBalance;
		}}
	}
	public void printCustomerDetails()
	{
		System.out.println("accountNumber is"+ this.accountNumber);
		System.out.println("accountBalance is"+ this.accountBalance);
		System.out.println("phoneNumber is"+ this.phoneNumber);
		System.out.println("Name "+this.customerName);
		System.out.println("email "+this.email);
	}
}

	
	


