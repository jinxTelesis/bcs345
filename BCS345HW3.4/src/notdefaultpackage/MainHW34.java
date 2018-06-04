package notdefaultpackage;

import java.util.Scanner; // more specific import to avoid *

public class MainHW34 {

	public static void main(String[] args) {
		String rawUserInput = "";
		char ch = '\'';
		//System.out.print(ch);
		//System.out.println(Character.isLetter(ch));
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Pleases enter a line of text to convert into words");
		rawUserInput = scan.nextLine();
		wordOutput(rawUserInput);
		

	}
	
	public static void wordOutput(String s) {
		
		char ch = ' ';
		char chneg1 = ' ';
		char chpos1 = ' ';
		boolean newLine = true;
		
		for(int i = 0; i < s.length();i++)
		{
			if(i > 0) // prevents negative index
			{
				chneg1 = s.charAt(i - 1);
			}
			ch = s.charAt(i);
			if (!(i == s.length() - 1)) // prevents index past array values
			{
				chpos1 = s.charAt(i + 1);
			}
			if (   (Character.isLetter(ch)    ) || (    Character.isLetter(chneg1) && ch == '\'' && Character.isLetter(chpos1)  ))
			{
				System.out.print(ch);
				newLine = false;
			}
			else
			{
				if (newLine == false)
				{
					System.out.println();
					newLine = true;
				}
			}
		}
		
	}

}
