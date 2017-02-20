/**
 * @author Juan Ramirez
 * @version 0.1
 * 
 * COP 3259
 * 
 * Create a method max that takes an array, determines the biggest value and returns that value. 
 */

import java.util.Arrays;

public class Assignment19_5 {
	
	public static <E extends Comparable<E>> E max(E[] list){ // Return Generic type E Element. Page 745
		E max = list[0]; //Set the first value of max to the first item on the list. max of type E
        for (int i = 1; i < list.length; i++) { // For loop to compare values.
            if (list[i].compareTo(max) > 0) // If statement using the compareTo to see if value is higher. 
            {
                max = list[i]; // if true, set the value to max. 
            }

        }
        return max; // Return the value of max
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer[] numberInt = {1, 1, 2, 3, 5, 4 , 3, 7}; //Creates array of integers
        System.out.println(Arrays.toString(numberInt) + " max is: " + max(numberInt)); // Call max method and send array of Integers.
        System.out.println("");
        Double[] numberDouble = {1.78, 1.5, 1.6, 1.77 ,1.7}; //Creates array of Doubles
        System.out.println(Arrays.toString(numberDouble) + " max is: " + max(numberDouble)); // Call max method and send array of Doubles.
        System.out.println("");
        String[] words = {"This", "class", "is", "the","best."}; //Creates array of Strings
        System.out.println(Arrays.toString(words) + " max is: " + max(words)); // Call max method and send array of strings.
		
		System.out.println("\n\nProgram Ended");

	}

}
