package PackageOfRiya;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstRepeatedCharacterInString {

	public static void main(String[] args) {

		String str = "abcabccddexy";
		 
		LinkedHashMap<Character , Integer> countmap = new LinkedHashMap<>();
		for ( int i =0 ; i< str.length(); i++) {
			char ch = str.charAt(i);
			if(countmap.containsKey(ch)) {
			int currentcount =	countmap.get(ch);
			countmap.put(ch, currentcount+1);
			}
			else {
				countmap.put(ch, 1);
			}
			
		}
		
		for(Map.Entry<Character, Integer> map :countmap.entrySet()) {
			if(map.getValue()==1) {
				System.out.println(map.getKey());
				break;
			}
			
			
		}
		
	}

} 
