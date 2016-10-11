package searching;

//Auxiliary Space: O(1) in case of iterative implementation. 
//In case of recursive implementation, O(Logn) recursion call stack space.

public class IterativeBinarySearch {

	public static int binarySearch(int arr[],int num){
		int left=0;
		int right=arr.length-1;
		while(left<=right){
			int mid=(left+((right-left)/2));
			
			if(arr[mid]==num)
				return mid;
			if(arr[mid] < num)
				left=mid+1;
			else
				right=mid-1;
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
					
		//input should be in sorted format
		int arr[]={1,2,3,5,6,8,9};
		int num=3;		
		int result =IterativeBinarySearch.binarySearch(arr,num);
		if(result==-1)
			System.out.println("Not present");
		else
			System.out.println("Present at index "+result);

	}

}
