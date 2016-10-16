package sorting;

public class MergeSort {

	public void merge(int arr[],int left,int mid, int right){
		// two subarray size calculation
		
		int m=mid-left+1;
		int n=right-mid;
		
		// creating two sub array
		int leftArray[]=new int[m];
		int rightArray[]=new int[n];
		
		// adding element to  those subarray
		for(int i=0;i<m;i++)
			leftArray[i]=arr[i+left];
		
		for(int j=0;j<n;j++)
			rightArray[j]=arr[mid+1+j];
		
		int i=0;
		int j=0;
		int k=left;
		// merge the two sub array
		while(i<m && j<n)
		{
			if(leftArray[i]<=rightArray[j])
			{
				arr[k]=leftArray[i];
				i++;
			}
			else
			{
				arr[k]=rightArray[j];
				j++;
			}
			k++;
		}
		
		// copy the element left 
		while(i<m){
			arr[k]=leftArray[i];
			i++;
			k++;
		}
		
		while(j<n){
			arr[k]=rightArray[j];
			j++;
			k++;
		}
				
	}
	
	public void mergeSort(int arr[],int left,int right){
		if(left<right){
			int mid=(left+right)/2;
			mergeSort(arr, left, mid);
			mergeSort(arr, mid+1, right);
			merge(arr, left, mid, right);
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
		MergeSort msort=new MergeSort();
		System.out.println("Before");
		MergeSort.printArray(arr);
		msort.mergeSort(arr, 0, arr.length-1);
		System.out.println("After");
		MergeSort.printArray(arr);
	}

}
