
public class MergeSortedArays {

	public static void main(String[] args) {
		int[] arr1= {1,3,5};
		int[] arr2= {2,4,6};
		int[] MergedArray=mergeArray(arr1,arr2);
		for(int i=0;i<MergedArray.length;i++) {
			System.out.println(MergedArray[i]);
		}
	}
	private static  int[] mergeArray(int[] arr1,int[] arr2) {
		int[] MergedArray=new int[arr1.length+arr2.length];
		int i=0,j=0,k=0;
		while(i<arr1.length && j<arr2.length) {
			if(arr1[i]<arr2[j]) {
				MergedArray[k++]=arr1[i++];
			}else {
				MergedArray[k++]=arr2[j++];
			}		
		}
		while(i<arr1.length) {
			MergedArray[k++]=arr1[i++];
		}
		while(j<arr2.length) {
			MergedArray[k++]=arr2[j++];
		}
		return MergedArray;
	}
}