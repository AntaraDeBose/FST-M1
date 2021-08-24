package activities;
import java.util.HashSet;

	public class Activity10 {
	    public static void main(String[] args) {
	        HashSet<String> hs = new HashSet<String>();
	        // Adding element to HashSet
	        hs.add("S");
	        hs.add("P");
	        hs.add("B");
	        hs.add("A");
	        hs.add("S");
	        hs.add("Z");
	        
	        //Print HashSet
	        System.out.println("Actual HashSet: " + hs);        
	        //Print size of HashSet
	        System.out.println("Size of HashSet: " + hs.size());
	        
	        //Remove element
	        System.out.println("Removing B from HashSet: " + hs.remove("B"));
	        //Remove element that is not present
	        if(hs.remove("C")) {
	        	System.out.println("C removed from the Set");
	        } else {
	        	System.out.println("C is not present in the Set");
	        }
	        
	        //Search for element
	        System.out.println("Checking if T is present: " + hs.contains("T"));
	        //Print updated HashSet
	        System.out.println("Updated HashSet: " + hs);
	    }
	}

