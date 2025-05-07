package in.leetcode;

import java.util.Arrays;

public class MaxCountOfPosAndNegNo {


	private static int maximumCount(int[] nums) {
		// TODO Auto-generated method stub
		int posCount = 0 , negCount =0;
		Arrays.sort(nums);
		for(int i =0 ; i < nums.length; i++)
		{	
			if(nums[i] < 0)
				negCount++;
			else if(nums[i] > 0)
				posCount ++;
		}
		
		return Math.max(posCount, negCount);
		
	}

	
	public static void main(String[] args) {
		int[] nums = {-2,-1,-1,1,2,3,4};
		System.out.println(maximumCount(nums));;
	}
}
