package p4Two;

import java.util.Scanner;

public class Main4Two {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a hex number to convert to decimal");
		String userInput = scan.nextLine();
		//int outputInt = 0; // java sets to zero by default habit test value
		//char ch = userInput.charAt(0);
		//outputInt = hexToInt(ch); test only
		
		int value = 0;
		for (int i = 0; i < userInput.length();  i++ )
		{
		   value = value*16 + hexToInt(userInput.charAt(i) );
		   
		}
		
		if ( value > 0) {
			System.out.println("The final value is " + value);
		}
		else
		{
			
		}

	}
	
	public static int hexToInt(char ch) {
		
		int value = 0;
		switch (ch) {
			case '0': value = 0;
				return value;
			case '1': value = 1;
				return value;
			case '2': value = 2;
				return value;
			case '3': value = 3;
				return value;
			case '4': value = 4;
				return value;
			case '5': value = 5;
				return value;
			case '6': value = 6;
				return value;
			case '7': value = 7;
				return value;
			case '8': value = 8;
				return value;
			case '9': value = 9;
				return value;
			case 'A': value = 10;
			case 'a': value = 10;
				return value;
			case 'b': value = 11;
			case 'B': value = 11;
				return value;
			case 'c': value = 12;
			case 'C': value = 12;
				return value;
			case 'd': value = 13;
			case 'D': value = 13;
				return value;
			case 'e': value = 14;
			case 'E': value = 14;
				return value;
			case 'F': value = 15;
			case 'f': value = 15;
				return value;
			default: System.out.println("Error invalid characters entered"); 
				value = -1;
			
		};
		return value;
	}
}
