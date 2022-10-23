package arrays;

import java.util.Arrays;
/**
 * 
 * @author vandana
 * time complexity : O(nLogn)
 * spaceComplexity : n
 *
 */
public class ZigZag_Sorting {
	public static void main(String[] args) {
		int arr[] = {4,3,7,8,6,2,1};
		System.out.println("array: "+Arrays.toString(arr));
		int arr_result[] = getZigZagArray(arr);
		System.out.println("zigzag:"+Arrays.toString(arr_result));
	}

	private static int[] getZigZagArray(int[] arr) {
	    Arrays.sort(arr);
		System.out.println("sorted:"+ Arrays.toString(arr));
	    for (int i = 1; i < arr.length-1; i+=2) {
	    	int temp = arr[i];
			arr[i]=arr[i+1];
			arr[i+1]=temp;
		}  
		return arr;      
	}
	

}
