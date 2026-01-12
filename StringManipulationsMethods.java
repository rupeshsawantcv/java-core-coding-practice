package forLearning;

//in this class oS means Original String(oS==originalString)
//in this class unq means Original String(unq==Unique)

public class StringManipulationsMethods {

	public static String reverseUsingSB(String str) {
		StringBuffer sb = new StringBuffer();

		for (char add : str.toCharArray()) {
			sb.append(add);
		}
		return sb.reverse().toString();
	}

	public static String reverseUsingNormal(String str) {
		String rev = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			rev += str.charAt(i);
		}
		return rev;
	}

	public static Boolean isPalindrome(String str) {

		String originalString = str.toLowerCase();
		String reverseString = StringManipulationsMethods.reverseUsingNormal(originalString);
		if (originalString.equals(reverseString)) {
			return true;
		}
		return false;

	}

	public static void countVowelsAndConsonants(String str) {
		String oS = str.toLowerCase();
		int vowwelCount = 0;
		int consonants = 0;
		for (int i = 0; i < oS.length(); i++) {
			char ch = oS.charAt(i);
			if (ch == 'a' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'e') {
				vowwelCount++;
			} else {
				consonants++;
			}
		}

		System.out.println("The Count of Vowels: " + vowwelCount);
		System.out.println("The Count of Consonants: " + consonants);

	}

	public static String removeDuplicate(String str) {
		String oS = str;

		String unq = "";
		for (int i = 0; i < oS.length(); i++) {
			char ch = oS.charAt(i);
			if (unq.indexOf(ch) == -1) {
				unq += ch;
			}
		}
		return unq.toString();
	}

	public static void countOccurrenceChar(String str) {
		String unq = StringManipulationsMethods.removeDuplicate(str);
		for (int i = 0; i < unq.length(); i++) {
			// rupesh
			char ch = unq.charAt(i);
			int count = 0;
			for (int j = 0; j < str.length(); j++) {
				if (ch == str.charAt(j)) {
					count++;
				}

			}

			System.out.println(ch + " = " + count);
		}
	}

	public static void firstNonReaptingChar(String str) {
		String oS = StringManipulationsMethods.removeDuplicate(str);
		for (int i = 0; i < oS.length(); i++) {
			char ch = oS.charAt(i);
			int count = 0;

			for (int j = 0; j < str.length(); j++) {
				if (ch == str.charAt(j)) {
					count++;
				}

			}
			if (count == 1) {
				System.out.println("First non Repeating character: "+ch);
				break;
			}

		}

	}
	public static void firstReaptingChar(String str) {
		String oS = StringManipulationsMethods.removeDuplicate(str);
		for (int i = 0; i < oS.length(); i++) {
			char ch = oS.charAt(i);
			int count = 0;

			for (int j = 0; j < str.length(); j++) {
				if (ch == str.charAt(j)) {
					count++;
				}

			}
			if (count > 1) {
				System.out.println("First Repeating character: "+ch);
				break;
			}

		}

	}
	
	public static void reverseWordsInStrng(String str) {
		String[] array = str.split(" ");
		String result = " ";
		for(int i = array.length-1;i>=0;i--) {
			result += array[i]+" ";
		}
		
		result.trim();
		System.out.println("Reverse words in a String: "+result);
	}
	
	public static void findDupicate(String str) {
		for(int i  = 0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(str.indexOf(ch)!=str.lastIndexOf(ch) && i==str.indexOf(ch)) {
				System.out.println(ch+" ");
			}
		}
	}
}
