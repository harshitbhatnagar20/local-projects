/**
 * 
 */
package basics;

/**
 * @author Harshit.Bhatnagar
 *
 */
public class Loops {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// While loop :
		int i = 10;
		while(i<=20) {
			System.out.println(i);
			i++;
		}
		
		// For each loop :
		int [] array = {2,3,4};
		
		for(int element:array) {
			System.out.println(element);
		}

	}

}
