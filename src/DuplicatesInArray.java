import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicatesInArray {

	public static void main(String[] args) {
		int[] arr={1,2,2,3,4,4,5,5,6,8,8};
		Set<Integer> dup=findDuplicate(arr);
		System.out.println(dup);
	}
	public static Set<Integer> findDuplicate(int[] arr) {
		List<Integer> dabbaList = new ArrayList<Integer>();
		Set<Integer> show=new HashSet<Integer>();
		for(int num:arr) {
			if(show.contains(num)) {
				dabbaList.add(num);
			}else {
				show.add(num);
			}
		}
		return show;
	}
}
