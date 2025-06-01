
public class MoveVowels {

	public static void main(String[] args) {
			String str="Hello Shobhit Maheshwari,How you doing";
			String UpdatedString=StringUpdate(str);
			System.out.println("Updated string is:- "+ UpdatedString);
	}

	public static String StringUpdate(String str) {
		
		StringBuilder vowels = new StringBuilder();
		StringBuilder Constants = new StringBuilder();
		for(char ch:str.toCharArray()) {
			if(isVowel(ch)) {
				vowels.append(ch);
			}else {
				Constants.append(ch);
			}
		}
		return vowels.toString()+Constants.toString();
		
	}

	private static boolean isVowel(char ch) {
		String str="AEIOUaeiou";
		return str.indexOf(ch)!=-1;
	}

}
