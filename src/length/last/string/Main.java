package length.last.string;

import java.util.Scanner;

//Given a string s consisting of words and spaces, return the length of the last word in the string.
//
//A word is a maximal 
//substring
// consisting of non-space characters only.

public class Main {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		 String str= sc.nextLine();
		 
		 int strLen = findLastLenght(str);
		 
		 System.out.println(strLen);
		 
		 sc.close();
	}

	private static int findLastLenght(String str) {
		 String[] strArr = str.split(" ");
		 int res= strArr[strArr.length-1].length();
		return res;
	}

}
