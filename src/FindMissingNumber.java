
public class FindMissingNumber {

	public static void main(String[] args) {
		int[] arr = {1, 2, 4, 5, 6};
		int n =arr.length+1;
		int missing=findMissingNum(arr,n);
		System.out.println(missing);
		
	}
	public static int findMissingNum(int[] arr,int n) {
		int expected=n*(n+1)/2;
		System.out.println(expected);
		int actual=0;
		for(int num:arr) {
			actual=actual+num;
		}
		System.out.println(actual);
		return expected-actual;
	}

}
