package in.leetcode;

public class RunningSum {
	
	private static int[] runningSum(int[] nums) {
		
		int sum = 0 ;
	    
	    for(int i = 1 ; i < nums.length ; i++)
	    {
	    	sum = nums[i] + nums[i-1];
	    	nums[i] = sum;
	    }
		return nums;
	}
	

	public static void main(String[] args) {
		int nums[] = { 1, 2, 3, 4};
		
		int output[]  = runningSum(nums);
		for(int sum : output)
		{
			System.out.print(sum + " ");
		}
	}

}
