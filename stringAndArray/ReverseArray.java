package stringAndArray;


// Time Complexity: O(n)
public class ReverseArray {
	
	static void reverseArrayRecursive(int arr[],int start,int end)
	{
		int temp;
		if(start>=end)
			return;
		temp=arr[start];
		arr[start]=arr[end];
		arr[end]=temp;
		reverseArrayRecursive(arr, start+1, end-1);
		
	}
	
	static void reverseArrayIterative(int arr[],int start,int end){
		int temp;
		while(start<end){
			temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
			
		}
		
	}
	
	static void printArray(int arr[],int size)
	{
		int i;
		for(i=0;i<size;i++)
			System.out.println(arr[i]+" ");
		System.out.println("");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={1,2,3,4,5,6,7,8};
		printArray(arr, 8);
		reverseArrayRecursive(arr, 0, 7);
		System.out.println("Reversed recursively");
		printArray(arr, 8);
		System.out.println("Reversed iteratively");
		reverseArrayIterative(arr, 0, 7);
		reverseArrayIterative(arr, 0, 7);
		printArray(arr, 8);

	}

}

