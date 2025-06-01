import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FindDuplicatesinString {

	public static void main(String[] args) {

		String str="Smart!";
		
		char[] strp =str.toCharArray();
		Map<Character,Integer> charCount = new HashMap();
		for(char ch:strp) {
			if (ch == ' ') continue; // Ignore spaces
			charCount.put(ch, charCount.getOrDefault(ch,0)+1);
		}
		Boolean isDuplicate=false;
		for(Map.Entry<Character, Integer> mapchar : charCount.entrySet()){
				if(mapchar.getValue()>1) {
			 System.out.println(mapchar.getKey() + " → " + mapchar.getValue() + " times");
			 isDuplicate=true;
		}
		else if(mapchar.getValue()==1){
					System.out.println(mapchar.getKey() + " → " + mapchar.getValue() + " times");
		}
				
		}
		if(!isDuplicate) {
			System.out.println("There are no duplicates!");
		}
		
		
	}

}
