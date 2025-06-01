package PackageOfRiya;

import java.util.ArrayList;

public class firstlastofArrayyList {

	public static void main(String[] args) {
         ArrayList<String> list = new ArrayList<>();
         list.add("Riya");
         list.add("loves");
         list.add("shobhit");
         list.add("always loves");
         list.add("riyaherwife");
         
        String firstelement= list.get(0);
       int lastindex= list.size()-1;
       String lastelement = list.get(lastindex);
       System.out.println("print first and last element :" + firstelement + " " + lastelement  );
         
	}

}
