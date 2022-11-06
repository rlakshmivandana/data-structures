package arrays;

public class Sub_Array_Sum {
	public static void main(String[] args) {
		int arr[]={1,-2,-6,3,-1,2,4,8,-12};
		int sum=0;
		int max_sum=0;

		for(int i=0;i<arr.length;i++){
			sum = sum + arr[i];
			if(sum > max_sum){
				max_sum = sum;
			}
			if(sum <=0){
				sum = 0;
			}
		}
		System.out.println("sub array sum"+ max_sum);
	}

}
