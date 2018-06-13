package oop;

public class Staff extends Employee{
	// deemed the comparison of objects strange and not useful code for these classes could be done on id number
	
	private String[] duties = new String[20];
	
	
	Staff() {
		super();
	}
	
	Staff(String firstName, String lastName, String deptName, String[] duties)
	{
		super(firstName, lastName, deptName);
		if (duties.length > 19)
		{
			System.out.println("duties array has to be less than 20 items");
		}
		else
		{
			this.duties = duties;
		}
		
	}
	
	public void setDuties(String[] duties)
	{
		if (duties.length > 19)
		{
			System.out.println("duties array has to be less than 20 items");
		}
		else
		{
			this.duties = duties;
		}
	}
	
	public String[] getDuties() {
		return this.duties;
	}
	
	public String toString() { // needs more complete implementation fill count
		String s = super.toString();
		for (int i = 0; i < this.duties.length;i++)
		{
			s+= " The staff has " + duties[i];
		}
		
		return s.replaceAll("null", "");
	}
	
	public boolean equals(Object o) // sorta proud got on first try
	{
		int c =0; // increments one every time array elements equal each other
		if( o instanceof Staff)
		{
			Staff otherE = (Staff)o;
			if(super.equals(otherE))
			{
				if(this.duties.length == otherE.duties.length)
				{
					for(int i = 0; i < otherE.duties.length;i++)
					{
						if(this.duties[i] == otherE.duties[i])
						{
							c++;
							if(c == this.duties.length)
							{
								return true;
							}
						}
					}
				}
			}
		}
		
		return false;
	}
	
	
}
