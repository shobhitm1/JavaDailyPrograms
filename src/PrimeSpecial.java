
public class PrimeSpecial {

	public static void main(String[] args) {

		for(int i=2;i<=100;i++) {
			if(isPrime(i)&&!containsDigit(i)) {
				System.out.println(i);
			}
		}
		
	}

	private static boolean isPrime(int num) {
		if(num<=1) {
			return false;
		}
			for(int i=2;i<=Math.sqrt(num);i++)
			{
				if(num%i==0) {
					return false;
				}
		}
		
		return true;
	}

	private static boolean containsDigit(int i) {
			String str=String.valueOf(i);
		return str.contains("3") || str.contains("7");
	}

}
