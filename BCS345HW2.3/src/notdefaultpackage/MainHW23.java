package notdefaultpackage;
//import java.util.*;
import java.util.Scanner;

public class MainHW23 {

	public static void main(String[] args) {
		Scanner DresScanner = new Scanner(System.in);
		
		String userName = ""; //java requires an initial value even though the scanner object will get
		String outputStr = "";
		
		System.out.println("Enter your name friend");
		userName = DresScanner.nextLine();
		
		outputStr = userName.toUpperCase();
		System.out.printf("Your name in all caps is %s, it is nice to meet you %s", outputStr, outputStr);
		

	}

}
