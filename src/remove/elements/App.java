package remove.elements;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {2,2,2};
		int k = removeElement(arr, 0);
		System.out.println();
		System.out.println(k);
	}

	public static int removeElement(int[] nums, int val) {
		int k =0;
		if (nums.length == 1) {
			if (nums[0] != val)
				k++;
		} else {
			int c=0;
			for (int i = 0; i < nums.length - 1; i++) {
				if (nums[i] == val) {
					nums[i] = nums[i + 1];
					c++;
				} else {
					nums[i - c] = nums[i];
					k++;
				}
			}
			if(nums.length<=2&&nums[k]!=val) {
				k++;
			}
			else {
				if(nums[nums.length-1]!=val) {
					nums[nums.length-c]=nums[nums.length];
					k++;
				}
			}
		}
		
		for(int i=0;i<k;i++) {
			System.out.print(nums[i]);
		}
		return k;
	}

}