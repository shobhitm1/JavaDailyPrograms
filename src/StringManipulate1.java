
public class StringManipulate1 {

	public static void main(String[] args) {
		
		//Java program to gives Output: a2b2c3d2
		//for the Input String Str = “aabbcccdd”
		
		//"aabbcccd" to "aa2bb2ccc3d1"

		String str="aabbba";
		
		StringBuilder sb = new StringBuilder();
		
		int count=1;
		
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
