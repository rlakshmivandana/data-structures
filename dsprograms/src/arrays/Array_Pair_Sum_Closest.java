package arrays;
import java.lang.Math;

/**
 * 
 * @author vandana
 * time complexity : O(n)
 * spaceComplexity : 
 *
 */
public class Array_Pair_Sum_Closest {

	public static void main(String[] args) {
		// pair whose sum closest to 30
		int arr1[]={6,9,15,16,40};
		int arr2[]={2,4,7,14,15};
		int m = arr1.length;
		int n = arr2.length;
		int x=30;
		int i=0,j=n-1;
		int result_i = 0,result_j = 0;
	    int diff = Integer.MAX_VALUE;

		while(i<n && j>=0){
			if(Math.abs(arr1[i]+arr2[j]-x) < diff){
				result_i=i;result_j=j;
				diff=Math.abs(arr1[i]+arr2[j]-x);				
			}
			if(arr1[i]+arr2[j] > x){
				j--;
			}else{
				i++;
			}
			
		}
		
		System.out.println("closest pair:: "+arr1[result_i]+" , "+arr2[result_j]+" sum :"+(arr1[result_i]+arr1[result_i])+" diff:  "+diff);


	}

}
