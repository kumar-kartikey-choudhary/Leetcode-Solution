package in.leetcode;

public class LeftAndRightSumDifference {


	private static int[] leftRightDifference(int[] nums) {
		// TODO Auto-generated method stub
		int [] answer = new int[nums.length];
		int leftSum[] = new int[nums.length] , rightSum[] = new int[nums.length];
		leftSum[0]=  0;
		rightSum[nums.length - 1] = 0;
		int l_index = 1 ,r_index = 0;
		
		for(int i = 1 ; i < nums.length; i++)
		{
			leftSum[l_index++] = sumOfArray(nums , 0 , i - 1);
		}
		for(int i = 0 ; i < nums.length; i++)
		{
			rightSum[r_index++] = sumOfArray(nums , i + 1 , nums.length - 1);
		}
		
		for(int i = 0 ; i < answer.length; i++)
		{
		   answer[i] = Math.abs(rightSum[i] - leftSum[i]);
		}
		
		return answer;
	}

	
	
	private static int sumOfArray(int[] nums, int i, int j) {
		// TODO Auto-generated method stub
		int sum = 0;
		for(int k = i ; i<= j ; k++)
		{
			sum += nums[k];
		}
		return sum;
	}



	public static void main(String[] args) {
		int[] nums = {10,4,8,3};
		int num[] = leftRightDifference(nums);
		for(int i = 0 ; i<nums.length ; i++)
		{
			System.out.println(i);
		}
	}
}
