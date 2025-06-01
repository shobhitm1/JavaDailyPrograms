import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FindFirstNonRepititiveChar {

	public static void main(String[] args) {
		
		String str ="Helhlo".toLowerCase();
		 char[] ch=str.toCharArray();
		
		Map<Character,Integer> mapp = new LinkedHashMap<>();
		
		for(char chr: ch) {
			mapp.put(chr, mapp.getOrDefault(chr, 0)+1);
		}
		
		for(Map.Entry<Character,Integer> entry:mapp.entrySet()) {
			if(entry.getValue()==1) {
				System.out.println(entry.getKey());
				break;
			}
		}
	
	
	}

}
