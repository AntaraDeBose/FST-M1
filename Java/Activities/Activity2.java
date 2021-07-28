package activities;

import java.util.Arrays;

public class Activity2 {
	
	public static void main(String[] args) 
	{
		//Initializing array
		int numarray1[]= {10,77,10,54,-11,10};

		//Displaying the array values
		System.out.println("Original array "+ Arrays.toString(numarray1));
		
	//defining constraints
		int searchfor=10;
		int checkval= 30;
		
		//Print the result
		System.out.println("The Result is "+ result(numarray1,searchfor,checkval));
	 
	}
	
		public static boolean result(int[]numbers,int searchfor, int checkval)
		{
			int sum=0;
		
				for (int i=0;i<=numbers.length-1;i++) 
		{
			int j=numbers[i];
			//If value=10
			if (j==searchfor)
			//add them
			sum+=j;
		
		if (sum>checkval)
		{
			break;
		}
		
		
	}
		//Return true if condition satisfies
		  return sum == checkval;
		}
}

