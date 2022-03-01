/**
 * 
 */
package basics;

/**
 * @author Harshit.Bhatnagar
 *
 */

interface camera2{
    void Takephoto();
    void Takevideo();
    private void greet(){
        System.out.println("goodmorning");
    }
    default void Recordin4k(){
        greet();
        System.out.println("REcord the video in 4k...");
    }
}

interface Wifi2{
    String[] Searchnetwork();
    void Getnetwork(String network);
}

class Cellphone2{
    void Pickcall(){
        System.out.println("Pick the call");
    }

    void Cutcall(){
        System.out.println("Cut the call");
    }
}

class Smartphone4 extends Cellphone2 implements camera2, Wifi2{
    public void Takephoto(){
        System.out.println("Clicking a photo");
    }
    public void Takevideo(){
        System.out.println("Taking a video");
    }
    public String[] Searchnetwork(){
        System.out.println("Search the network");
        String[] arr = {"Happy", "Jiofi", "Neeraj5B"};
        return arr;
    }
    public void Getnetwork(String network){
        System.out.println("Connecting to "+network);
    }

    public void Sampleclass(){
        System.out.println("Just for an eg");
    }
}





public class PolymorphismInterface {
	
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		camera2 cm = new Smartphone4();
        cm.Takephoto(); // Allowed because Camera interface is implemented.
//        cm.Searchnetwork(); // Not allowed
//        cm.Sampleclass();  // Not allowed
        Smartphone4 sm4 = new Smartphone4();  // Here you can use all the methods present inside the class.
        sm4.Searchnetwork();
        sm4.Getnetwork("Jiofi");
        
        //*******************************************************************
        
        cm.Recordin4k();
        sm4.Takephoto();

	}

}
