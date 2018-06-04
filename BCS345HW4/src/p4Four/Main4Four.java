package p4Four;

public class Main4Four {

	public static final int NUMBER_OF_EXPERIMENTS = 10000; // constant global c++
	
	public static void main(String[] args) {
		System.out.println("Total On Dice     Average Number of Rolls\n");
		System.out.println("-------------     -----------------------\n");
		for (int i =2; i < 13;i++)
		{
			if (i < 10) // clearly the wrong way to format hahah
			{
				System.out.println("      " + i + "               " + aveRollsDiceTotal(i));
			}
			else
			{
				System.out.println("     " + i + "               " + aveRollsDiceTotal(i));
			}
			
		}
		
		System.out.println("Total On Dice     Average Number of Rolls\n");
		System.out.println("-------------     -----------------------\n");
		
		for (int i = 2; i < 13;i++)
		{
			System.out.printf("%7d%22.4f\n", i, aveRollsDiceTotal(i)); // format from book 7 spaces 22 spaces .4f decimals
		}
		
		

	}
	
	public static double aveRollsDiceTotal(int dt)
	{
		double average = 0.0;
		int totalRolls = 0;
		for (int i = 0; i < NUMBER_OF_EXPERIMENTS; i++)
		{
			totalRolls += setDiceRoller(dt);
		}
		average = (double)(totalRolls)/(double)(NUMBER_OF_EXPERIMENTS);
		
		return average;
	}
	
	public static int setDiceRoller(int dv)
	{
		if (dv < 2 || dv > 12) {
			throw new IllegalArgumentException("Impossible total for a pair of dice.");
		}
		
		int die1 =0;
		int die2 =0;
		int numRollCounter =0;
		
		do {
			
		die1 = (int)(Math.random()*6) + 1;
		die2 = (int)(Math.random()*6) + 1;
		numRollCounter++;	
		if (die1 + die2 == dv)
		{
			break;
		}
		
	} while (true);
		return numRollCounter;
		
	}

}
