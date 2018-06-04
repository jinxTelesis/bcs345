package p5Two;

/** 
 * An object of class StatCalc can be used to compute several simple statistics
 * for a set of numbers.  Numbers are entered into the dataset using
 * the enter(double) method.  Methods are provided to return the following
 * statistics for the set of numbers that have been entered: The number
 * of items, the sum of the items, the average, and the standard deviation
 */

public class StatCalc5Two {

    private int count;   // Number of numbers that have been entered.
    private double sum;  // The sum of all the items that have been entered.
    private double squareSum;  // The sum of the squares of all the items.
    private double min;
    private double max;
    private boolean setmin = false;
    /**
     * Add a number to the dataset.  The statistics will be computed for all
     * the numbers that have been added to the dataset using this method.
     */
    public void enter(double num) {
    	if (setmin == false)
    	{
    		min = num;
    		setmin = true;
    	}
        count++;
        sum += num;
        squareSum += num*num;
        if (num < min)
        {
        	min = num;
        }
        if (num > max)
        {
        	max = num;
        }
    }
    
    public double getMin() // java will set min and max to zero by default rather than having an undefined value
    {
    	return this.min;
    }
    
    public double getMax() // java will set min and max to zero by default rather than having an undefined value
    {
    	return this.max;
    }

    /**
     * Return the number of items that have been entered into the dataset.
     */
    public int getCount() {
        return count;
    }

    /**
     * Return the sum of all the numbers that have been entered.
     */
    public double getSum() {
        return sum;
    }

    /**
     * Return the average of all the items that have been entered.
     * The return value is Double.NaN if no numbers have been entered.
     */
    public double getMean() {
        return sum / count;  
    }

    /**
     * Return the standard deviation of all the items that have been entered.
     * The return value is Double.NaN if no numbers have been entered.
     */
    public double getStandardDeviation() {  
        double mean = getMean();
        return Math.sqrt( squareSum/count - mean*mean );
    }
    
 /*
  private int count;   // Number of numbers that have been entered.
    private double sum;  // The sum of all the items that have been entered.
    private double squareSum;  // The sum of the squares of all the items.
    private double min;
    private double max;
  */
    
    public String toString() {
    	
    	double mean = 0;
    	if (setmin == true)
    	{
    		mean = getMean();
    	}
    	
    	String s = "";
    	s = " Total number of values entered is " + count +
    		" The sum is " + sum +
    		" the min value is " + min +
    		" the max value is " + max +
    		" the mean is " + sum/count + Math.sqrt(squareSum / count - mean*mean);
    		
    	return s;
    }
 /*   
    public boolean equals(Object o)
	{
		if(o instanceof Person) // check what the class type is 
		{	
			Person otherP =(Person) o; // cast to Person so we can access the attributes
			if(this.height == otherP.height)
					if (this.weight == otherP.weight)
						if(this.gender == otherP.gender)
			{
				return true;
			}
		}
		return false;
	}
*/
    
    public boolean equals(Object o)
    {
    	if (o instanceof StatCalc5Two)
    	{
    		StatCalc5Two OtherStat = (StatCalc5Two) o;
    		if(this.count == OtherStat.count)
    			if(this.sum == OtherStat.sum)
    				if(this.min == OtherStat.min)
    					if(this.max == OtherStat.max)
    						if(this.squareSum == this.squareSum)
    						{
    							return true;
    						}
    	}
    	return false;
    }
}