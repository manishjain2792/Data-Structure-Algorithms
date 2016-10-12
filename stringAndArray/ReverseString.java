package stringAndArray;

import java.util.Scanner;

public class ReverseString {
	
	static void reverse(String str,int index){
		if(index<str.length()-1){
			reverse(str, index+1);
		}
		System.out.print(str.charAt(index));
	}

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		sc.useDelimiter("\r\n|\n");
		String string =sc.next();
		System.out.println(string);
		reverse(string,0);
		sc.close();
		
	}
	
}
