package PackageOfRiya;

public class Interviewjava {

	public static void main(String[] args) {

		      String str = "Riya Sinha";
		      //aYiR aHnIs
		      String[] words = str.split(" ");
		      StringBuilder result = new StringBuilder();
		      for(String word: words){
		        String reverse = new StringBuilder(word).reverse().toString();
		        result.append(reverse).append(" ");
		        
		      }
		      
		      String reversal = result.toString().trim();
		      
		      StringBuilder finalresult = new StringBuilder();
		      for(int i =0; i< reversal.length();i++){
		        char ch=  reversal.charAt(i);
		        if(ch==' '){
		        	finalresult.append(' ');
		            continue;
		        }
		        if(i%2==0){
		        	finalresult.append(Character.toUpperCase(ch));
		        }
		        else{
		        	finalresult.append(Character.toLowerCase(ch));
		        }
		        
		      }
		     
		      System.out.println(finalresult.toString());  
		      
		  }
		
	}


