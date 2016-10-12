package stringAndArray;

import java.util.Scanner;

public class ReverseSentence {

	
	//this method is used to reverse 
	//a char array passed to it with begin and end indices
	static void reverse(char arr[],int start,int end){
		while(start<end){
			char temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
	}
	/*
	 * this method reverses the order of the words in a string 
	 * and prints the final output string, 
	 * the logic is very simple first reverse the entire string 
	 * and then swap the elements of the string while start < end
	 */
	static void reverseWords(char [] string){
		int startIndex=-1;
		for(int i=0;i<string.length;i++){
			if(string[i]!=' ' && startIndex==-1){
				startIndex=i;
			}
			
			if(string[i]==' ' && startIndex!=-1){
				reverse(string, startIndex, i-1);
				startIndex=-1;
			}
		}
		/*
		 * we do this step to reverse the last word in the input string 
		 * because we have trimmed the input string 
		 * we won't be encountering a space in the last word and hence this would not be reversed
		 */
		reverse(string, startIndex, string.length-1);
		
		// after reversing the individual words of the string reverse the entire string
		reverse(string, 0, string.length-1);
		
		String s=new String(string);
		System.out.println(s);
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the input string : ");
		String input = sc.nextLine();
		char[] inputString = input.trim().toCharArray();

		// reverse the words in the string
		reverseWords(inputString);
		sc.close(); 
	}

}
