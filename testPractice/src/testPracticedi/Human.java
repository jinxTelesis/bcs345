package testPracticedi;

public class Human extends Humanoid {
	
	private int asperation;
	
	Human(){
		super();
		asperation = 10;
		super.setStr(12);
	}
	
	public String toString() {
		String s = null;
		s+= super.toString();
		s+= "My asperation is " + asperation;
		return s;
	}
	
	public void attack(int atk) {
		int atk2 = atk;
		atk2 *=2;
		System.out.println("my attack does this much" + atk2 + " ");
	}
	

	public int compareTo(Human oHuman)
	{
		if(this.asperation > oHuman.asperation)
		{
			return 1;
		}
		else if(this.asperation == oHuman.asperation)
		{
			return 0;
		}
		else
		{
			return -1;
		}
	}

}
