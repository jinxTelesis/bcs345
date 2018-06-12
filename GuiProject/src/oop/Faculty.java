package oop;

public class Faculty extends Employee{
	// deemed the comparison of objects strange and not useful code for these classes, could be done on the id num
	public static final int MAX_NUM_COURSES = 10;
	private String courseArr[] = new String[9];
	

	Faculty() {
		super();
	}
	
	Faculty(String firstName, String lastName, String deptName, String[] courseArr)
	{
		// should put more logic in here
		super(firstName, lastName, deptName);
		this.courseArr = courseArr;
	}
	
	public String[] getCourseArr() {
		return courseArr;
	}

	public void setCourseArr(String[] courseArr) {
		this.courseArr = courseArr;
	}

	
	public String toString() { // needs more complete implementation fill count
		String s = null;
		s+= super.toString() +
				"\n Courses are limited to: " + MAX_NUM_COURSES + " ";
		for (int i = 0; i < this.courseArr.length;i++)
		{
			s+= "This faculty teaches " + courseArr[i];
		}
		
		return s;
	}
	
	public boolean equals(Object o) // sorta proud got on first try
	{
		int c =0; // increments one every time array elements equal each other
		if( o instanceof Faculty)
		{
			Faculty otherE = (Faculty)o;
			if(super.equals(otherE))
			{
				if(this.courseArr.length == otherE.courseArr.length)
				{
					for(int i = 0; i < otherE.courseArr.length;i++)
					{
						if(this.courseArr[i] == otherE.courseArr[i])
						{
							c++;
							if(c == this.courseArr.length)
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
