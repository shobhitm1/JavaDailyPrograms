import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {
	public static void main(String[] args) {
	String input="abbasdsdddasdpabcde";
	int str=checkSubString(input);
	System.out.println(str);
	}
	private static int checkSubString(String input) {
		int start=0,end=0,maxLen=0;
		Set<Character> setc = new HashSet<Character>();
		while(end<input.length()) {
			char currentC = input.charAt(end);
			if(!setc.contains(currentC)) {
				setc.add(currentC);
				maxLen=Math.max(maxLen, end-start+1);
				end++;
			}
			else {
				setc.remove(input.charAt(start));
				start++;
			}	
			System.out.println(input.substring(start,start+maxLen));
			System.out.println(maxLen);
		}
		System.out.println(input.substring(start,start+maxLen));
		System.out.println(maxLen);
		return maxLen;
	}

}
