package PackageOfRiya;

import java.util.Arrays;
import java.util.List;

public class searchforelement {

	public static void main(String[] args) {
		Integer[] arr = {5, 2, 9, 1, 6, 3}; 
		for(int i=0; i<arr.length-1;i++) {
			for(int j=0; j<arr.length-1-i;j++) {
				if(arr[j]> arr[j+1]) {
					int temp =  arr[j];
					arr[j] =arr[j+1];
					arr[j+1] = temp;
			}
		}

	

	}
		//System.out.println(Arrays.toString(arr));
		List<Integer> list = Arrays.asList(arr);
		System.out.println(list);
		System.out.println( list.get(4));
		//[1, 2, 3, 5, 6, 9]
		

}
}
