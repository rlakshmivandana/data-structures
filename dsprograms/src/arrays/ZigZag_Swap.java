package arrays;

import java.util.Arrays;
/**
 * 
 * @author vandana
 * time complexity : O(n)
 * spaceComplexity : n
 *
 */
public class ZigZag_Swap {
	public static void main(String[] args) {
		int arr[] = {4,3,2,7,8,6,2,1};
		System.out.println(Arrays.toString(arr));
		int arr_result[] = getZigZagArray(arr);
		System.out.println(Arrays.toString(arr_result));
	}

	private static int[] getZigZagArray(int[] arr) {
        boolean flag = true;
        for (int i = 0; i < arr.length-1; i++) {
        	 if(flag){
             	if(arr[i]>arr[i+1]){
             		int temp = arr[i];
        			arr[i]=arr[i+1];
        			arr[i+1]=temp;
             	}
             }else{
            	 if(arr[i]<arr[i+1]){
        			int temp = arr[i];
        			arr[i]=arr[i+1];
        			arr[i+1]=temp;
              	}
             }
        	 flag=!flag;
		}
        
       
        return arr;
	}
	

}
