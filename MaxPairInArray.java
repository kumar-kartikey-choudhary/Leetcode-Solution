package in.leetcode;

public class MaxPairInArray {


	private static int maxSum(int[] nums) {
		// TODO Auto-generated method stub
		int max= -1;
		for(int i =0; i < nums.length; i++)
		{
			for(int j= i+1; j < nums.length ; j++)
			{
				if(maxOfDigitInNum(nums[i]) == maxOfDigitInNum(nums[j]))
					max = Math.max(max, (nums[i] + nums[j]));
			}
		}
		return max;
		
	}
	private static int maxOfDigitInNum(int i) {
		// TODO Auto-generated method stub
		int maxDigit = 0;
		while(i != 0)
		{
			if(i%10 > maxDigit)
				maxDigit = i % 10;
			 i = i /10;
		}
		
		return maxDigit;
	}


	public static void main(String[] args) {
		 int nums[] = {51,71,17,24,42};
		System.out.println( maxSum(nums));;
	}
}
