package arrays;

import java.util.Arrays;

public class ArrayMissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {9,2,4,1,6,7,5,8};		
		System.out.println(Arrays.toString(arr));
	    int num = missigNumber(arr);
	    System.out.println("missing number is "+ num);		
	}

	private static int missigNumber(int[] arr) {
		int size = arr.length;
		int act_sum = ((size+1)*(size+2))/2;
		int arr_sum = 0;
		for (int i = 0; i < arr.length; i++) {
			arr_sum+=arr[i];             
		}
		return act_sum-arr_sum;
	}

}
