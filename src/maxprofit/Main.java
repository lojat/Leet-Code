package maxprofit;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements: ");
		int n = sc.nextInt();
		int[] prieces = new int[n];
		
		for(int i=0;i<n;i++) {
			prieces[i]=sc.nextInt();
		}
		
		int res = maxProfit(prieces);
		
		System.out.println( res);
	}

	private static int maxProfit(int[] prieces) {
		int max=0;
		int min=prieces[0];
		int res=0;
		for(int i=0;i<prieces.length;i++) {
			if(prieces[i]<min) {
				min=prieces[i];
			} 
			if(prieces[i]>max) {
				max=prieces[i];
				res= max-min;
			}
		}
		return res;
	}

}
