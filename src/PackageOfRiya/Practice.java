package PackageOfRiya;

public class Practice {

	public static void main(String[] args) {
		String str = "Riya";
		char[] ch =str.toCharArray();
		String empty ="";
		for(int i =str.length()-1;i>=0;i--) {
		 empty = empty + str.charAt(i);
			
		}
		System.out.print(empty);

	}
}

