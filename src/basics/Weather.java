package basics;

public class Weather {
	
	public static void main(String[] args) {
		// this program will give suggestions of what to wear based on the climate
		int temp = 45;
		    String sunCondition = "overcast";
			if(temp> 60) {
				
				System.out.println("It's pleasant. Wear short and T shirt");
				
			}
			else if(temp > 60 && sunCondition == "Sunny") {
				System.out.println("Wear a long sleeve shirt");
				System.out.println("Wear sun screen");
			}
			else if (temp > 50 ||  sunCondition == "overcast") {
			{
				System.out.println("Looks like a cold day, wear a coat");
			}
			
			System.out.println("The program has ended");
	}
}
}

