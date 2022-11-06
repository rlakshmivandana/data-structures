package arrays;

public class Sub_Array_Sum_Print {
	public static void main(String[] args) {
		int arr[]={1,-2,-6,3,-1,2,4,8,-12,40};
		int sum=0;
		int max_sum=0;
		int startIndex=0;
		int endIndex = 0;
		int prevSum=0;

		for(int i=0;i<arr.length;i++){
			prevSum = sum;
			sum = sum + arr[i];
			if(sum > max_sum){				
				max_sum = sum;
				endIndex = i;
				if(prevSum == 0){
					startIndex = i;
				}
			}
			if(sum <=0){
				sum = 0;
			}
		}
		System.out.print("sub array: " + "[ ");

		for (int i = startIndex; i <= endIndex; i++) {
			System.out.print(arr[i]+" ");

		}
		System.out.print("]"+"\n");

		System.out.println("sub array sum: "+ max_sum);
	}

}
