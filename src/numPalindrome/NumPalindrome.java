package numPalindrome;

import java.util.Scanner;

public class NumPalindrome {

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		boolean res = isPalindrome(num);
		System.out.println(num+" is Palindrome: "+res);
	}
	
	  public static boolean isPalindrome(int x) {
	        int res=0,x1=Math.abs(x);
	        System.out.println(x1);
	        while(x!=0){
	            res=(res*10)+x%10;
	            x/=10;
	        }
	        System.out.println(res);
	        if(x1==res)
	            return true;
	        else
	            return false;
	    }

}
