package forLearning;

import java.util.Scanner;

public class NumbersOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		NumbersManipulationsMethods.findOddOrEven(num);
		NumbersManipulationsMethods.isPrime(num);
		for(int i = 0;i<=num;i++) {
			if(NumbersManipulationsMethods.primeUpto(i)) {
				System.out.print(i+" ");
			}
		}
		
		NumbersManipulationsMethods.findFactorial(num);
		NumbersManipulationsMethods.reverseNumber(num);
		NumbersManipulationsMethods.countDigits(num);
		NumbersManipulationsMethods.sumOfDigits(num);
		NumbersManipulationsMethods.isPalindrome(num);
		NumbersManipulationsMethods.isArmstrong(num);
		
		NumbersManipulationsMethods.printFabonacci(num);
	}

}
