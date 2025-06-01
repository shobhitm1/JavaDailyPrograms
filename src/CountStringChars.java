import java.util.HashMap;
import java.util.Map;

public class CountStringChars {

	public static void main(String[] args) {

		String str ="Shobhit".toLowerCase();
		Map<Character, Integer> hmap = new HashMap <>();
		for(char s : str.toCharArray()) {
			if(s!= ' ')
			hmap.put(s, hmap.getOrDefault(s, 0)+1);
		}
		for (Map.Entry<Character, Integer> entry : hmap.entrySet()) {
            System.out.println("'" + entry.getKey() + "' : " + entry.getValue());
        }
	}
		
	
		
	}


