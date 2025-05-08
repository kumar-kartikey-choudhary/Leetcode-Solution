package in.leetcode;

public class ArrayConcatenationValue {


	private static long concatenateValue(int[] nums) {
		// TODO Auto-generated method stub'
		long result = 0;
		int left = 0 , right = nums.length -1 ;
		while(left < right)
		{
			String val = String.valueOf(nums[left] )+ String.valueOf(nums[right]);
			result += Long.parseLong(val);
			left++;
			right--;
		}
		return (nums.length % 2 == 0) ? result : result + Long.valueOf(left);
		
	}

	
	public static void main(String[] args) {
		int nums[] = {7,52,2,4};
		System.out.println(concatenateValue(nums));;
	}
}
