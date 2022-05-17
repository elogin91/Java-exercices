package prime;

import java.util.Scanner;

public class Prime {

	public static void main(String args[]) {
		Prime number = new Prime();

		if (number.isPrime(dataload())) {
			System.out.println("The number is prime");
		} else {
			System.out.println("The number is not prime");
		}
	}

	private boolean isPrime(int n) {
		boolean numberPrime = true;
		switch (n) {
		case 0:
			numberPrime = false;
			break;
		case 1:
			numberPrime = false;
			break;
		default:
			for (int i = 2; i < n && numberPrime; i++) {
				if (n % i == 0) {
					numberPrime = false;
				}
			}
			
		}
		return numberPrime;
	}

	private static int dataload() {
		// TODO Auto-generated method stub
		Scanner inputData = new Scanner(System.in);
		System.out.println("Enter the number, to check:");
		return (inputData.nextInt());
	}
}
