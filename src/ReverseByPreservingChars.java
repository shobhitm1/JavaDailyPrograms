
public class ReverseByPreservingChars {

	public static void main(String[] args) {
		String str="srwtet#* kopp";
		
		String reversed=reverseString(str);
        System.out.println("Reversed: " + reversed);

	}

	private static String reverseString(String str) {
		char[] chr=str.toCharArray();
		
		int left=0, right=chr.length-1;
		while(left<right) {
			if(!Character.isAlphabetic(chr[left])) {
				left++;
			}
			else if(!Character.isAlphabetic(chr[right])) {
				right--;
			}
			else {
				char temp=chr[left];
				chr[left]=chr[right];
				chr[right]=temp;
				left++;
				right--;
			}
		}
		return new String(chr);
	}

}
