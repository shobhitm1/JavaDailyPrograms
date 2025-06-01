import java.util.Arrays;

public class AnagramString {

	public static void main(String[] args) {
		
		String s1="listen";
		String s2="sident";
		
		Boolean result=isAnagram(s1,s2);
		
		if(result) {
			System.out.println("Strings are anagrams!");
		}
		else {
			System.out.println("Strings are not anagrams!");
		}
	
	}

	private static Boolean isAnagram(String s1, String s2) {
		
		if(s1.length()!=s2.length()) {
			return false;
		}
		char[] strng1=s1.toCharArray();
		char[] strng2=s2.toCharArray();
		
		Arrays.sort(strng1);
		Arrays.sort(strng2);
		
		
		return Arrays.equals(strng1, strng2);
	}

}
