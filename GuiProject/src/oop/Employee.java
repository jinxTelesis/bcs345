package oop;

public class Employee extends Person implements Comparable<Employee> {
	private String firstName;
	private String lastName;
	private String deptName;
	private static int ID;
	private int eID;

	Employee(){
		super();
		this.deptName = "";
		ID++;
		this.eID = ID;
	}
	
	Employee(String firstName, String lastName, String deptName)
	{
		super(firstName, lastName);
		//this.firstName = firstName;
		//this.lastName = lastName;
		ID++;
		this.deptName = deptName;
		this.eID = ID;
	}
/*	
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	*/
	public void setDeptName(String deptName)
	{
		this.deptName = deptName;
	}
/*	
	public String getFirstName()
	{
		return this.firstName;
	}
	
	public String getLastName()
	{
		return this.lastName;
	}
*/	
	public String deptName()
	{
		return this.deptName;
	}
	
	public String toString()
	{
		String s = null;
		s+= "The employee's first name is: " + this.firstName +
		"\n The employee's last name is: " + this.lastName +
		"\n The employee works for the: " + this.deptName + " department " +
		"\n The employee's id is : " + this.eID;
		
	return s;
	}

	public boolean equals(Object o)
	{
		if( o instanceof Employee)
		{
			Employee otherE = (Employee)o;
			if(this.firstName == otherE.firstName) {
				if(this.lastName == otherE.lastName) {
					if(this.deptName == otherE.deptName)
					{
						if(this.eID == otherE.eID)
							return true;
					}
				}
			}
		}
		return false;
	}

	
	public int compareTo(Employee o) {
		if(this.eID > o.eID)
		{
			return 1;
		}
		else if (this.eID == o.eID)
		{
			return 0;
		}
		else
		{
			return -1;
		}
	}
	
	
	
	
	
	
}
