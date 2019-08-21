
package limeade.co;
import java.util.Scanner; 
public class limeade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cups = new Scanner(System.in);  
	    System.out.println("How many cups of limeade do you want?");

	    int limeade = cups.nextInt();  
	    System.out.println("You want " + limeade + " cups of limeade.");
	    double price = 2.50;
	    limeade = limeade * price;
	  }
	} 

