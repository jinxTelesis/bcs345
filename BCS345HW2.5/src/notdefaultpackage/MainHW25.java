package notdefaultpackage;

// import java.util.*; // import for scanner object
import java.util.Scanner; // made it more selective
public class MainHW25 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int numOfEggs =0;
		int gross =0;
		int dozen = 0;
		int remainingEggs =0; // use remainingEggs as a temp variable and output makes it a little harder to read
		// allocates less memory
		
		System.out.println("Enter the number of eggs you have");
		System.out.println("this program will convert the number");
		System.out.println("gross, drozen and single egg format");
		
		numOfEggs = scan.nextInt();
		
		gross = numOfEggs / 144; // gross number
		remainingEggs = numOfEggs % 144; // holds remainder
		
		dozen = remainingEggs / 12; // dozen number
		remainingEggs %= 12; // holds remainder
		
		System.out.println("number of gross" + gross);
		System.out.println("dozens of eggs" + dozen);
		System.out.println("remaining eggs" + remainingEggs);
		

	}

}
