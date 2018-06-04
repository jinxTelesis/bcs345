package Attempt1;

public class MainHW36 {

	public static void main(String[] args) {
		System.out.println("This program finds the numbers between 1-10000 with the maximun number of divisiors");
		divisorCounter();

	}
	
	public static void divisorCounter() {
		
		int divisorCountArr[] = new int[10005]; // make sure array larger than index you are traversing
		int number = 2;
		int currentMax = 1;
		int numberOfDiv = 1;
		int divisor = 1;
		
		for ( ;number <= 10000;number++) // number already set to 2
		{
			divisor = 1;
			numberOfDiv = 0; // didn't have this in the first time
			
			for (divisor = 1; divisor <= number; divisor++) // lacking = first time <= needed to compare the number itself
			{
				if (number % divisor == 0)
				{
					++numberOfDiv;// increments up divsior every time there is not remainder via modulus
				}
			}
			
			if (numberOfDiv > currentMax) // tracks current max
			{
				currentMax = numberOfDiv;
			}
			
			divisorCountArr[number] = numberOfDiv; // stores the number of of divisors at the array position
			// could be solved with parallel arrays but waste of memory
		}
		
		for (int i = 0; i < divisorCountArr.length; i++)
		{
			if (divisorCountArr[i] == currentMax) // if the divisor count at that position is equal 
				//to max then it prints out that position which is the number
			{
				System.out.print("One of the numbers with a max number of divisors is " + i + ".");
				System.out.println(" It has " + currentMax + " divisors " + ".");
			}
		}
		
	}

}
