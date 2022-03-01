/**
 * 
 */
package basics;

/**
 * @author Harshit.Bhatnagar
 *
 */


// 1. METHOD OVERLOADING
class Employee02 {
	public void greet() {
		System.out.println("Good morning");
	}
	public void greet(String a) {
		System.out.println("Good morning "+a);
	}
	public void greet(String a,String b) {
		System.out.println("Good morning "+a+" and "+b);
	}
}

//2. METHOD OVERRIDING 

class Employee03 extends Employee02 {
	
	@Override
	public void greet() {
		System.out.println("Good morning Employee.");
	}
}
public class Polymorphism {

	/**
	 * @param args
	 * 
	 * Polymorphism : Basically of two types :
	 * 1. Static Polymorphism = Method Overloading
	 * 2. Dynamic Polymorphism = Method Overriding
	 */
	public static void main(String[] args) {
		Employee02 emp = new Employee02();
		emp.greet();
		emp.greet("Harshit");
		emp.greet("Harshit", "Jatin");
		
		
		//***************************************
		
		
		Employee03 emp3 = new Employee03();
		emp3.greet();
		

	}

}
