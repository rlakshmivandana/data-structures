package arrays;

import java.util.Arrays;

public class Array_Shift_K_Numbers {
	public static void main(String[] args) {
		int arr[]={70,60,50,40,30,20,10};
		int k=4;
		int temp;
		for (int i = 0, j=arr.length-k-1; i < j; i++,j--) {
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;			
		}

		for (int i = arr.length-k, j=arr.length-1; i < j; i++,j--) {
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;			
		}
		for (int i = 0, j=arr.length-1; i < j; i++,j--) {
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;			
		}
		System.out.println(Arrays.toString(arr));
	     
	}

}
