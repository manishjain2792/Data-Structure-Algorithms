package searching;


/*In the worst case, we have to do n/m jumps and if the last checked value is greater than the element to be searched for,
we perform m-1 comparisons more for linear search. Therefore the total number of comparisons 
in the worst case will be ((n/m) + m-1). 
The value of the function ((n/m) + m-1) will be minimum when m = √n. Therefore, the best step size is m = √n.*/


//Time Complexity : O(√n)
//Auxiliary Space : O(1)

public class JumpSearch {

	public static int jumpSearch(int arr[],int x){
		int n=arr.length;
		
		// find the block size
		int step= (int) (Math.floor(Math.sqrt(n)));
		
		// find the block where element is present
		int prev=0;
		while(arr[Math.min(step, n)-1]<x){
			prev=step;
			step+=(int)Math.floor(Math.sqrt(n));
			
			if(prev>=n)
				return -1;
			
		}
			// Linear search in the block
		while(arr[prev]<x)
		{
			prev++;
			if(prev==Math.min(step, n))
				return -1;
					
		}
			if(arr[prev]==x)
				return prev;
		
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] ={1,2,3,4,5,6,7,8,9,10,23,24,46,77,88,90,120};
		int n=77;
		
		int result=jumpSearch(arr, n);
		System.out.println("Number "+n + " is at index "+ result);
		

	}
	
/*	Works only sorted arrays.
 * 
 * 	The optimal size of a block to be jumped is O(√ n). This makes the time complexity of Jump Search O(√ n).
	The time complexity of Jump Search is between Linear Search ( ( O(n) ) and Binary Search ( O (Log n) ).
	Binary Search is better than Jump Search, but Jump search has an advantage that we traverse back only once
	(Binary Search may require up to O(Log n) jumps, consider a situation where the element to be search 
	is the smallest element or smaller than the smallest). So in a systems where jumping back is costly, we use Jump Search.
*/
}
