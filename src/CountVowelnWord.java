import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CountVowelnWord {

	public static void main(String[] args) {
		String[] str= {"Apple","Guavav","Pears"};
		
		Map<String,String> mapy = new HashMap<>();
		
		int count=0;
		for(String word:str) {
			Set<Character> sety = new LinkedHashSet<>();
			for(char ch:word.toLowerCase().toCharArray()) {
				if("aeiou".indexOf(ch)!=-1) {
					count++;
					sety.add(ch);
				}
			}
			
			mapy.put(word, count+" "+sety);
			
		}
		
		System.out.println(mapy);
		
		//---------------------------
		Map<String,Set<Character>> hashmap = new HashMap<>();
		
		
		int count1=0;
		for(String word:str) {
			Set<Character> sety = new LinkedHashSet<>();
			for(char ch:word.toLowerCase().toCharArray()) {
				if("aeiou".indexOf(ch)!=-1) {
					count1++;
					sety.add(ch);
				}
			}
			
			hashmap.put(word,sety);
			
		}
		
		System.out.println(hashmap);
		
		
		//------------------------------
		
		
		
		
		
		
		
		
		
		
		
		
		
		}

}
