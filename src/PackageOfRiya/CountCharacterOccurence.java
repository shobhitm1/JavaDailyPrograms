package PackageOfRiya;

import java.util.HashMap;

public class CountCharacterOccurence {

	public static void main(String[] args) {
		String  str= "Guddu";
		HashMap<Character, Integer>	map = new HashMap<>();
		for (int i = 0 ; i<str.length();i++) {
			char ch = str.charAt(i);
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
			}
			else {
				map.put(ch, 1);
			}
		}
			for(char key : map.keySet()){
				System.out.println(key + "=" + map.get(key));
			}
	}

}
