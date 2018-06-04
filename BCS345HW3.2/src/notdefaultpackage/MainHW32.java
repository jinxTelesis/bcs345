package notdefaultpackage;

/*
Which integer between 1 and 10000 has the largest number of divisors, and how many divisors does it have?
Write a program to find the answers and print out the results. It is possible that several integers in this
range have the same, maximum number of divisors. Your program only has to print out one of them.
An example in Subsection 3.4.2 discussed divisors. The source code for that example is CountDivisors.java.

You might need some hints about how to find a maximum value.
 The basic idea is to go through all the integers, keeping track of the largest number of divisors that
  you've seen so far. Also, keep track of the integer that had that number of divisors.
*/
public class MainHW32 {

	public static void main(String[] args) {
		divsiorCounter();

	}
	
	public static void divsiorCounter() {
		int number = 2;
		int curMaxNumber = 1;
		int currentMax = 1;
		int numberOfDiv = 1;
		int divisor = 1;
		
		for ( ;number <= 10000;number++) // number set outside for loop
		{
			divisor = 1;
			numberOfDiv = 0; // didn't have this in the first time need to reset
			
			for (divisor = 1; divisor <= number; divisor++) // lacking = first time <= needed to compare the number itself
			{
				if (number % divisor == 0)
				{
					++numberOfDiv;
				}
			}
			
			if (numberOfDiv > currentMax)
			{
				currentMax = numberOfDiv;
				curMaxNumber = number;
			}
			
		}
		
		System.out.printf("The maximun number of divisors found is %s the number that had that many is %s", currentMax ,curMaxNumber);
	
	}

}
