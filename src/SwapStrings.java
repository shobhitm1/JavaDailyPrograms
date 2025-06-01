
public class SwapStrings {

	public static void main(String[] args) {
		//Use third variable
		String str="Shobhit";
		String str1="Riya";
		String temp="";
		
		temp=str;
		str=str1;
		str1=temp;
		System.out.println(str);
		System.out.println(str1);
		
		
		//Without using third variable
		String A="Shobhit";
		String B="Riya";
		
		A=A+B;
		System.out.println(A.length());
		System.out.println(B.length());
		B=A.substring(0,A.length()-B.length());
		A=(A.substring(B.length()));
		
		System.out.println(A+" "+A.length());
		System.out.println(B+" "+B.length());
	}

}
