package testPracticedi;


public class Humanoid implements Comparable<Humanoid> {
	
	// base class
	
	private int legs;
	private int heads;
	private int arms;
	
	protected int str;
	private int dex;
	private int con;
	private int intel;
	private int wis;
	private int cha;
	
	Humanoid()
	{
		legs = 2;
		heads = 1;
		arms = 2;
		str = 10;
		dex = 10;
		con = 10;
		intel = 10;
		wis = 10;
		cha = 10;
	}
	
	Humanoid(int str, int dex, int con, int intel, int wis, int cha)
	{
		this();
		this.str = str;
		this.dex = dex;
		this.con = con;
		this.intel = intel;
		this.wis = wis;
		this.cha = cha;
		
	}
	
	Humanoid(int legs, int heads, int arms, int str, int dex, int con, int intel, int wis, int cha)
	{
		this();
		this.legs = legs;
		this.heads = heads;
		this.arms = arms;
		this.str = str;
		this.dex = dex;
		this.con = con;
		this.intel = intel;
		this.wis = wis;
		this.cha = cha;
	}
	
	public int getStr() {
		return this.str;
	}
	
	public int getDex() {
		return this.dex;
	}
	
	public int getCon() {
		return this.con;
	}
	public int getIntel() {
		return this.intel;
	}
	
	public int getWis() {
		return this.wis;
	}
	
	public int getCha() {
		return this.cha;
	}
	
	public void setStr(int str) {
		this.str = str;
	}
	
	public void setDex(int dex) {
		this.dex = dex;
	}
	
	public void setCon(int con) {
		this.con = con;
	}
	public void setIntel(int intel)
	{
		this.intel = intel;
	}
	public void setWis(int wis)
	{
		this.wis = wis;
	}
	public void setCha(int cha)
	{
		this.cha = cha;
	}
	
	public String toString() {
		String s ="i know how to concatinate words ";
		s+= this.str + " " + this.dex + " " + this.con + " " + this.intel + " " + this.wis + " " + this.cha;
		
		return s;
	}
	
	public void attack(int atk) {
		System.out.println("I hit on " + atk);
	}
	
	public int compareTo(Humanoid hum)
	{
		if(this.wis > hum.wis) {
			return 1;
		}
		else if (this.wis == hum.wis)
		{
			return 0;
		}
		else
		{
			return -1;
		}
	
	}
	
	public boolean equals(Object o)
	{
		if(o instanceof Humanoid)
		{
			Humanoid otherH = (Humanoid)o;
			if(this.dex == otherH.dex)
			{
				return true;
			}
		}
		return false;
	}
	
}
