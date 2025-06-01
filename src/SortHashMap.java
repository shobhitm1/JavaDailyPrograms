import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class SortHashMap {

	public static void main(String[] args) {
		
		Map<String,Integer> map1= new HashMap<String,Integer>();
			map1.put("banana", 2);
	        map1.put("apple", 5);
	        map1.put(null, 10); // null key
	        map1.put("cherry", 3);
	        
	       Integer nullKeyValue=map1.remove(null);
	       System.out.println(nullKeyValue);
	       
	      Map<String,Integer> lmap = new LinkedHashMap();
	      List<Map.Entry<String, Integer>> llist = new ArrayList<>(map1.entrySet());
	      llist.sort(Map.Entry.comparingByKey());
	      for(Map.Entry<String, Integer> ent: llist) {
	    	  lmap.put(ent.getKey(), ent.getValue());
	      }
	      
	      if(nullKeyValue!=null) {
	            lmap.put(null, nullKeyValue);
	      }
	      
	      for (Map.Entry<String, Integer> entry : lmap.entrySet()) {
	            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
	        }
		
	}

}
