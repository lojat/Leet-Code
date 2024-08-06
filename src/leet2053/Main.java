package leet2053;

public class Main {

	public static void main(String[] args) {
		 
		String[] arr = {"d","b","c","b","c","a"};
		int k = 2;
		
		Solution solution = new Solution();
		
		String res = solution.kthDistinct(arr, k);
		
		System.out.println(res);

	}

}
