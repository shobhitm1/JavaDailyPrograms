import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class CharOccurence {

	public static void main(String[] args) {
		
		String str="Automatetheworld";
		HashMap<Character,Integer> charCount=new HashMap<>(); 
		
		char[] chr=str.toCharArray();
		for(char c:chr) {
				charCount.put(c,charCount.getOrDefault(c,0)+1);
		}
			
			for(Map.Entry<Character, Integer> entry:charCount.entrySet()) {
				System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}
}
