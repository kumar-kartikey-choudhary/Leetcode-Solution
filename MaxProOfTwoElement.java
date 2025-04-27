package in.leetcode;

import java.util.Arrays;

public class MaxProOfTwoElement {

	private static int maxProduct(int[] nums) {
		Arrays.sort(nums);
		int firstMax = nums[nums.length -1];
		int secondMax = nums[nums.length - 2];
		int result = (firstMax-1) * (secondMax-1);
		
		return result;	
	}
	
	public static void main(String[] args) {
		
		int nums []  = { 3,5,4,2,1};
		
		System.out.println(maxProduct(nums));
	}

	
}
