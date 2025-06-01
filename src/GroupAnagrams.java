import java.util.*;
import java.util.Map.Entry;
public class GroupAnagrams {

	public static void main(String[] args) {
			
		
				//input : str[] = ["eat", "tea","tan", "ate", "nat", "bat"]
				 
				//output: [["bat"],["nat,"tan"], ["ate", "eat", "tea"]]
				 
		
			String[] arr = {"eat", "tea","tan", "ate", "nat", "bat"};
				
				Map<String,List<String>> hashmap = new HashMap<>();
				
				for(String word:arr) {
						char[] ch =word.toCharArray();
						Arrays.sort(ch);
						String sortWord = new String(ch);
						
						if(!hashmap.containsKey(sortWord)) {
							hashmap.put(sortWord, new LinkedList<>());
						}	
			
							hashmap.get(sortWord).add(word);
							
							//hashmap.computeIfAbsent(sortWord, k->new LinkedList<>()).add(word);		
					
				}
				
				System.out.println(new LinkedList<>(hashmap.values()));
				
				for(Map.Entry<String, List<String>> entry : hashmap.entrySet()) {
					System.out.println(entry.getValue());
				}		
	}

}
