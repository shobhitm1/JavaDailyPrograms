import java.util.Arrays;

public class SortArrayBubbleSort {

	public static void main(String[] args) {
		
		int[] arry= {1,2,2,34,2,4,1,9,76,0};
		
		for(int i=0;i<arry.length-1;i++) {
			for(int j=0;j<arry.length-i-1;j++) {
				if(arry[j]>arry[j+1]) {
					int temp=arry[j];
					arry[j]=arry[j+1];
					arry[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arry));
		
	}

}
