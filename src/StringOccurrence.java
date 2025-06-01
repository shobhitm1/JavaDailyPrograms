
public class StringOccurrence {

	public static void main(String[] args) {
		
		String s ="Hello,World! World!";
		String sub="World";
		System.out.println(countOccurence(s,sub));
	}
	
	public static int countOccurence(String s, String sub) {
		int index=0;
		int count=0;
		
		//System.out.println(index2);
		while((index=s.indexOf(sub,index))!=-1) {
		count++;
		index=index+sub.length();
		}
	return count;
	}

}
