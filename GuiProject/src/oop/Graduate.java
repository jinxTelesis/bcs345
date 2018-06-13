package oop;

public class Graduate extends Student{
	
	Graduate() {
		super();
	}
	
	Graduate(String firstName, String lastName, String[] coursTak)
	{
		super(firstName,lastName,'G',coursTak);
		//coursesTaken = coursTak;
	}
		
	
	public boolean equals(Object o)
	{
		if(o instanceof UndergradClass)
		{
			UndergradClass otherS = (UndergradClass)o; // cast
			if (super.sID == otherS.sID)// allows name changes, which mirror reality
			{//student equivlency only based on id
				return true; 
			}
		}
		return false;
	}
	
	public String toString()
	{
		String s =super.toString();
		return s.replaceAll("null", "");
	}

}
