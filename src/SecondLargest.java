
public class SecondLargest {
//Find secondLargest in Array without sorting
	public static void main(String[] args) {
		int[] nums= {10,5,8,9,11,22,10,6};
		int largest=Integer.MIN_VALUE;
		int secondLargest=Integer.MIN_VALUE;
		for(int num:nums) {
			if(num>largest) {
				secondLargest=largest;
				largest=num;
			}else if(num<largest && num>secondLargest) {
				secondLargest=num;
			}
		}
		System.out.println("Second Largest number is:-" + secondLargest);		
	}

}
