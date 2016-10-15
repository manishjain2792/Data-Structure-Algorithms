package searching;

public class FibonacciSearch {
	
	/*The worst case will occur when we have our target in the larger (2/3) fraction of the array, 
	as we proceed finding it. In other words, we are eliminating the 
	smaller (1/3) fraction of the array every time. We call once for n, then for(2/3) n, t
	hen for (4/9) n and henceforth.*/

	

	public static int fibonacciSearch(int arr[],int x,int n)
	{
		int fib2=0; //(m-2)th Fibonacci no
		int fib1=1; //(m-1)th Fibonacci no
		int fib=fib2+fib1;//(m)th Fibonacci no

		// fib will store the smallest fibonacci no >= n 
		while(fib<n)
		{
			fib2=fib1;
			fib1=fib;
			fib=fib1+fib2;
		}
		
		int offset=-1;
		
		while (fib>1)
		{
			int i=Math.min(offset+fib2, n-1);
			
			if(arr[i]<x)
			{
				fib=fib1;
				fib1=fib2;
				fib2=fib-fib1;
				offset=i;
			}
			else if(arr[i]>x)
			{
				fib=fib2;
				fib1=fib1-fib2;
				fib2=fib-fib1;
			}
			
			else
				return i;
		}	
		
		if(fib1>1 && arr[offset+1]==x)
				return offset+1;
		
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] ={1,2,3,4,5,6,7,8,9,10,23,24,46,77,88,90,120};
		int n=1;
		int size=arr.length;
		int result=fibonacciSearch(arr, n, size);
		System.out.println("Number "+n + " is at index "+ result);
		
	}
	
	//***************************************IMPORTANT************************************************//
/*	Fibonacci Search is a comparison-based technique that uses Fibonacci numbers to search an element in a sorted array.

	Similarities with Binary Search:

	Works for sorted arrays
	A Divide and Conquer Algorithm.
	Has Log n time complexity.
	Differences with Binary Search:

	Fibonacci Search divides given array in unequal parts
	Binary Search uses division operator to divide range. Fibonacci Search doesn’t use /, but uses + and -. The division operator may be costly on some CPUs.
	Fibonacci Search examines relatively closer elements in subsequent steps. So when input array is big that cannot fit in CPU cache or even in RAM, Fibonacci Search can be useful.
	Background:
	Fibonacci Numbers are recursively defined as F(n) = F(n-1) + F(n-2), F(0) = 0, F(1) = 1. First few Fibinacci Numbers are 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, …

	Observations:
	Below observation is used for range elimination, and hence for the O(log(n)) complexity.

	F(n - 2) ≈ (1/3)*F(n) and 
	F(n - 1) ≈ (2/3)*F(n).
	Algorithm:
	Let the searched element be x.

	The idea it to first find the smallest Fibonacci number that is greater than or equal to length of given array. Let the found fibonacci number be fib (m’th fibonacci number). We use (m-2)’th Fibonacci number as index (If it is a valid index). Let (m-2)’th Fibonacci Number be i, we compare arr[i] with x, if x is same, we return i. Else if x is greater, we recur for subarray after i, else we recur for subarray before i.

	Below is complete algorithm
	Let arr[0..n-1] be th input array and element to be searched be x.

	Find the smallest Fibonacci Number greater than or equal n. Let this number be fibM [m’th Fibonacci Number]. Let the two Fibonacci numbers preceding it be fibMm1 [(m-1)’th Fibonacci Number and fibMm2 [(m-2)’th Fibonacci Number./li>
	While the array has elements to be inspected:
	Compare x with the last element of the range covered by fibMm2
	If x matches, return index
	Else If x is less than the element, move the three Fibonacci variables two Fibonacci down, indicating elimination of approximately rear two-third of the remaining array.
	Else x is greater than the element, move the three Fibonacci variables one Fibonacci down. Reset offset to index. Together these indicate elimination of approximately front one-third of the remaining array.
	Since there might be a single element remaining for comparison, check if fibMm1 is 1. If Yes, compare x with that remaining element. If match, return index.*/
	

}
