package PackageOfRiya;

public class Palindromecode {

	public static void main(String[] args) {
		String str="madam";
		String emp="";
		char[] chr=str.toCharArray();
		
	//System.out.println(chr[0]);
		for(int i=str.length()-1;i>=0;i--) {
			emp=emp+str.charAt(i);
			
		}
		
		System.out.println(emp);
		if(emp.equals(str)) {
			System.out.println("its a palindrome");
		}
		else {
			System.out.println("its not a palindrome");
		}
	}

}
