
public class PrimeNumber {

	public static void main(String[] args) {
		int num=19;
		Boolean answer=isPrime(num);
		System.out.println(num+"-->is a prime number->"+answer);
		
	}
	private static boolean isPrime(int num) {
		for(int i=2;i<num/2;i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}
}
