/* Name: TwinChecker.java
 * Description: checks if the letters between two words are the same. If the letters are the same, the words are twins
 */

import java.util.Scanner;

//class
public class TwinChecker {

	public static void main(String[] args) {
		
		Scanner inp = new Scanner(System.in);
		
		//prompt user
		System.out.println("Type the first word");
		
		//first input
		String a = inp.nextLine();
		
		//prompt user
		System.out.println("Type the second word");
		
		//second input
		String b = inp.nextLine();
		
		int counter = 0;//counts the number of same letters
		
		//loop to check the number of same letters/characters
		for (int i = 0; i < a.length(); i++) {
			
			for (int n = 0; n < b.length(); n++) {
			
				if(a.charAt(i) == b.charAt(n)) {
					
					counter++;
				}
			}
			
		}
		
		//prints the result
		if (counter == a.length())
			System.out.print("The words are twins");
		
		else
			System.out.print("The words are not twins");


	}//main method

}//class
