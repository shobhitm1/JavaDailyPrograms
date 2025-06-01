package PackageOfRiya;

import java.util.Arrays;

public class SortingofArray {

	public static void main(String[] args) {
    int[] arr = {2,9,1,0,6,3};
//    int arrlength = arr.length;
//   Arrays.sort(arr);
//   System.out.println(Arrays.toString(arr));
//    
    
		for (int num : arr) {
            System.out.print(num + " ");
        }
		
		for(int i=0; i<arr.length-1;i++) {
			for(int j =0;j <arr.length-1-i;i++) {
				if(arr[j]> arr[j+1]) {
					int temp =  arr[j];
					arr[j] =arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
    
	}

}
