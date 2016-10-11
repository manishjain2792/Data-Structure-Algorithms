package searching;

public class OptimizedBinarySearch {
	
	public static int BinarySearch(int arr[],int left,int right,int num)
	{
		int mid;
		while(right-left>1)
		{
			mid=(left+(right-left)/2);
			if(arr[mid] <=num)
				left=mid;
			else
				right=mid;

		}
		if(arr[left]==num)
			return left;
		else
			return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={1,2,3,5,6,8,9};
		int size=arr.length;
		int num=3;		
		int result =OptimizedBinarySearch.BinarySearch(arr,0,size-1,num);
		if(result==-1)
			System.out.println("Not present");
		else
			System.out.println("Present at index "+result);

	}

}
