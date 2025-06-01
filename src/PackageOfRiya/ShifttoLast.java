package PackageOfRiya;

import java.util.Arrays;

public class ShifttoLast {

	public static void main(String[] args) {
     
    		  		int[] arr= {1,2,4,5,5,32,5,55,6,5};
    		  		int[] newarr=new int[arr.length];
    		  		int index=0;
    		  		for(int num:arr) {
    		  			if(num!=5) {
    		  				newarr[index++]=num;
    		  			}
    		  		}
    		  		while(index<newarr.length) {
    		  			newarr[index++]=5;
    		  		}
    		  		System.out.println("Result: " + Arrays.toString(newarr));	
	}
}
