import java.util.Arrays;

public class MergeArrays {

	public static void main(String[] args) {

		int[] arr1={1,2,3};
		int[] arr12= {4,5,6};
		int[] mergedArray=new int[arr1.length+arr12.length];
		System.arraycopy(arr1, 0, mergedArray, 0, arr1.length);
		System.arraycopy(arr12, 0, mergedArray, arr1.length, arr12.length);
		System.out.println(Arrays.toString(mergedArray));
		//-----------------------
		int[] original= {1,2,3,4,5,6};
		int[] secondArray= {11,14,13,12,11,10};
		int[] mergedArray1=Arrays.copyOf(original, original.length+secondArray.length);
		System.arraycopy(secondArray, 0, mergedArray1, original.length, secondArray.length);
		System.out.println(Arrays.toString(mergedArray1));
		//System.arraycopy(sourceArray, sourceArrayStartIndex, destinationArray,destinationArrayStartIndex,LengthofArray);		
		//Declaration
		int[][] matrix;

		// Initialization
		matrix = new int[3][3]; // 3x3 matrix

		// Combined Declaration and Initialization
		int[][] matrixr = {
		    {1, 2, 3},
		    {4, 5, 6},
		    {7, 8, 9 }
		};
		
		
	}

}
	