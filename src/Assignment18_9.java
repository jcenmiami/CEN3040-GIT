import java.util.Scanner;

/**
 * (Print the characters in a string reversely) 
 * Write a recursive method that displays a 
 * string reversely on the console. 
 * 
 * @author Juan Ramirez
 * @version 0.1
 * 
 *  COP 3259
 */
public class Assignment18_9 {
	
	public static void reverseDisplay(String value){
		
		if (value.length() == 1)
		{
			System.out.print(value);
		}
		else
		{
			reverseDisplay(value.substring(1));	
			System.out.print(value.substring(0,1));
		}
		
		
		
	}

	
	// Main Method
	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		System.out.print("Please enter a string: ");
		String myString = userInput.nextLine();
		System.out.println("The String is: " + myString);
		System.out.print("In reverse it's: ");
		reverseDisplay(myString);
		userInput.close();
	}

}
