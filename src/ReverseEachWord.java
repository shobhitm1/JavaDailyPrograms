
public class ReverseEachWord {

	public static void main(String[] args) {	
			String str="I am learning java";
			String[] sarray=str.split(" ");
			String result="";
			for(String word:sarray) {
				String reverse= "";
				for(int i=word.length()-1;i>=0;i--) {
					reverse=reverse+word.charAt(i);
				}
				result=result+reverse+" ";
			}
			 System.out.println("Reversed words: " + result.trim());
			 
			 //Second approach -string builder method with better time complexity 
			 
			 StringBuilder result1 = new StringBuilder();
			 for(String wor:sarray) {
				 String reverseWord=new StringBuilder(wor).reverse().toString();
				 result1.append(reverseWord).append(" ");
			 }
	}

}
