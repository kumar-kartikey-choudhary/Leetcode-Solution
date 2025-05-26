package in.leetcode;

import java.util.Arrays;

public class MaximumProductDifference {


	private static int maxProductDifference(int[] nums) {
		// TODO Auto-generated method stub
		Arrays.sort(nums);
		
	  int minPro = nums[0] * nums[1];
	  int maxPro = nums[nums.length-1] * nums[nums.length-2];
	  
	  int result = maxPro - minPro;
	  
	  return result;
		
	}

	
	public static void main(String[] args) {
		int nums[] = {5,6,2,7,4};
		System.out.println(maxProductDifference(nums));;
	}
}
