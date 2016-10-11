package searching;

public class CeilOfKey {

	public int Ceil(int arr[],int left,int right,int key)
	{
		int mid;
		while(right-left>1)
		{
			mid=left+((right-left)/2);
			if(arr[mid]<=key)
				left=mid;
			else
				right=mid;
			
		}
		return arr[right];
	}
	
	public int ceil(int arr[],int size ,int key){
		if(key<arr[0])
			return -1;
		return Ceil(arr, 0, size, key);
		
	}
	public static void main(String[] args) {
		
		int arr[]={1,2,3,5,6,8,9};
		CeilOfKey ck=new CeilOfKey();
		int size=arr.length;
		int num=7;		
		int result =ck.Ceil(arr, 0, size, num);
		if(result==-1)
			System.out.println("Not present");
		else
			System.out.println("Ceil of Key is  "+result);
					

	}
}
