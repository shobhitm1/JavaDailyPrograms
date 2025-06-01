
public class StringReverseal {

	public static void main(String[] args) {
		String empty="";
		String str="Shobhit Maheshwari";
		for(int i=str.length()-1;i>=0;i--) {
			empty=empty+str.charAt(i);		
		
		}
		System.out.print(empty);		
	}

}
