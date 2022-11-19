package stack;

import java.util.Arrays;

public class Chocolate_Distribution {

	public static void main(String[] args) {
	  int arr[] = { 12, 4,  7,  9,  2,  23, 25, 41, 30};

	  int m = 3; // Number of students
	
	  int n = arr.length;
	  System.out.println("Minimum difference:: " + findMinDiff(arr, n, m));

	}

	private static int findMinDiff(int[] arr, int n, int m) {
		 if (m == 0 || n == 0)
	            return 0;
	 
	        Arrays.sort(arr);
			System.out.println("sorted:"+Arrays.toString(arr));

	        System.out.println();
	        if (n < m)
	            return -1;
	 
	        int min_diff = Integer.MAX_VALUE;	        
	 
	        for (int i = 0; i + m - 1 < n; i++) {
	            int diff = arr[i + m - 1] - arr[i];
	            if (diff < min_diff)
	                min_diff = diff;
	        }
	        return min_diff;
	}

}
