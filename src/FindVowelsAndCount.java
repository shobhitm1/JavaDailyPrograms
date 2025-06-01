import java.util.HashMap;

public class FindVowelsAndCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str= {"Apple","Guavava","Pears"};
		HashMap<Character,Integer> hashmap = new HashMap<>();
		
		for(String word:str) {
				for(char c:word.toLowerCase().toCharArray()) {
					if(checkVowel(c)) {
						hashmap.put(c, hashmap.getOrDefault(c, 0)+1);
					}
					
				}
		}
		
		System.out.println("Vowel counts: " + hashmap);
	}
	
	public static Boolean checkVowel(char c) {
		return "aeiou".indexOf(c)!=-1;
	}
}
