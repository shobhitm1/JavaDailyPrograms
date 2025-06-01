import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
		int num[]= {1,2,3,21,5,7,5,6,4};
		int target=9;
		//.args.[] result=TwoSums(num,target);
		//System.out.println(Arrays.toString(result));
		
		List<int[]> result = TwoSums(num, target);
		if(!result.isEmpty()) {
			for(int[] rs:result) {
                System.out.println(Arrays.toString(rs));	    
			}
			}
		else {
			System.out.println("No Pairs found");
		}
		
	}
	
	public static List<int[]> TwoSums(int[] num,int target){
		Map<Integer,Integer> mapg= new HashMap<Integer,Integer>();
		List<int[]> listg= new ArrayList<int[]>();
		for(int i=0;i<num.length;i++) {
		int complement=target-num[i];
		if(mapg.containsKey(complement)) {
			listg.add(new int[] {mapg.get(complement),i});
		}
		mapg.put(num[i], i);	
		}
		return listg;
	}

}
