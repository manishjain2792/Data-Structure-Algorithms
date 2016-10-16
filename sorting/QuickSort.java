package sorting;

public class QuickSort {

	public int partition(int arr[],int low,int high){
		int pivot=arr[high];
		int i=low-1;
		for(int j=low;j<=high-1;j++){
			if(arr[j]<=pivot){
				i++;
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		int temp=arr[i+1];
		arr[i+1]=arr[high];
		arr[high]=temp;
				
		return i+1;
	}
	
	void quickSort(int arr[],int low,int high){
		if(low<high){
			int pivot=partition(arr, low, high);
			quickSort(arr, low, pivot-1);
			quickSort(arr, pivot+1, high);
		}
	}
	public static void printArray(int arr[]){
		for (int i=0;i<arr.length;i++)
			System.out.println(arr[i]+ " ");
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={2,3,18,21,4,5,6,7,8,9,12,2};
		QuickSort qsort=new QuickSort();
		qsort.quickSort(arr, 0,arr.length-1);
		BubbleSort.printArray(arr);
	}
}
