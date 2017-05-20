package dataStructure.array;

/**
 * 
 * @author Manish
 * Problem Statement : Given two sorted arrays, find their union and intersection
 *
 */
public class UnionInteractionArray {
	
	/*Time Complexity: O(m+n)*/ 
	/**
	 * 
	 * @param arr1
	 * @param arr2
	 * @param x
	 * @param y
	 * For union of two arrays, follow the following merge procedure.
		1) Use two index variables i and j, initial values i = 0, j = 0
		2) If arr1[i] is smaller than arr2[j] then print arr1[i] and increment i.
		3) If arr1[i] is greater than arr2[j] then print arr2[j] and increment j.
		4) If both are same then print any of them and increment both i and j.
		5) Print remaining elements of the larger array.
	 */
	
	public static void printUnionArray(int arr1[],int arr2[],int x,int y){
		int i=0,j=0;
		while(i<x && j<y){
			if(arr1[i]<arr1[j])
				System.out.print(arr1[i++]+" ");
			else if (arr2[j]<arr1[i])
				System.out.print(arr2[j++]+" ");
			else{
				System.out.print(arr1[i++]+" ");
				j++;
			}
		}
		while(i<x)
			System.out.print(arr1[i++]+" ");
		while(j<y)
			System.out.print(arr2[j++]+" ");
	}
	/**
	 * 
	 * @param arr1
	 * @param arr2
	 * @param x
	 * @param y
	 * For Intersection of two arrays, print the element only if the element is present in both arrays.
		1) Use two index variables i and j, initial values i = 0, j = 0
		2) If arr1[i] is smaller than arr2[j] then increment i.
		3) If arr1[i] is greater than arr2[j] then increment j.
		4) If both are same then print any of them and increment both i and j.
	 */
	
	public static void printIntersectionArray(int arr1[],int arr2[],int x,int y){
		int i=0,j=0;
		while(i<x && j<y){
			if(arr1[i]<arr2[j])
				i++;
			else if(arr2[j]<arr1[i])
				j++;
			else{
				System.out.print(arr1[i++]+" ");
				j++;
			}
		}
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]={1,3,5,6,8,9};
		int arr2[]={2,4,5,6};
		System.out.println("Interaction");
		UnionInteractionArray.printIntersectionArray(arr1, arr2, arr1.length, arr2.length);
		System.out.println("\nUnion");
		UnionInteractionArray.printUnionArray(arr1, arr2, arr1.length, arr2.length);
		}

}
