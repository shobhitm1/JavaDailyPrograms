
public class StringBuilderUse {

	public static void main(String[] args) {

		
        String str = "aBACbcEDed";
        StringBuilder sb= new StringBuilder();
        StringBuilder sb1= new StringBuilder();
        
        	for(char c:str.toCharArray()){
        		if(Character.isLowerCase(c)) {
        			sb.append(c);
        		}
        		else {
        			sb1.append(c);
        		}
        		
        	}
        	System.out.println(sb.toString());
        	System.out.println(sb1.toString());
	}

}
