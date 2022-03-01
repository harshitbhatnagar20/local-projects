/**
 * 
 */
package basics;

/**
 * @author Harshit.Bhatnagar
 * Inheritance makes it possible to create a child class that inherits the properties of a parent class.
 */

class Base {
	 int x;

	
	public int getX() {
		return x;
	}

	
	public void setX(int x) {
		this.x = x;
	}
	
	void Print() {
		System.out.println("This'll print.");
	}
	 
}
class Derived extends Base {
	int y;

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
}
	
	
public class Inheritance {

	public static void main(String[] args) {
		Derived dev = new Derived();
		dev.setX(20);
		System.out.println(dev.getX());
		dev.Print();
		dev.setY(30);
		System.out.println(dev.getY());
	}

}
