
public class groupRepeatingChars {

	public static void main(String[] args) {

		String str="aaabbccdccdaaayttummmmmmmmmmmy";
		
		if(str.isEmpty()) {
			System.out.print("Empty string");
			return;
		}
		int count=1;
		StringBuilder sb = new StringBuilder();
		sb.append(str.charAt(0));
		int maxi=0;
		for(int i=1;i<str.length();i++) {
			if(str.charAt(i)==str.charAt(i-1)) {
				sb.append(str.charAt(i));
			}
			else {
				int lengthOfGroup=sb.length();
				maxi=Math.max(maxi, lengthOfGroup);
                System.out.println("Group " + count + ": " + sb);
				count++;
				sb.setLength(0);
				sb.append(str.charAt(i));
			}
		}
		
		// Important fix: process the last group
        int lengthOfLastGroup = sb.length();
        maxi = Math.max(maxi, lengthOfLastGroup);
        System.out.println("Group " + count + ": " + sb);
        System.out.println("MaxImum length is:-" + maxi);
	}

}
