package PackageOfRiya;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class interviewListStreams {

	public static void main(String[] args) {
     List<String> names = List.of("Riya","Gautam","java","test","automation");
     List<String> filtername = names.stream().filter(name-> name.startsWith("R")).collect(Collectors.toList());
     System.out.println("filter name" + filtername);
     
     
     
    		 
	}
	
	

}
