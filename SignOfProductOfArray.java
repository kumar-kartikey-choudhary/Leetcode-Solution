package in.leetcode;

public class SignOfProductOfArray {
	

	private static int arraySign(int[] nums) {
		int negCount = 0;
		for(int i = 0 ; i < nums.length ; i++)
		{
			if(nums[i] == 0)
				return 0;
			
			if(nums[i] < 0)
				negCount++;
		}
		
		if(negCount %2 ==0)
			return 1;
		
		return -1;
	}
	
	public static void main(String[] args) {
		int [] nums = { -1,-3,-4,-5,2,5,};
		System.out.println(arraySign(nums));
	}
}
