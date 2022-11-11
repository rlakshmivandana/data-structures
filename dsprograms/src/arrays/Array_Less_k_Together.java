package arrays;

public class Array_Less_k_Together {
	
	public static void main(String[] args) {
		int arr[]= {1,6,5,2,4,3,8,9};
		int k =4;
		int count = getMinSwapCount(arr,arr.length,k);
		System.out.println("count"+count);
	}

	private static int getMinSwapCount(int[] arr, int length, int k) {
		int wd=0,large = 0, ans;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] <= k) wd++;
		}
		for (int i = 0; i < wd; i++) {
			if(arr[i] >k) large++;
		}
		ans=large;
		for(int i=0,j=wd;j<arr.length;i++,j++){
			if(arr[i] >k) large--;
			if(arr[j] >k) large++;
			ans = Math.min(ans, large);
		}		
		return ans;
	}

}
