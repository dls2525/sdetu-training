package basics;

public class Cities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// declare and define an array
		String[] cities = {"New York", "San Francisoc", "Miami", "Dallas"};
		
		
		
		String[] countries;
		
		countries = new String[3];
		countries[0] = "USA";
		countries[1] = "Canada";
		countries[2] =" Mexico";
	

	
	String[] states = new String[5];
	states[0]= "Califoria";
	states[1]= "Ohio";
	states[2]= "New Jersey";
	states[3]= "Texas";
	states[4]= "Utah";	
	int i = 0;
	do {
		System.out.println("STATE " +  states[i] + " ");
		i++;
	} while (i < states.length); 
	
	int n = 0;
	boolean  statefound = false;
	while (n<=4) {
	 System.out.println(" STATE at " + n +  ":" + states[n]);
	 n++;
	}
	}
	
}

		
	

