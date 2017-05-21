package dataStructure.array;

import javax.swing.text.AbstractDocument.LeafElement;

/**
 * @author Manish
 * Problem : Given two binary arrays arr1[] and arr2[] of same size n. 
 * Find length of the longest common span (i, j) where j >= i such that 
 * arr1[i] + arr1[i+1] + …. + arr1[j] = arr2[i] + arr2[i+1] + …. + arr2[j].
 * Expected time complexity is Θ(n).
 *
 */
public class LongestCommonSumBinaryArray {
	
	/**
	 * Time Complexity =O(n^2)
	 * Space Complexity =O(1)
	 * @param arr1
	 * @param arr2
	 * @param n
	 * @return
	 */
    public  static int longestCommonSum(int arr1[],int arr2[],int n){
    	int length=0;
    	for(int i=0;i<n;i++){
    		int sum1=0, sum2=0;
    		for(int j=i;j<n;j++){
    			sum1+=arr1[j];
    			sum2+=arr2[j];
    			if(sum1==sum2){
    				int len=j-i+1;
    				if(len>length)
    					length=len;
    			}    			
    		}
    	}
    	return length;
    }
    
    /**
     * TimeComplexity -O(n)
     * SpaceComplexity -O(n)
     * @param arr1
     * @param arr2
     * @param n
     * @return
     */
    public static int longestCommonSumOptimize(int arr1[],int arr2[],int n){
    	int length=0;
    	int sum1=0,sum2=0;
    	
    	int[] diff=new int[2*n+1];
    	//Initialize the array with -1
    	for(int i=0;i<diff.length;i++)
    		diff[i]=-1;
    	
    	for(int i=0;i<n;i++)
    	{
    		//Update the sums
    		sum1+=arr1[i];
    		sum2+=arr2[i];
    		//Compute the current difference and index to be used
    		// for diff array
    		int current_diff=sum1-sum2;
    		int differenceIndex=n+current_diff;
    		//If current diff is 0, then there are same number
    		// of 1's so far in both arrays, i.e., (i+1) is
    		// maximum length.
    		if(current_diff==0)
    			length=i+1;    		
    		//If current diff is seen first time, then update
    		// starting index of diff.
    		else if (diff[differenceIndex]==-1)
    			diff[differenceIndex]=i;
    		// Current diff is already seen
    		else
    		{
    			int len=i-diff[differenceIndex];
    			
    			if(len>length)
    				length=len;
    		}
    		
    	}
    		
    	return length;
    	
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]={0,1,1,0,1,0};
		int arr2[]={1,1,1,0,1,0};
		System.out.println(LongestCommonSumBinaryArray.longestCommonSum(arr1, arr2, arr1.length));
		System.out.println(LongestCommonSumBinaryArray.longestCommonSumOptimize(arr1, arr2, arr1.length));
	}

}
