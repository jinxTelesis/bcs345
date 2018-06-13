package oop;

public class UnderGraduate extends Student {
	
	
	UnderGraduate(){
		super();// need courses only to be U // and status 
	}
	
	UnderGraduate(String firstName, String lastName, String[] coursesTaken, int inputArrLength)
	{
		super(firstName,lastName,'U',coursesTaken, inputArrLength);
	}
	
	public boolean equals(Object o)
	{
		if(o instanceof UnderGraduate)
		{
			UnderGraduate otherS = (UnderGraduate)o; // cast
			if (super.sID == otherS.sID)// allows name changes, which mirror reality
			{//student equivlency only based on id
				return true; 
			}
		}
		return false;
	}
	
	public String toString() {
		String s = super.toString();
		return s.replaceAll("null", "");
	}
	

}
