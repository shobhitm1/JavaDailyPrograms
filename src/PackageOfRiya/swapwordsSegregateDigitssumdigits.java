package PackageOfRiya;

public class swapwordsSegregateDigitssumdigits {

	public static void main(String[] args) {

        String input = "R12iya T3es4t5er";
        
             String[] words=    input.split(" ");
             
           
             StringBuilder alpha1 = new StringBuilder();
             StringBuilder alpha2 = new StringBuilder();
             StringBuilder digits1 = new StringBuilder();
             StringBuilder digits2 = new StringBuilder();
             
             
             for(char ch : words[0].toCharArray()) {
            	 if(Character.isDigit(ch)) {
            		 digits1.append(ch);
            	 }
            	 else
            	 {
            		 alpha1.append(ch);
            	 }
             }
             
             
             for(char ch : words[1].toCharArray()) {
            	 if(Character.isDigit(ch)) {
            		 digits2.append(ch);
            		 
            	 }
            	 
            	 else {
            		 alpha2.append(ch);
            	 }
             }
             
            String word1= alpha1.toString();
           String word2= alpha2.toString();
           
         int num1=  Integer.parseInt(digits1.toString());
        int num2 =		   Integer.parseInt(digits2.toString());  
        int sum = num1+num2;
        
        System.out.println(word2 + " " + word1 +" "  + " " +sum);
           
           
	}

}
