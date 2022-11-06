package arrays;

public class Array_Nearest_Distance {
	public static void main(String[] args) {
		int arr[] = {3,5,4,2,6,2,5,3};
		int x=2,y=3;
		int dist = getMinDistance(arr,x,y);
		System.out.println("Min Distance::"+ dist);
	}

	private static int getMinDistance(int[] arr, int x, int y) {
		int prev = 0,i=0;
		int min_dist=Integer.MAX_VALUE;
        for ( i = 0; i < arr.length; i++) {
           if(arr[i] == x || arr[i] == y){
        	   prev = i;
        	   break;        	   
           }
        }
        for(; i<arr.length ; i++){
        	if(arr[i] == x || arr[i] == y){        		
				if(arr[i] != arr[prev] && i-prev <min_dist){
					min_dist = i-prev;
					prev=i;
				}else{
					prev=i;
				}
        	}
        	
        }
		return min_dist;
	}

}
