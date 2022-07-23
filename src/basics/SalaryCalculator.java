package basics;

public class SalaryCalculator {

	public static void main(String[] args) {
		String career;
		System.out.println("program is starting");
		career = "Software Developer";
		System.out.println("My career is: " + career);
		// salary calculator  compute annual salary 
		
		//Declare
		int hourPerWeek = 40;
		int weeksPerYear = 50;
		double rate = 42.50;
		
		double salary = hourPerWeek *  weeksPerYear * rate; 
		System.out.println("My Salary as a + career" + "at the rate " + rate + " per hour is $ " + salary  + " per year");
		
		
	}

}
