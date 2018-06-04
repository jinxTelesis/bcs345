package p4One;

import java.util.Scanner;

public class Main4One {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a sentence you want Capitalized");
		String userInput = scan.nextLine();
		printCapitalized(userInput);

	}
	
	public static void printCapitalized(String s) {
		
		char ch = ' ';
		char chneg1 = ' ';
		
		for(int i = 0; i < s.length();i++)
		{
			
			ch = s.charAt(i);
			if (i == 0)
			{
				chneg1 = '*';
			}
			else
			{
				chneg1 = s.charAt(i - 1);
			}
			
			if (Character.isLetter(ch) && (! Character.isLetter(chneg1) && (!(chneg1 == '\''))))
			{ // gonna be honest had to guess and check this control statement a few times
				
				System.out.print(Character.toUpperCase(ch));
			}
			else
			{
				System.out.print(ch);
			}
			
		}
		
	}

}
