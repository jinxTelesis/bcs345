package p4Seven;

import java.util.Scanner;
// use three subs 

// write passing the arrays
public class Main4seven {
	
	private static int[] questionsPaOne = new int[10];
	private static int[] questionsPaTwo = new int[10];
	private static int[] userAnswers = new int[10];

	public static void main(String[] args) {
		genTest();
		adminTest();
		corrTest();
	}
	
	public static void genTest()
	{
		for(int i =0; i < 10;i++)
		{
			questionsPaOne[i] = (int)(Math.random()*45)+1;
			questionsPaTwo[i] = (int)(Math.random()*50)+1;
		}
		
	}
	
	public static void adminTest()
	{
		for(int i =0; i < 10; i++)
			System.out.println("What is " + questionsPaOne[i] + " plus " + questionsPaTwo[i] + " ?");
		
		System.out.println();
		System.out.println();
	}
	
	public static void corrTest()
	{
		Scanner scan = new Scanner(System.in);
		int temp = 0;
		int wrongCounter = 100;
		
		for (int i = 0; i < 10; i++)
		{
			System.out.println();
			System.out.println("What is " + questionsPaOne[i] + " plus " + questionsPaTwo[i] + " ?");
			userAnswers[i] = scan.nextInt();
			if (questionsPaOne[i] + questionsPaTwo[i] == userAnswers[i])
			{
				System.out.printf("The answer %s is correct! ", userAnswers[i]);
			}
			else
			{
				temp = questionsPaOne[i] + questionsPaTwo[i];
				System.out.printf("That is incorrect the answer is %s ", temp);
				wrongCounter -= 10;
			}
			
		}
		System.out.println();
		System.out.println("Your score is " + wrongCounter);
	}

}
