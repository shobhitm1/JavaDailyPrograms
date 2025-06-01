package PackageOfRiya;

import java.util.HashSet;
import java.util.Set;

public class CommonElementBetweenTwoArrays {

	public static void main(String[] args) {
     int[] arr1 = {1,6,8,9};
     int[] arr2 = {2,6,7,9};
     
     Set<Integer> set1 = new HashSet();
     for(int num : arr1) {
    	 set1.add(num);
     }
     
     Set<Integer> set2 = new HashSet();
     for(int num : arr2) {
    	 if(set1.contains(num)) {
    		 set2.add(num);
    	 }
     }
     
     System.out.println(set2);
	}

}
