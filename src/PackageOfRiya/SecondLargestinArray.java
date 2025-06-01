package PackageOfRiya;

public class SecondLargestinArray {

	public static void main(String[] args) {
	    int[] arr = {12, 25, 7, 4, 9, 1, 18};
	    int max = arr[0];//12
	    int secondmax = Integer.MIN_VALUE;
	    
	    for(int i =1; i<arr.length;i++) {
	    	if(arr[i]>max) {
	    	secondmax =max;
	    		max=arr[i];
	    	}
	    	else if (arr[i]>secondmax) {
	    		secondmax =arr[i];
	    		
	    }
	    

	}
	    
	    System.out.println(max);

	}
}
