package arrays;

public class Merge_Sorted_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = new int[5];
		int[] arr2 = {3,9,12,14};
		int j = arr2.length-1;
		int k =arr1.length-1;
	
		arr1[1]=1;
		arr1[2]=5;
		arr1[4]=10;
		int i= k-j-1;
		arr1 = moveFront(arr1);
		while(j>=0 || k >=0){
			if(arr1[i]<arr2[j]){
				arr1[k]=arr2[j];
				j--;
			}else{
				arr1[k]=arr1[i];
				i--;
			}
			k--;
		}
	}

	private static int[] moveFront(int[] arr1) {
		// TODO Auto-generated method stub
		int i=0;int j=0;
		for (i = 0; i < arr1.length; i++) {
			if(arr1[i] != -99){
				arr1[j] = arr1[j];
				j++;
			}
		}
		return arr1;
	}

}
