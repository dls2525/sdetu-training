package oops;

public class CDAaccount {
 public static void main(String[] args) {
	 LoanAccount la = new LoanAccount();
	 la.IncreaseRate();
	 la.setRate();
	 la.SetamSchedule();
	 la.SetTerm();
	 
	 IRate account1 = new LoanAccount();
	 account1.IncreaseRate();
	 account1.setRate();
}
}
 
