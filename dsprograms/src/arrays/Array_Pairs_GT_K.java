package arrays;

public class Array_Pairs_GT_K {

	public static void main(String[] args) {
      int arr[]={3,2,4,7,1,2,5};
      int count = getSubArrayCount(arr,arr.length,3);
      System.out.println(count);
	}

	private static int getSubArrayCount(int[] arr, int length, int k) {
		int subArray = 0,count=0;
        for (int i = 0; i < arr.length; i++) {
			if(arr[i]>k) continue;
			count = 0;
			for(;i<length && arr[i]<=k;i++){
			 count++;
			}
			subArray += count *(count+1)/2;
		}
		return length * (length+1)/2 - subArray;
	}

}
