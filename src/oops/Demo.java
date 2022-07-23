package oops;
	class Person {
		
		String name;
			
		String email;
			
		String phone;
				
		void walk() {
			System.out.println(name + " is walking");
		}
		
		void eat() {
			System.out.println(email);
		}
		
		void sleep() {
			System.out.println(name + " is sleeping");
		}
public class Demo {

	 public static void main(String[] args) {
		 Person person1 = new Person();
		  person1.name = "Joe";
		  person1.email = "Joe@yahoo.com";
		  person1.phone  ="6785309";
		  
		  person1.walk();
		  person1.sleep();
		  person1.eat();
		  
		
	/*	String name = "Joe";
		String email= "Joe@yahoo.com";
		String phone = "8675309";
		
		// Action, activity, behavior 
		
		walking(name);
		System.out.println( name + " is eating ");
			

		String name2 = "Joey";
		String email2 = "Joey@yahoo.com";
		String phone2  = "9675309";
		
		// Action, activity, behavior 
		
		walking(name2);
		System.out.println( name2 + " is walking");
		
		// what about binding properties  together
	
	}
	// Enhance by adding functions to mim code:
	 static void walking(String name) {
		 System.out.println(name + " is eating ");
		 */
	 }
	 
	 
		 
	 }
}
