package notdefaultpackage;
//import java.util.*; // imported for scanner object
import java.util.Scanner;

public class MainHW24 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int quarters = 0;
		int dimes = 0;
		int nickles = 0;
		int pennies = 0;
		double total = 0.0;
		
		System.out.println("How many quarters do you have?");
		quarters = scan.nextInt();
		System.out.println("How many dimes do you have?");
		dimes = scan.nextInt();
		System.out.println("how many nickles do you have?");
		nickles = scan.nextInt();
		System.out.println("how many pennies do you have?");
		pennies = scan.nextInt();
		
		total = (quarters * .25) + (dimes * .10) + (nickles * .05) + (pennies * .01);  
		System.out.printf("the total amount of change you have in %s in dollars", total);
		

	}

}
