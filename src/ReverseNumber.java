
public class ReverseNumber {

	public static void main(String[] args) {

		int num=198;
		int rem=0;
		while(num>0) {
			int digit=num%10;
			rem=rem*10+digit;
			num=num/10;
		}
		
		System.out.println(rem);
	}

}
