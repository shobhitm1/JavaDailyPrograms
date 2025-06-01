
public class GroupRepeatingCharsPractice {

	public static void main(String[] args) {
		String str="aaabbccdccdaaayttummmmmmmmmmmy";
		int count=1;
		for(int i=1;i<str.length();i++) {
			if(str.charAt(i)==str.charAt(i-1)){
				count++;
			}
			else {
				System.out.println(str.charAt(i-1)+"->"+count);
				count=1;
			}
		}
		
		System.out.println(str.charAt(str.length()-1)+"->"+count);
	
	
		//-------------------------------------------------
		StringBuilder sb = new StringBuilder();
		
		for(int i=1;i<str.length();i++) {
			if(str.charAt(i)==str.charAt(i-1)){
				count++;
			}
			else {
				sb.append(str.charAt(i-1)).append(count);
				count=1;
			}
		}
		sb.append(str.charAt(str.length() - 1)).append(count);

		System.out.println(sb.toString());
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
