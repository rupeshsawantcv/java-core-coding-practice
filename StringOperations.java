package forLearning;

import java.util.Scanner;

public class StringOperations {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String str = sc.nextLine();
		System.out.println("Reverse Using Normal Method: " + StringManipulationsMethods.reverseUsingNormal(str));
		System.out.println("Reverse Using StringBuffer Method: " + StringManipulationsMethods.reverseUsingSB(str));
		// for palindrome
		if (StringManipulationsMethods.isPalindrome(str)) {
			System.out.println(str + " String is Palindrome");
		} else {
			System.out.println(str + " String is not Palindrome");
		}

		StringManipulationsMethods.countVowelsAndConsonants(str);
		System.out.println("After removing: " + StringManipulationsMethods.removeDuplicate(str));

		System.out.println("Count Occurence of each charachter");
		StringManipulationsMethods.countOccurrenceChar(str);
		
		StringManipulationsMethods.firstNonReaptingChar(str);
		StringManipulationsMethods.firstReaptingChar(str);
		StringManipulationsMethods.reverseWordsInStrng(str);
		StringManipulationsMethods.findDupicate(str);

	}

}
