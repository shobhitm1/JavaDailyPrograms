
public class ArraySortCheck {

	public static void main(String[] args) {

		int[] arr= {1,2,3,4,5,8};
		
		Boolean sorted=true;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]>arr[i+1]) {
				sorted=false;
				break;	
			}
		}
		System.out.println("Array is sorted :-" + sorted);
		
	}
	
}
