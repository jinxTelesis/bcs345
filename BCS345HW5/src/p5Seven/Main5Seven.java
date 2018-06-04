package p5Seven;

import java.util.Scanner;

import p5Six.AdditionQuestion5SIX;

public class Main5Seven {
	
	private static AdditionQuestion5SIX[] questions = new AdditionQuestion5SIX[10]; 
	
	private static int[] usersAnswers = new int[10];

	public static void main(String[] args) {
		//Scanner scan = new Scanner(System.in);
		createQuestions();
		adminTest();
		corrTest();
		

	}
	
	public static void createQuestions() {
		for (int i =0; i < 10; i++)
		{
			questions[i] = new AdditionQuestion5SIX();
		}
	}
	
	public static void adminTest()
	{
		for(int i =0; i < 10; i++)
			System.out.println(questions[i].getQuestion());
		
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
			System.out.println(questions[i].getQuestion());
			usersAnswers[i] = scan.nextInt();
			if (questions[i].getCorrectAnswer() == usersAnswers[i])
			{
				System.out.printf("The answer %s is correct! ", usersAnswers[i]);
			}
			else
			{
				//temp = questionsPaOne[i] + questionsPaTwo[i];
				System.out.printf("That is incorrect the answer is %s ", questions[i].getCorrectAnswer());
				wrongCounter -= 10;
			}
			
		}
		System.out.println();
		System.out.println("Your score is " + wrongCounter);
		System.out.println();
		System.out.println("You didn't win a new car :(" );
	}

}
