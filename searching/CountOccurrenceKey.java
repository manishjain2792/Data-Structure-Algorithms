package searching;

public class CountOccurrenceKey {
	
	public int GetRightPosition(int arr[],int left,int right,int key){
		int mid;
		while(right-left>1)
		{
			mid=left+(right-left)/2;
			if(arr[mid]<=key)
				left=mid;
			else
				right=mid;
		}
		return left;
	}
	public int GetLeftPosition(int arr[],int left,int right,int key){
		int mid;
		while(right-left>1)
		{
			mid=left+(right-left)/2;
			if(arr[mid]>=key)
				right=mid;
			else
				left=mid;
		}
		return right;
	}
	
	public int CountOccurences(int arr[],int size,int key){
		int left=GetLeftPosition(arr, -1, size-1, key);
		int right= GetRightPosition(arr, 0, size, key);
		
		if(arr[left]==key && key==arr[right])
			return (right-left+1);
		else
			return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={1,2,2,3,3,5,6,8,9};
		CountOccurrenceKey count=new CountOccurrenceKey();
		int size=arr.length;
		int num=9;		
		int result =count.CountOccurences(arr, size, num);
		if(result==0)
			System.out.println("Not present");
		else
			System.out.println("Count is  "+result);
			
			
	}

}
