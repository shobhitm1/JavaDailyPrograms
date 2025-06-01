
public class StringMani2 {

	public static void main(String[] args) {

		String input="R1i2ya T2e3st4er";
		//o/p : Tester Riya 12+234=256
		
		String[] arr=input.split(" ");
		
		String part1=arr[0];
		String part2=arr[1];
		
		StringBuilder sb = new StringBuilder();
		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb3 = new StringBuilder();
		StringBuilder sb4 = new StringBuilder();
		
		for(char c:part1.toCharArray()) {
			if(Character.isDigit(c)) {
				sb.append(c);
			}
			else {
				sb1.append(c);
			}
		}
		
		
		for(char c:part2.toCharArray()) {
			if(Character.isDigit(c)) {
				sb3.append(c);
			}
			else {
				sb4.append(c);
			}
		}
		
		int s1=Integer.parseInt(sb.toString());
		int s2=Integer.parseInt(sb3.toString());
		int s3=s1+s2;
		
		String output = sb4+" "+sb1+" "+sb+"+"+sb3+"="+s3;
		System.out.println(output);
		
	}

}
