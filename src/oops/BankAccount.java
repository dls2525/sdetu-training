package oops;

public class BankAccount implements IRate {

	
		// TODO Auto-generated method stub
		//BankAccount acc1 = New BankAccount();
	
		//Constructors  definitions
		//they are used to define/setup/initialize properties of an object
		// They are implicitly called upon Instantition 
		//The names as the class itself
		// Constructor has no return types 
		
		
		String accountNumber;
		  private String Name;
		private String ssn;
		public String getSsn() {
			return ssn;
		}
		public void setSsn(String ssn) {
			this.ssn = ssn;
		}
		String accountType;
		private final static String routingNumber = "013456";
		double balance = 0;
		BankAccount() {
			System.out.println("New Account Created");
		}
		 BankAccount(String accountType) {
			System.out.println("NEW ACCOUNT: " +accountType);
		}
		BankAccount(String accountType, double initDeposit) {
			System.out.println("New Account:" + accountType);
			System.out.println("Intial Deposit of " + initDeposit);
			String 	Msg = null;
			if (initDeposit < 1000 ) {
				Msg = "ERROR Mininum deposit must be at least $1000";
			} else  {
				
			 Msg =  "Thank for your initial deposit of: $" + initDeposit;
				
			}
			
			
				System.out.println(Msg);
				balance = balance +initDeposit;
		}
		//Getters// Setters
		// Allow the user to define the name
				
		public void setName(String name) {
			this.Name = "Mr." +  name;
		}
		public String getName() {
			return Name;
		}
		
		//Interfaces 
		public void setRate() {
			System.out.print("setting rates ");
		}
		
		public void IncreaseRate() {
			System.out.print("increasing  rates ");
		}
	public void deposit(double amount) {
	}
	
		
	
	public void withdraw( double amount) {
		
		balance = balance + amount;
		showActivity("Withdrawal");
	}
	private void showActivity(String activity) {
		System.out.println("Your recent transaction " + activity);
		System.out.print("Your new balance is " + balance);
	}
	void checkBalance() {
		
		System.out.println("balance " + balance);
	}
	
	void getStatus() {

}	
	@Override
	public String toString() {
		return "[Name:" + Name + ".Account#" + accountNumber + ".Routing #" + routingNumber +".BALANCE $" + balance ;			
	
	}
}

	
