
public class StringManipulate4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Riya Sinha";
		
		String[] s=str.split(" ");
		StringBuilder result = new StringBuilder();
		for(String word:s) {
			StringBuilder sb = new StringBuilder(word).reverse();
			//sb.append(" ");
			result.append(sb).append(" ");
		}
		
		String reversed=result.toString().trim();
	      StringBuilder finalresult = new StringBuilder();

		for(int i=0;i<reversed.length();i++) {
			char c=reversed.charAt(i);
			if(i%2==0) {
				finalresult.append(Character.toUpperCase(c));
			}
			else {
				finalresult.append(Character.toLowerCase(c));
			}
		}
			System.out.println(finalresult.toString());
	}

}
