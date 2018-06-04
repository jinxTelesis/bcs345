package p5One;


public class PairOfDice5One {
	private int die1;
	private int die2;
	private boolean dieRollSnake = false;
	private int numOfRolls = 0;
	
	PairOfDice5One() // constructor
	{
		die1 = (int)(Math.random() *6) + 1;
		die2 = (int)(Math.random() *6) + 1;
		numOfRolls= 1;
		if (die1 + die2 == 2)
		{
			System.out.println("Snake eyes on object creating! Wow!");
			dieRollSnake = true;
		}
	}
	
	public void rollManual() {
		die1 = (int)(Math.random()*6) + 1;
		die2 = (int)(Math.random()*6) +1;
		System.out.println("Die one's value is " + die1 + "die two's value is " + die2);
		System.out.println("Not recommended to roll dice manually");
		
		if (dieRollSnake == false)
		{
			numOfRolls++;
		}
		
		if (die1 + die2 == 2)
		{
			System.out.println("Snake eyes!");
			dieRollSnake = true;
		}
		
	}
	
	private void roll() {
		die1 = (int)(Math.random()*6) + 1;
		die2 = (int)(Math.random()*6) +1;
	}
	
	public void rollDice() {
		
		
		do {
			roll();
			System.out.println("die one equals " + die1 + " die two equals " + die2);
			numOfRolls++;
			
		}
		
		while (!(die1 + die2 == 2));
		dieRollSnake = true;
		System.out.println("It took " + numOfRolls + " to get snake eyes ");
	}
	
	public int getDie1() {
		return this.die1;
	}
	
	public int getDIe2() {
		return this.die2;
	}
	
	public boolean getSnakeEye()
	{
		return this.dieRollSnake;
	}
	
	public int getNumOfROlls()
	{
		return this.numOfRolls;
	}
	
	public String toString() {
		
		String s;
		
		s = "die1 equals " + die1 + " die2 equals " + die2;
		
		if (dieRollSnake == true)
		{
			s += "/n it took " + numOfRolls + " rolls to get snake eyes ";
		}
		return s;
		
	}
	
	public int compareTo(PairOfDice5One otherPair)
	{
		if(this.numOfRolls < otherPair.numOfRolls)
		{
			return -1;
		}
		else if(this.numOfRolls > otherPair.numOfRolls)
		{
			return 1;
		}
		else
		{
			return 0;
		}
		
	}
	
	public boolean equals(Object o) // think this equality test is silly but good coding practice
	{
		if(o instanceof PairOfDice5One) // check what the class type is 
		{	
			PairOfDice5One otherP =(PairOfDice5One) o; // cast to Person so we can access the attributes
			if(this.die1 == otherP.die1)
					if (this.die2 == otherP.die2)
						if(this.dieRollSnake == otherP.dieRollSnake)
							if(this.numOfRolls == otherP.numOfRolls)
							{
								return true;
							}
		}
		return false;
	}

}
