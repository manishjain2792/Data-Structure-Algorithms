package searching;

// Time Complexity - O(n)

public class LinearSearch {

	//return the index if num is present in the array
	public static int search(int arr[],int length, int num)
	{
		for(int i=0;i<length;i++){
			if(arr[i]==num)
				return i;
		}
		// if not found
		return -1; 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={10,230,342,43,12,3,5};
		int size=arr.length;
		int result=search(arr, size, 342);
		if(result==-1)
				System.out.println("Not present");
		else
				System.out.println("Present at index "+result);
		

	}

}
