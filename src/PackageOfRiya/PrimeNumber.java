package PackageOfRiya;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		System.out.println("Enter a number");
		int input =scanner.nextInt();
		if(isPrime(input)) {
			System.out.println("is a prime number");
		}
		
		else {
			System.out.println("is not a prime number");
		}


	}



public static boolean isPrime(int num) {
for (int i = 2; i <= num / 2; i++) {
//try each number by using %
if (num % i == 0) {
return false;
}
} return true;
}
}