
public class ArmStrongNumber {

	public static void main(String[] args) {

		//An Armstrong number (also called a narcissistic number or pluperfect number) is 
		//a number that is equal to the sum of its own digits raised to the power of the number of digits
		int num=153;
		int originalNum = num;
		double result=0;
		int n=getNumber(num);
		while(num!=0) {
			int digit=num%10;
			result=result+Math.pow(digit,n);
			num=num/10;
		}
		if(result==originalNum) {
			System.out.println("Number is armstrong");		}
		else {
			System.out.println("Number is not armstrong");
		}
		
	}
	private static int getNumber(int num) {
		int count=0;
		while(num!=0) {
			count++;
			num=num/10;
		}
	return count;		
	}

}
