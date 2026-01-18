package forLearning;

public class NumbersManipulationsMethods {

	public static void findOddOrEven(int num) {
		if (num % 2 == 0) {
			System.out.println(num + " The Number is Even");
		} else {
			System.out.println(num + " The Number is  NOT Even");
		}
	}

	public static void isPrime(int num) {
		if (num <= 1) {
			System.out.println(num + " is NOT PRIME");
			return;
		}
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				System.out.println(num + " is NOT PRIME");
				return;
			}
		}
		System.out.println(num + " is PRIME NUMBER");

	}

	public static boolean primeUpto(int num) {
		if (num <= 1)
			return false;

		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;

	}

	public static void findFactorial(int num) {
		int fact = 1;
		for (int i = num; i >= 1; i--) {
			fact *= i;
		}

		System.out.println(fact);
	}

	// 1234
	public static void reverseNumber(int num) {
		int rev = 0;
		while (num > 0) {
			int digit = num % 10;
			rev = rev * 10 + digit;
			num = num / 10;
		}

		System.out.println("The reverse number is: " + rev);
	}

	public static void countDigits(int num) {
		int onum = num;
		if (num == 0) {
			System.out.println("The Count is 1");
			return;
		}
		num = Math.abs(num);
		int count = 0;
		while (num > 0) {
			count++;
			num = num / 10;

		}

		System.out.println("The Digits count is: " + count + " for " + onum);
	}

	public static void sumOfDigits(int num) {
		int onum = num;
		if (num <= 0) {
			System.out.println("The Number is less thane or equals to ZERO!!");
			return;
		}

		int sum = 0;
		while (num > 0) {
			int digit = num % 10;
			sum = sum + digit;
			num = num / 10;

		}

		System.out.println("The sum of digits is: " + sum + " for " + onum);
	}

	public static void isPalindrome(int num) {

		int onum = num;
		int rev = 0;
		while (num > 0) {
			int digits = num % 10;
			rev = rev * 10 + digits;
			num = num / 10;
		}

		if (onum == rev) {
			System.out.println("The number " + onum + " is Palindrome");
		} else {
			System.out.println("The number " + onum + " is  not Palindrome");
		}

	}

	public static void isArmstrong(int num) {
		int onum = num;
		int digit = String.valueOf(num).length();
		int sum = 0;
		while (num > 0) {
			int lastDigit = num % 10;
			sum += Math.pow(lastDigit, digit);
			num = num / 10;
		}

		if (onum == sum) {
			System.out.println("The Number is Armstrong becouse of this: " + onum + " == " + sum);
		} else {
			System.out.println("The Number is not Armstrong becouse of this: " + onum + " != " + sum);
		}
	}

	public static void printFabonacci(int num) {
		int a = 0, b = 1;
		for (int i = 1; i <= num; i++) {
			System.out.print(a);
			if (i != num) {
				System.out.print(", ");
			}
			int next = a + b;
			a = b;
			b = next;
		}
	}

}
