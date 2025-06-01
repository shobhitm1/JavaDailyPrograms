package PackageOfRiya;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashmapCreation {

	public static void main(String[] args) {
   List<String> names = List.of("Riya","test","gautam","automation");
   Map<String,String> surname = new HashMap<>();
   for(String name: names) {
	   surname.put(name,"anysurname");
   }
   for( Map.Entry<String, String> entry :surname.entrySet()) {
	   System.out.println("first name:" + entry.getKey() + "Surname:" + entry.getValue());
   }
		
	}

}	
