package basics;

public class Strings {

	public static void main(String[] args) {
		
		String bookTitle;
		String wordChoice = "Ring";
		bookTitle = "The Lords of the Rings";
		
		if (bookTitle.contains(wordChoice));
		System.out.print("The book contains the word Ring");
	}
		
		String browser = "Chrome"; {
			
		if (browser.equalsIgnoreCase("chrome")) {
			System.out.println("The browser is chrome");
		}
		String firstName = "Tie";
		String lastName  = "Short";
		String SSN = "985264264"; 
		
		System.out.print(firstName.substring(0,1));
		System.out.print(lastName.substring(0,1));
		System.out.println(SSN.substring(5));
}
}