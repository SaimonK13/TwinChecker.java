/* Name: TwinChecker.java
 * Description: checks if the letters between two words are the same. If the letters are the same, the words are twins/anagrams
 * Author: Md Raihatul Jannat Saimon
 */

import java.util.Scanner;

//class
public class TwinChecker {

	//main method
	public static void main(String[] args) {
		
		Scanner inp = new Scanner(System.in);
		
		//prompt user
		System.out.println("Type the first word");
		
		//first input
		String a = inp.nextLine();
		String word1 = a.toLowerCase();//converts first input into lower case
		
		//prompt user
		System.out.println("Type the second word");
		
		//second input
		String b = inp.nextLine();
		String word2 = b.toLowerCase();//converts second input into lower case
		
		int counter = 0;//counts the number of same letters
		
		//loop to check the number of same letters/characters
		for (int i = 0; i < word1.length(); i++) {
			
			for (int n = 0; n < word2.length(); n++) {
			
				if (word1.charAt(i) == word2.charAt(n)) {
					
					counter++;
					
					break;
					
				}
			}
			
		}
		
		//prints the result
		if (counter == word2.length() )
			
			System.out.print("The words are twins");
		
		else
			System.out.print("The words are not twins");


	}//main method

}//class
