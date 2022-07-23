package basics;

public class BankAccountApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    BankAccount acc1 = new BankAccount("458267854", 1000);
	    BankAccount acc2 = new BankAccount("659237845", 1500);
	    BankAccount acc3 = new BankAccount("475862544", 2000);
	    
	    acc1.setName("Jim");
	    System.out.print(acc1.getName());

	    acc1.makeDeposit(500);
	    acc1.makeDeposit(5000);
	    acc1.payBill(1500);
	    acc1.accure();
	    acc1.toString();
	    System.out.println(acc1.toString());
	}

}
  class BankAccount implements  iInterest{
	 // Properties
	 private static  int iD = 1000;
	 private String accountNumber;
	 private static final String routingNumber ="0054616";
	 private String name;
	 private String SSN;
	 private double balance;
	 
	 // constructor
	 public BankAccount(String SSN, double initDeposit) {
		 balance = initDeposit;		
		 this.SSN = SSN;
		 iD++;
		 setAccountNumber();

	 }
	 private void setAccountNumber() {
		 int random =  (int)(Math.random() * 100);
		 //System.out.println(random);
		 accountNumber = iD + "" + random +SSN.substring(0,2); 
		System.out.println("Your account Number " +accountNumber);
	 }
	 public void setName(String name) {
		 this.name = name;
		 
	 }
	 public String getName() {
		 return name;
			 
	 }
	public void payBill(double amount) {
		balance = balance - amount;
		System.out.println("Paybill " + amount);
		showBalance();
	}
	
	public void makeDeposit(double amount){
		System.out.println("Making a deposit" + amount);
		balance = balance + amount;
		showBalance();
	}
	
	public void showBalance() {
		System.out.println( "Your balance is " + balance);
	}

	
	@Override
	public void accure() {
		balance = balance * (1 + rate/100);
		
	}
	@Override
	public String toString() {
		return "[Name" + name + "]\n[Account Number:" + accountNumber + "]\n" +" [Routing Nmber:" +routingNumber+  "]\n"  + "[Balance" + 
		balance + "]";
				
		 
	}
	public void accureInterest() {
		balance = balance *( 1 *  rate/100);
		showBalance();
		

		

		
	}
	}
 
 