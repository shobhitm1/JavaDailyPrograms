package PackageOfRiya;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesArraylist {

	public static void main(String[] args) {
		int[] arr = {1,2,2,3,4,5,5};
		Set<Integer> uniqueele = new HashSet<Integer>();
		List<Integer> duplicateele = new ArrayList<Integer>();
		for(int i : arr) {
			if(uniqueele.contains(i)) {
				duplicateele.add(i);
			}
			
			else 
			{
				uniqueele.add(i);
			}
				
		}
		System.out.println(uniqueele);
		
	}

}
