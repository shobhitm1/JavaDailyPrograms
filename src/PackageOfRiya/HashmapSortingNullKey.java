package PackageOfRiya;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashmapSortingNullKey {

	public static void main(String[] args) {
	
       HashMap<String ,String> hash = new HashMap<>();
       hash.put("Apple", "boy");
       hash.put("banana", "girl");
       hash.put(null, "value");
       
       String nullkeyvalue = null;
       Map<String,String> ordermap = new LinkedHashMap<>();

       if(hash.containsKey(null)) {
    	   nullkeyvalue =  hash.get(null);
    	  hash.remove(null);
       }
      
       TreeMap<String, String> sorted = new TreeMap<>(hash);
       ordermap.putAll(sorted);
       
       if(nullkeyvalue != null) {
    	   ordermap.put(null,nullkeyvalue);
       }
       
       for(Map.Entry<String, String> entry : ordermap.entrySet() ) {
    	   System.out.println(entry.getKey()+entry.getValue());
       }
	}

}
