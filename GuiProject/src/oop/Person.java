package oop;

public class Person {
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
	
	
}
