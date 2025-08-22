package javaProgramsPractice;
import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		long num = sc.nextInt();
		
		boolean isPrime = true;
		
		if(num <= 1) {
			isPrime = false;
		}
		else {
			for(int i = 2; i <= Math.sqrt(num); i++) {
				if(num % i == 0) {
					isPrime = false;
				}
			}
		}
		
		if(isPrime) {
			System.out.println("Number is prime");
		}
		else {
			System.out.println("Number is not prime");
		}
		
		sc.close();
	}
}
