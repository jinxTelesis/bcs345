package oop;

public class Person { // compare not implement does not make sense 
	// IMO in this class 
	private String firstName;
	private String lastName;
	
	Person(){
		this.firstName = "";
		this.lastName = "";
	}
	
	Person(String firstName, String lastName)
	{
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	// control shift A generated, i love eclipse
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String toString() {
		String s = null;
		s+= "The employee's first name is: " + this.firstName +
		"\n The employee's last name is: " + this.lastName;
		return s;
	}
	
	public boolean equals(Object o)
	{
		if( o instanceof Person)
		{
			Person otherE = (Person)o;
			if(this.firstName == otherE.firstName) {
				if(this.lastName == otherE.lastName) {
					return true;
				}
			}
		}
		return false;
	}
	
}
