
public class StringManipulate3 {

	public static void main(String[] args) {
		
		
		
		String input = "R1i2ya T2e3st4er";
		
		
		StringBuilder sb = new StringBuilder();
		StringBuilder expression = new StringBuilder();

		int sum=0;
		
		for(char c:input.toCharArray()) {
			
			if(Character.isDigit(c)) {
				sb.append(c);
			}
			else {
				if(sb.length()>0) {
				int num=Integer.parseInt(sb.toString());
				sum=sum+num;
				expression.append(sum).append("+");
				sb.setLength(0);
			}
		}
		}
		if(sb.length()>0) {
			int num=Integer.parseInt(sb.toString());
			sum=sum+num;
			expression.append(sum).append("+");
		}
		//if(expression.endsWith("+")) {
			//expression=expression.substring(0,expression.length()-1);
	//	}
		
		System.out.print(expression+" = "+sum);
		
	}

}
