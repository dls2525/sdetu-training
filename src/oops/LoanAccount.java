package oops;

public class LoanAccount implements IRate {

	@Override
	public void setRate() {
		// TODO Auto-generated method stub
		
		System.out.println("Rate");
		
	}

	@Override
	public void IncreaseRate() {
		// TODO Auto-generated method stub
		System.out.println("Increase Rate");
	}
		

	

	public void SetTerm() {
	System.out.println("Setting the term to:"  +Term + "years");
}
	public void SetamSchedule() {
	System.out.println("Amorization schedule");
	}
}
