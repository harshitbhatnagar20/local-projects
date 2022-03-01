package basics;
/**
 * @author Harshit.Bhatnagar
 * Interfaces : Provides 100% Abstraction.
 */ 

interface Cycle{
	void brake();
	void speed();
}

interface Horn{
	void applyHorn();
}

class Bike implements Cycle,Horn{
	public void brake() {
		System.out.println("Applying brake");
	}
	public void speed() {
		System.out.println("Speeding up");
	}
	public void applyHorn() {
		System.out.println("Applying Horn");
	}
}

public class Interfaces {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Bike bike = new Bike();
		bike.applyHorn();
		bike.brake();
		bike.speed();
		
		
	
		
	}

}
