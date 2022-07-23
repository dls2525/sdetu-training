package oops;

public class BAnkAccountApp {
	public static void main(String[] args) {
		 {
			BankAccount acc1 = new BankAccount();
			
			acc1.accountNumber = "06189435";
			//acc1.Name = " Roger Hue";
			acc1.setName("Roger Hue");
			System.out.print(acc1.getName());
			acc1.setSsn("2356987456");
			System.out.print("  SSN "+ acc1.getSsn());
			acc1.balance = 10000;
			acc1.setRate();
			acc1.IncreaseRate();
			
			
			acc1.deposit(1500);
			//acc1.deposit(1500);
			//acc1.deposit(1500);
			//acc1.withdraw(2000);
			
			System.out.println(acc1.toString());
		 }
	}


			
		    BankAccount acc2 = new BankAccount("Checking Account");
		    acc2.accountNumber = "06189435";
			
		    BankAccount acc3 = new BankAccount("Savings Account", 5000);
			acc3.accountNumber = "01689453";
			
			/*acc3.checkBalance();
			
			// Demo for Inhertaince
			
			/*CDAccount cd1 = new CDAccount();
			cd1.balance = 3000;
			cd1.Name = "Valentine";
			cd1.accountType = "CD Account";
			System.out.println(cd1.toString());
			

			//acct3.checkBalance();
			
			System.out.println(acc1.routingNumber);
			System.out.println(acc1.routingNumber);
			System.out.println(acc1.routingNumber);
		}
	}
	//Creating a new bank account

*/
