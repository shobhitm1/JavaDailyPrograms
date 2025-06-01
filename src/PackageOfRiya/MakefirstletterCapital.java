package PackageOfRiya;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Set;

public class MakefirstletterCapital {

	public static void main(String[] args) {
		
		String str= "My name is Riya";
	 String[] arr= str.split(" ");
	StringBuilder build = new StringBuilder();
	 System.out.println(arr);
	 for(String s : arr) {
		String Cap= s.substring(0,1).toUpperCase()+ s.substring(1);
		build.append(Cap).append(" ");
	 }
	 System.out.println(build);
	}

}
