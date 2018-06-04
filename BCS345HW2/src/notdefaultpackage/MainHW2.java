

package notdefaultpackage;

public class MainHW2 {

	public static void main(String[] args) {
		int die1 =0;
		int die2 =0;
		int dieroll = 0;
		
		die1 = (int)(Math.random()*6) + 1; // generates int 1-6
		die2 = (int)(Math.random()*6) + 1; // generates int 1-6
		dieroll = die1 + die2; // adds two die to diceroll for output could be done in the output statement
		
		System.out.printf("The first die roll was %s \nThe second die"
				+ " roll was %s \nThe total roll is %s ",  die1, die2, dieroll );

	}

}
