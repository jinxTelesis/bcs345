package p5Two;

import java.util.Scanner;

public class Main5Two {

	public static void main(String[] args) {
		StatCalc5Two  calc;   // Object to be used to process the data.
		calc = new StatCalc5Two();
		Scanner scan = new Scanner(System.in);
		int counter =0; // java sets to zero by default
		double temp =0;
/*		
		for (int i =0; i < 10; i++)
		{
			calc.enter((double)(Math.random()*99) + 1); // think it produces doubles anyways but eh
		}
		
		System.out.println(calc.getMax());
		System.out.println(calc.getMin());
		System.out.println(calc.getSum());
		System.out.println(calc.getStandardDeviation());
*/		System.out.println("This program calculates statistics based on the 6 numbers entered");
		System.out.println("Enter 0 stop entering numbers");
		do {
			
			temp = scan.nextDouble();
			if (temp == 0)
			{
				break;
			}
			calc.enter(temp);
			
			counter++;
			
		} while (true);
		
		System.out.println("Min value is " + calc.getMin());
		System.out.println("Max value is " + calc.getMax());
		System.out.println("Mean value is " + calc.getMean());
		System.out.println("number count is " + calc.getCount());
		System.out.println("Sum of values is " + calc.getSum());
		System.out.println("Standard deviantion is " + calc.getStandardDeviation());
		
		//System.out.println(calc);

	}


}
