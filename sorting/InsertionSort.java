package sorting;

public class InsertionSort {
	/*
	 * Time Complexity: O(n*n) 
	 * Auxiliary Space: O(1) 
	 * Boundary Cases: Insertion sort takes maximum time to sort if elements are sorted in reverse order.
	 * And it takes minimum time (Order of n) when elements are already sorted.
	 * Algorithmic Paradigm: Incremental Approach Sorting 
	 * In Place: Yes 
	 * Stable: Yes 
	 * Online: Yes 
	 * Uses: Insertion sort is used when number of elements is small. 
	 * It can also be useful when input array is almost sorted, only few
	 * elements are misplaced in complete big array.
	 */
	
	
	public void sort(int arr[]){
		int n=arr.length;
		for(int i=1;i<n;i++){
			int key=arr[i];
			int j=i-1;
			
			while(j>=0 && arr[j]>key)
			{
				arr[j+1]=arr[j];
				j=j-1;
			}
			arr[j+1]=key;
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
		InsertionSort isort=new InsertionSort();
		isort.sort(arr);;
		InsertionSort.printArray(arr);
		
	}

}
