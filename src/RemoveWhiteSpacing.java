
public class RemoveWhiteSpacing {

	public static void main(String[] args) {
		String str="hello ajasdsd asds,	?";
		String strRev=str.replaceAll("\\s","");
		System.out.print(strRev);
	}

}
