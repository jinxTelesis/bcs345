package notdefaultpackage;

//import java.util.*; // for scanner object
import java.util.Scanner;

/*This exercise asks you to write a program that tests some of the built-in subroutines 
 * for working with Strings. The program should ask the user to enter their first name and their 
 * last name, separated by a space. Read the user's response using TextIO.getln().
 *  Break the input string up into two strings, one containing the first name and one containing
 *   the last name. You can do that by using the indexOf() subroutine to find the position of the space,
 *    and then using substring() to extract each of the two names. Also output the number of characters 
 *    in each name, and output the user's initials. (The initials are the first letter of the first 
 *    name together with the first letter of the last name.) A sample run of the program
 *     should look something like this:

 */
public class MainHW26 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String userInput ="";
		String firstName ="";
		String lastName ="";
		String firstChar = "";
		String lastNaChar = "";
		int pos = 0;
		int firstLength = 0;
		int lastLength = 0;
		
		System.out.println("Please enter you first and last name seperated by a space");
		userInput = scan.nextLine();
		pos = userInput.indexOf(' ');
		//System.out.println("the position of the index is " + pos); tested first time using indexOf
		firstName = userInput.substring(0, pos); // easier than that ::npos lol
		lastName = userInput.substring(pos + 1); // overloaded version just takes begin
		//System.out.printf("first %s, last %s", firstName, lastName); // s normal S caps 
		firstChar = userInput.substring(0, 1);
		lastNaChar = userInput.substring(pos + 1, pos + 2);// position is the space so +1 / + 2 will be first char
		firstChar = firstChar.toUpperCase();
		lastNaChar = lastNaChar.toUpperCase();
		firstLength = firstName.length();
		lastLength = lastName.length();
		//System.out.printf("first char %s second char %s", firstChar, lastNaChar); // tested 
		System.out.printf("Your first name is %s which has %s characters\n ", firstName, firstLength);
		System.out.printf("your last name is %s which has %s characters\n ", lastName, lastLength);
		System.out.printf("Your initials are %s %s \n", firstChar, lastNaChar);
		
		

	}

}
