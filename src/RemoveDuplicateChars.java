import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateChars {

	public static void main(String[] args) {
		String str="Shobhit Maheshwari";
		Set<Character> chashset = new LinkedHashSet<>();
		for(char c:str.toCharArray()) {
			if(!chashset.contains(c)) {
				chashset.add(c);
			}
		}
		
		System.out.println(chashset);
        StringBuilder result = new StringBuilder();

		for(char c:chashset) {
			result.append(c);
		}
		System.out.println(result.toString());
	}

}
