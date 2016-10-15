package sorting;

public class BubbleSort {
	
	/*Worst and Average Case Time Complexity: O(n*n). Worst case occurs when array is reverse sorted.
	Best Case Time Complexity: O(n). Best case occurs when array is already sorted.
	Auxiliary Space: O(1)
	Boundary Cases: Bubble sort takes minimum time (Order of n) when elements are already sorted.
	Sorting In Place: Yes
	Stable: Yes*/
	
	public void bubbleSort(int arr[],int n){
		boolean swap;
		for (int i=0;i<n-1;i++)
		{
			swap=false;
			for(int j=0;j<n-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					swap=true;
				}
			}
		if(swap==false)
			break;
		}
		
	}
	public static void printArray(int arr[]){
		for (int i=0;i<arr.length;i++)
			System.out.println(arr[i]+ " ");
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={2,353,14,12,1536,13,74,12,1};
		BubbleSort bsort=new BubbleSort();
		bsort.bubbleSort(arr, arr.length);
		BubbleSort.printArray(arr);
	}

}
