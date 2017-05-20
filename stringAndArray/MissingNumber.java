package dataStructure.array;

/* Problem Statement :
 * You are given a list of n-1 integers and these integers are in the range of 1 to n. 
 * There are no duplicates in list. One of the integers is missing in the list. 
 * Write an efficient code to find the missing integer
*/

public class MissingNumber {
	
	/**TimeComplexity -O(n) 
	 * Cons: Integer Overflow
	 * (n+1) is used to find the missing number because the size of the arrary is n
	 * Algorithm: 
	 * 		1.	Find the sum of numbers 
       			sum = n*(n+1)/2
			2.  Subtract all the numbers from sum and you will get the missing number.
	 * */
	public static int getMissingNumber(int arr[],int n)
	{
		int sum=(n+1)*(n+2)/2;
		for (int i=0;i<n;i++)
			sum-=arr[i];
		return sum;		
	}
	
	/**TimeComplexity - O(n) - No overFlow
	 * @param arr
	 * @return int
	 * 
	 * 1) XOR all the array elements, let the result of XOR be first.
  	   2) XOR all numbers from 1 to n, let XOR be seccond.
  	   3) XOR of first and second gives the missing number.
	 */
	public static int getMissingNumber(int arr[]){
		int size=arr.length;
		int first=arr[0];
		int second=1;
		for (int i=1;i<size;i++)
			first=first^arr[i];
		for(int i=2;i<size+1;i++)
			second=second^i;
		return first^second;
	}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={1,2,3,4,6,7,8};
		int size= arr.length;
		System.out.println(MissingNumber.getMissingNumber(arr, size));
		System.out.println(MissingNumber.getMissingNumber(arr));
	}

}
