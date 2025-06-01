package PackageOfRiya;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateFromArray {

	public static void main(String[] args) {
	 Integer[] arr = {1,1,2};
	List<Integer> converted = Arrays.asList(arr);
	//System.out.println(converted);
	//int num =converted.size();
	HashSet<Integer> unique = new HashSet<Integer>();
	List<Integer> duplicate = new LinkedList<>();
	for(Integer i : converted) {
		if(unique.contains(i)) {
			duplicate.add(i);	
		}
		else {
			unique.add(i);
		}
	}
	
	System.out.println(duplicate);
	
	
	 
}
}
