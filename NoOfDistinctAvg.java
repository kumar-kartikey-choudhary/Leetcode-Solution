package in.leetcode;

import java.util.*;

public class NoOfDistinctAvg {


	private static int distinctNumber(int[] nums) {
		// TODO Auto-generated method stub
		Set<Integer> set = new HashSet<>();
		Arrays.sort(nums);
		int left = 0 , right = nums.length -1;
		while(left < right)
		{
			int sum = nums[left] + nums[right]; 
			set.add(sum);
			left ++;
			right--;
		}
		return set.size();
		
	}

	
	public static void main(String[] args) {
		int [] nums = {4,1,4,0,3,5};
		System.out.println(distinctNumber(nums));;
	}
}
