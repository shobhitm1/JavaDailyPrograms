
public class StringMoveZeroes {

	public static void main(String[] args) {
        String str = "32400121200";
        
        //Character[] ch = new Character[str.length()];
		StringBuilder sb = new StringBuilder();
        int count=0;
        for(char c:str.toCharArray()) {
        	if(c!='0') {
        		sb.append(c);
        	}
        	else {
        		count++;	
        	}
        }
        
        while(count>0) {
        	sb.append('0');
        	count--;
        }
        System.out.println(sb.toString()); // Output: 32412120000

		
	}

}
