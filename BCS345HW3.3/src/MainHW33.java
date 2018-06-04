//import java.util.*; // for Scanner 
import java.util.Scanner; // for scanner
import java.util.*; // for mapping container
import java.util.function.*; // makes java functional language like python in some manor


// could be solved with if statements for each operator
// could be solved with switch statements for each operation
// could be solved with a key : operation mapping style container // hmm maybe not java not first class objects
// if one of the container types allows you to store differing objects, if not could still do it with stored eval code
// but that would be way to much work for this 

// lines 64 and 120 are the normal solutions 
public class MainHW33 {

	public static void main(String[] args) {
		
		System.out.println("Enter 0 as the number to exit program");
		ifElseCal(); // for if statement
		//switchCal(); // for switch statement
/*		DreMath d1 = new DreMath();
		DreMath d2 = new DreMath();
		DreMath d3 = new DreMath();
		DreMath d4 = new DreMath();
		
		Map<String, DreMath> mappingContainer = new HashMap<String, DreMath>();
		mappingContainer.put("+", d1);
		mappingContainer.put("-", d2);
		mappingContainer.put("*", d3);
		mappingContainer.put("/", d4);
		
		Scanner scan = new Scanner(System.in);
		double firstNumber =0;
		double secondNumber = 0;
		double value = 0;
		String operator = "";
		
		System.out.println("Welcome to Andre's text based calculator");
		System.out.println("Please enter a number follow by the operation followed by the second number");
		System.out.println("Please enter a number ");
		firstNumber = scan.nextDouble();
		scan.nextLine(); // to clear return characters
//		if(firstNumber == 0)
//		{
//			System.out.println("goodbye ");
//			break;
//		}
		System.out.println("Please enter an operation you would like done ");
		operator = scan.nextLine();
		
		System.out.println("Please enter the last number ");
		secondNumber = scan.nextDouble();
		
		scan.nextLine(); // to clear return character
		operator.replaceAll(" ", ""); // removes potential white spaces
*/		
		

	}
	
	public static void ifElseCal()
	{
		
		do {
			
			Scanner scan = new Scanner(System.in);
			double firstNumber =0;
			double secondNumber = 0;
			double value = 0;
			String operator = "";
			
			System.out.println("Welcome to Andre's text based calculator");
			System.out.println("Please enter a number follow by the operation followed by the second number");
			System.out.println("Please enter a number ");
			firstNumber = scan.nextDouble();
			scan.nextLine(); // to clear return characters
			if(firstNumber == 0)
			{
				System.out.println("goodbye ");
				break;
			}
			System.out.println("Please enter an operation you would like done ");
			operator = scan.nextLine();
			
			System.out.println("Please enter the last number ");
			secondNumber = scan.nextDouble();
			
			scan.nextLine(); // to clear return character
			operator.replaceAll(" ", ""); // removes potential white spaces
			
			if (operator.equals("+"))
			{
				value = firstNumber + secondNumber;
				System.out.printf("This is the result %s \n", value);
			}
			else if(operator.equals("-"))
			{
				value = firstNumber - secondNumber;
				System.out.printf("This is the result %s \n", value);
			}
			else if (operator.equals("*"))
			{
				value = firstNumber * secondNumber;
				System.out.printf("This is the result %s \n", value);
			}
			else if (operator.equals("/"))
			{
				value = firstNumber / secondNumber;
				System.out.printf("This is the result %s \n", value);
			}
			else
			{
				System.out.println("invalid operation entered");
			}
		
		
		
		} while (true);
	}
	public static void switchCal()
	{
		do {
			Scanner scan = new Scanner(System.in);
			double firstNumber =0;
			double secondNumber = 0;
			double value = 0;
			String operator = "";
			
			System.out.println("Welcome to Andre's text based calculator");
			System.out.println("Please enter a number follow by the operation followed by the second number");
			System.out.println("Please enter a number ");
			firstNumber = scan.nextDouble();
			scan.nextLine(); // to clear return characters
			if(firstNumber == 0)
			{
				System.out.println("cya");
				break;
			}
			System.out.println("Please enter an operation you would like done ");
			operator = scan.nextLine();
			
			System.out.println("Please enter the last number ");
			secondNumber = scan.nextDouble();
			
			scan.nextLine(); // to clear return character
			operator.replaceAll(" ", ""); // removes potential white spaces
			
			switch (operator) {
				case "+":
					value = firstNumber + secondNumber;
					System.out.printf("This is the result %s \n", value);
					break;
				case "-":
					value = firstNumber - secondNumber;
					System.out.printf("This is the result %s \n", value);
					break;
				case "*":
					value = firstNumber * secondNumber;
					System.out.printf("This is the result %s \n", value);
					break;
				case "/":
					value = firstNumber / secondNumber;
					System.out.printf("This is the result %s \n", value);
					break;
				default:
				{
					System.out.println("You didn't enter a valid operator ");
				}
			
			}
		} while (true);
	}
	

}
