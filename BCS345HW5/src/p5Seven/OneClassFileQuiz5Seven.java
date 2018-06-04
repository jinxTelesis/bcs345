package p5Seven;

import java.util.Scanner;

public class OneClassFileQuiz5Seven {
	
	private static IntQuestion[] questions;
	private static int[] usersAnswers = new int[10];
	
	
	interface IntQuestion {
        public String getQuestion();
        public int getCorrectAnswer();
    }
	/////////////////////////////////////main //////////////////////////////
	public static void main(String[] args) {
		createQuestions();
		adminTest();
		corrTest();

	}
	
	public static class AdditionQuestion implements IntQuestion {

	    private int a, b; 

	    public AdditionQuestion() {
	        a = (int)(Math.random() * 50 + 1);
	        b = (int)(Math.random() * 50);
	    }

	    public String getQuestion() {
	        return "What is " + a + " - " + b + " ?";
	    }

	    public int getCorrectAnswer() {
	        return a - b;
	    }

	}
	
	public static class SubtractionQuestion implements IntQuestion
	{

		private int a, b; // needs to follow same value structure of AdditionQuestion to be useable in same object array
		
		
		public SubtractionQuestion() {
			a = (int)(Math.random() * 50 + 7);
			b = (int)(Math.random() * 47 - 2);
			
			if (a > b) // swaps values to keep answers positive
			{
				int temp = a;
				a = b;
				b = temp;
			}
		}
		
		public String getQuestion() {
	        return "What is " + a + " + " + b + " ?";
	    }

	    public int getCorrectAnswer() {
	        return a + b;
	    }
	    
	    
	}
	
	
	
	public static void createQuestions() {
		questions = new IntQuestion[10];
		for(int i =0; i < 7; i++)
		{
			if (Math.random() > 0.5)
			{
				questions[i] = new AdditionQuestion();
			}
			else
			{
				questions[i] = new SubtractionQuestion();
			}
		}
		questions[7] = new IntQuestion() {
            public String getQuestion() {
                return "What is the airspeed velocity of a (European) unladen swallow in MPH ";
            }
            public int getCorrectAnswer() {
                return 24;
            }
      }; // ends of assignment 
      questions[8] = new IntQuestion() {
          public String getQuestion() {
              return "When did the vietnam war start for the French (First Indochina War)?";
          }
          public int getCorrectAnswer() {
              return 1946;
          }
      };
      questions[9] = new IntQuestion() {
          public String getQuestion() {
              return "How much is a dollar slice of pizza in NYC";
          }
          public int getCorrectAnswer() {
              return 1;
          }
      };
		
		
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
