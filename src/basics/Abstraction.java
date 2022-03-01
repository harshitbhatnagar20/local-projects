package basics;

/**
 * @author Harshit.Bhatnagar
 *Abstraction aims to hide complexity from the users and show them only the relevant information.
 */

// You can hide internal implementation details by using abstract classes or interfaces.
abstract class Animal { // PARTIAL ABSTRACTION.
	

	// Abstract methods :
	abstract void move();

	abstract void eat();

	// concrete method :
	void label() {
		System.out.println("Animal's data:");
	}
}

class Bird extends Animal  {
	void move() {
		System.out.println("Moves by flying.");
	}

	void eat() {
		System.out.println("Eats birdfood.");
	}

	
}

public class Abstraction {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Animal myBird = new Bird();
		
		
		myBird.label();
		myBird.eat();
		myBird.move();
		
		
		
	}

}
