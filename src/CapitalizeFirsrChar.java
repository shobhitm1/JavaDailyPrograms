
public class CapitalizeFirsrChar {

	public static void main(String[] args) {
			String str="Lary is a good Girl";
			System.out.println("Non Capitalised word is:-" + str);
			String[] arr=str.split(" ");
			StringBuilder finals = new StringBuilder();
			for(String s:arr) {
				if(!s.isEmpty()) {
					String newString=s.substring(0,1).toUpperCase()+s.substring(1);
					finals.append(newString).append(" ");
				}
			}
			System.out.println("Capitalised word is:-" + finals);
			
	}

}
