package testPracticedi;

public class Elf implements vampiric {
	
	private int finese;
	
	Elf(){
		super();
		finese = 0;
	}
	
	public boolean equals(Object o)
	{
		if (o instanceof Elf) {
			Elf oElf = (Elf)o;
			if(this.finese == oElf.finese)
				return true;
		}
		return false;
	}
	
	public void levelDrainAtk(int atk)
	{
		System.out.println("i'm king kong bitch" + atk);
	}
	
	public void batForm() {
		System.out.println("peace out girl scout");
	}
	

}
