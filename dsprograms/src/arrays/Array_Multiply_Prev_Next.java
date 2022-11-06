package arrays;

import java.util.Arrays;

public class Array_Multiply_Prev_Next {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,4,5,7,8};
		System.out.println("before: "+ Arrays.toString(arr));
        int curr = 0;
        int prev = 0;
        prev = arr[0];
		arr[0]= arr[0]*arr[1];
		for (int i = 0; i < arr.length-1; i++) {
			curr = arr[i];
			arr[i] = prev*arr[i+1];
			prev = curr;			
		}
		arr[arr.length-1]= arr[arr.length-1]*prev;
		System.out.println("after:"+ Arrays.toString(arr));

	}

}
