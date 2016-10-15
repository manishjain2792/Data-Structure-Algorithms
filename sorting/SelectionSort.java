package sorting;

public class SelectionSort {
	
/*	Time Complexity: O(n*n) as there are two nested loops.
	Auxiliary Space: O(1)
	The good thing about selection sort is it never makes more than O(n) swaps and can be useful when memory write is a costly operation.
*/
	public void sort(int arr[])
	{
		int n=arr.length;
		
		for(int i=0;i<n-1;i++){
			int min_index=i;
			for(int j=i+1;j<n;j++){
				if(arr[j]<arr[min_index])
					min_index=j;
			}
			int temp=arr[min_index];
			arr[min_index]=arr[i];
			arr[i]=temp;
			
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
		SelectionSort ssort=new SelectionSort();
		ssort.sort(arr);
		SelectionSort.printArray(arr);
	}

}
