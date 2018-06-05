package testPracticedi;

public class Driver {

	public static void main(String[] args) {
		Humanoid orcMan = new Humanoid();
		Humanoid orcMan2 = new Humanoid(10, 8, 12, 14, 13, 19);
		Human humanDude = new Human();
		Elf Kishawna = new Elf();
		
		
		System.out.println(orcMan.getDex());
		System.out.println(orcMan2.getCha());
		System.out.println(humanDude.str);
		System.out.println(Elf.levelDrainPow);

	}

}
