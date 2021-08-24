package activities;

import java.util.Arrays;

		class Activity4 {
		    static void sortasc(int array[]) {
		        int size = array.length, i;
		        
		        for (i = 1; i < size; i++) {
		            int compare = array[i];
		            int j = i - 1;
		            
		            while (j >= 0 && compare < array[j]) {
		                array[j + 1] = array[j];
		                --j;
		            }
		            array[j + 1] = compare;
		        }
		    }
		    
		    public static void main(String args[]) {
		        int[] data = { 12,7,20,32,3 };
		        sortasc(data);
		        System.out.println("Array in Ascending Order: ");
		        System.out.println(Arrays.toString(data));
		    }
		}

	
