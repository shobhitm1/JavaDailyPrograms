package PackageOfRiya;

public class MissingNumberArray {

	public static void main(String[] args) {
		int[] arr = {1,2,4,5,6};
		int n =6 ;
		int expectedsum = n * (n+1)/2;
		
		int actualsum =0;
		for(int i=0; i<arr.length;i++) {
			actualsum += arr[i];
		}
		
		int missingnumber = expectedsum-actualsum;
		System.out.println(missingnumber);

}
}
