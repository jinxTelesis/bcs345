package oop;

public class UndergradClass extends Student {
	
	UndergradClass(){
		super();// need courses only to be U // and status 
	}
	
	UndergradClass(String firstName, String lastName, String[] coursesTaken)
	{
		super(firstName,lastName,'U',coursesTaken);
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
	
	public String toString() {
		String s = super.toString();
		return s;
	}
	

}
