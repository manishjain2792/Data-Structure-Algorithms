package searching;


/*Time Complexity : If elements are uniformly distributed, 
 then O (log log n)). In worst case it can take upto O(n).
 Auxiliary Space : O(1)
*/
public class InterpolationSearch {
	
	public static int interpolationSearch(int arr[],int n,int x){
		int low=0;
		int high= n-1;
		while(low<=high){
			int position =low + (((x-arr[low])*(high-low))/(arr[high]-arr[low]));
			
			if(arr[position]==x)
				return position;
			
			if(arr[position]<x)
				low=position+1;
			else
				high=position-1;
		}
		return -1;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] ={1,2,3,4,5,6,7,8,9,10,23,24,46,77,88,90,120};
		int n=4;
		int size=arr.length;
		int result=interpolationSearch(arr,size, n);
		System.out.println("Number "+n + " is at index "+ result);
		
	}

}
