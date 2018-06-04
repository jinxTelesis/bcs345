package notdefaultpackage;

/*
 * multiple static methods to display different ways of computing snake eyes
 */

public class MainHW31 {

	public static void main(String[] args) {
		int result = 0;
		//result = diceRoller1();
		//System.out.println("it took this many iterations to get snake eyes " + result); // using both forms of print to help remember
		//result = diceRoller2();
		//System.out.println("it took this many iterations to get snake eyes " + result);
		//result = diceRoller3();
		//System.out.println("it took this many iterations to get snake eyes " + result);
		result = diceRollerRecursive(0, 0, 0);
		System.out.printf("it took this many recursive calls to get snake eyes %s ", result);
	}
	
	public static int diceRollerRecursive(int counter, int dieOne, int dieTwo)
	{
		++counter;
		dieOne = (int)(Math.random()*6 + 1);
		dieTwo = (int)(Math.random()*6 + 1);
		dieOne = dieOne+dieTwo;
		//System.out.println("dieone " + dieOne);
		//System.out.println("counter value " + counter);
		if (dieOne == 2)
			return counter;
		else
		{
			return diceRollerRecursive(counter, dieOne, dieTwo);
		}
		// tried to write (dieOne == 2)? return counter : diceRollerRecursive(counter, dieOne,dieTwo);
	}
	
	public static int diceRoller1()
	{
		int dieOne =0;
		int dieTwo =0;
		boolean exit = false;
		int counter = 0;
		
		while(!exit)
		{
			dieOne = (int)(Math.random()*6)+ 1;
			dieTwo = (int)(Math.random()*6)+ 1;
			counter++;
			if ((dieOne + dieTwo) == 2)
			{
				exit = true;
			}
		}
		
		
		return counter;
	}
	
	public static int diceRoller2()
	{
		int dieOne =0;
		int dieTwo =0;
		int counter = 0;
		
		while(true)
		{
			dieOne = (int)(Math.random()*6)+ 1;
			dieTwo = (int)(Math.random()*6)+ 1;
			counter++;
			if ((dieOne + dieTwo) == 2)
			{
				break;
			}
		}
		
		return counter;
	}
	
	public static int diceRoller3() // think this one uses the least amount of resources
	{
		int dieOne =0;
		int counter = 1;
		
		for (; ;counter++)
		{
			dieOne = (int)(Math.random()*6)+ 1;
			dieOne = dieOne +( (int)(Math.random()*6)+ 1);
			//System.out.printf("dieOne %s ", dieOne); // testing
			if ((dieOne) == 2)
			{
				break;
			}
		}
		
		return counter;
	}
	
	public static int diceRoller4()
	{
		int dieOne =0;
		int dieTwo =0;
		int counter = 0;
		
		do
		{
			dieOne = (int)(Math.random()*6)+ 1;
			dieTwo = (int)(Math.random()*6)+ 1;
			++counter;
			if ((dieOne + dieTwo) == 2)
			{
				break;
			}
		} while (true);
		
		return counter;
	}
	
	

}
