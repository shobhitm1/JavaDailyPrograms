
public class groupRepeatingCharsRevise {

	public static void main(String[] args) {
		String str="aaabbccdccdaaayttummmmmmmmmmmy";

		if(str.isEmpty()) {
			System.out.println("String is empty");
		}
		
		int maxi=0;
		StringBuilder sb = new StringBuilder();
		int count=1;
		for(int i=1;i<str.length();i++) {
			if(str.charAt(i)==str.charAt(i-1)) {
				sb.append(str.charAt(i));
			}
			else {
				maxi=Math.max(maxi, sb.length());
                System.out.println("Group " + count + ": " + sb);
				count++;
				sb.setLength(0);
				sb.append(str.charAt(i));
			}
		}
		
		// Important fix: process the last group
		maxi = Math.max(maxi, sb.length());
		System.out.println("Group " + count + ": " + sb);
        System.out.println("MaxImum length is:-" + maxi);
	}
}