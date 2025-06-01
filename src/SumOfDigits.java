import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		int sum=0;
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number (int, float, double, etc.): ");
		String input=sc.next();
		Boolean isValid=false;
		for(int i=0;i<input.length();i++) {
			char ch=input.charAt(i);
			if(Character.isDigit(ch)) {
					sum=sum+Character.getNumericValue(ch);
					isValid=true;
			}
		}
		if(isValid) {
			System.out.println("Digits are proper and the sum is:>" + sum);
		}
		else {
			System.out.println("Digits are not proper");
		}
		sc.close();
	}

}
