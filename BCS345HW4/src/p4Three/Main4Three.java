package p4Three;

public class Main4Three {

	public static void main(String[] args) {
		int start =9;
		start = setDiceRoller(9);
		System.out.printf("the number of rolls to get that total was %s", start);

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
		System.out.println(die1);	
		if (die1 + die2 == dv)
		{
			break;
		}
		
	} while (true);
		return numRollCounter;
		
	}
}
