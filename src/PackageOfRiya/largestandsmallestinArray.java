package PackageOfRiya;

public class largestandsmallestinArray {

	public static void main(String[] args) {
    int[] arr = {12, 4, 7, 25, 9, 1, 18};
    int min = arr[0];//12
    int max= arr[0];//12
    for(int i=1;i<arr.length;i++) {
    	if(arr[i]<min) {
    		min = arr[i];
    		
    	}
    	else if(arr[i]>max){
    		max= arr[i];
    		
    	}
    }
    
    System.out.println(min);
    System.out.println(max);
	}

}
