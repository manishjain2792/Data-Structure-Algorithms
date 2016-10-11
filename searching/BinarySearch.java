package searching;

//Time Complexity : O(Log(n))
//Space :In case of recursive implementation, O(Logn) recursion call stack space.


public class BinarySearch {
	
	public  int binarSearch(int arr[],int left,int right, int num){
		int mid;
		
		if(left>right)
			return -1;
		
//		m = (left+right)/2″. It fails for large values of left and right. 
//		Specifically, it fails if the sum of low and high is greater than 
//		the maximum positive int value (2^31 – 1). 
//		The sum overflows to a negative value, and the value stays negative when divided by two. 
//		In C this causes an array index out of bounds with unpredictable results.
//		
//		//int mid = (left + right) >>> 1; 

		mid=left+((right-left)/2);
		
		// return index if it is present in middle
		if(arr[mid]==num)
			return mid;
		// if element is smaller than middle element 
		// then check in the left subarray 
		if(arr[mid]>num)
			return binarSearch(arr, left, mid-1, num);
		// else check right sub array 
		else			
			return binarSearch(arr, mid+1, right, num);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearch bs=new BinarySearch();
		
		//input should be in sorted format
		int arr[]={1,2,3,5,6,8,9};
		int size=arr.length;
		int num=3;		
		int result =bs.binarSearch(arr, 0, size-1, num);
		if(result==-1)
			System.out.println("Not present");
		else
			System.out.println("Present at index "+result);
	

	}

}
