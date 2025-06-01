
public class StringMoveAZeroesPart2 {

	public static void main(String[] args) {

		
        String str = "32400121200";
        StringBuilder sb = new StringBuilder();
        int count=0;
        for(char c:str.toCharArray()) {
        	if(c=='0') {
        		sb.append(c);
        	}
        	
        }
        
        for(char c:str.toCharArray()) {
        	   if (c != '0') {
                   sb.append(c);
               }
        	
        }
        System.out.println(sb.toString());  // Output: 00003241212

	}

}
