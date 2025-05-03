package in.leetcode;

public class PlusOne {

	private static int[] plusOne(int[] nums) {
		// TODO Auto-generated method stub
		int len = nums.length -1;
		for(int i = len ; i >= 0 ; i--)
		{
		
			if(nums[i]< 9)
			{
				nums[i]++;
				return nums;
			}
			nums[i] = 0;	
		}
		
		int res[]  = new int[len + 2];
		res[0] = 1;
		
		return res;
		
	}

	
	public static void main(String[] args) {
		int [] nums = {1,9,9};
		for(int i : plusOne(nums))
		{
			System.out.print(i+" ");
		}
	}
}
