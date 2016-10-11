package searching;

public class FloorOfkey {

	public int Floor(int arr[],int left,int right,int key)
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
		return arr[left];
	}
	
	public int floor(int arr[],int size ,int key){
		if(key<arr[0])
			return -1;
		return Floor(arr, 0, size, key);
		
	}
	public static void main(String[] args) {
		
		int arr[]={1,2,3,5,6,8,9};
		FloorOfkey fk=new FloorOfkey();
		int size=arr.length;
		int num=7;		
		int result =fk.Floor(arr, 0, size, num);
		if(result==-1)
			System.out.println("Not present");
		else
			System.out.println("Floor of Key is  "+result);
			// TODO Auto-generated method stub
			

	}

}
