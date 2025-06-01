import java.util.Arrays;

public class MoveArrayElements {

	public static void main(String[] args) {
		int[] arr= {0,2,4,0,0,0,5,5,32,5,55,6,5};
		int[] newarr=new int[arr.length];
		int index=0;
		for(int num:arr) {
			if(num!=5) {
				newarr[index++]=num;
			}
		}
		while(index<arr.length) {
			newarr[index++]=5;
		}
		System.out.println("Result: " + Arrays.toString(newarr));	
		
		
		///Another approach 
		
		int j=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				arr[j]=arr[i];
				j++;
			}
		}
		
		while(j<arr.length) {
			arr[j]=0;
			j++;
		}
        System.out.println("Array after shifting zeros to end: " + Arrays.toString(arr));

	}

}
