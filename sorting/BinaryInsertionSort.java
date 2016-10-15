package sorting;

public class BinaryInsertionSort {

	/*
	 * We can use binary search to reduce the number of comparisons in normal
	 * insertion sort. Binary Insertion Sort find use binary search to find the
	 * proper location to insert the selected item at each iteration. In normal
	 * insertion, sort it takes O(i) (at ith iteration) in worst case. we can
	 * reduce it to O(logi) by using binary search. The algorithm as a whole
	 * still has a running worst case running time of O(n2) because of the
	 * series of swaps required for each insertion.
	 */
	
	
	public int binarySearch(int arr[],int low,int high,int key)
	{
		if(high<=low)
		{
			if(arr[low]<key)
				return low+1;
			else
				return low;
		}
		int mid=(low+high)/2;
		if(key==arr[mid])
			return mid+1;
		if(key>arr[mid])
			return binarySearch(arr, mid+1, high, key);
		return binarySearch(arr, low, mid-1, key);
	}
	
	public void insertionSort(int arr[],int n){
		int j,loc,temp;
		for(int i=0;i<n;i++){
			j=i-1;
			temp=arr[i];
			
			loc=binarySearch(arr, 0, j, temp);
			
			while(j>=loc)
			{
				arr[j+1]=arr[j];
				j=j-1;
				
			}
			arr[j+1]=temp;
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
		BinaryInsertionSort bisort=new BinaryInsertionSort();
		bisort.insertionSort(arr, arr.length);
		BinaryInsertionSort.printArray(arr);
	}
}
