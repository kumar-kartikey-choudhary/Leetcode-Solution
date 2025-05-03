package in.leetcode;

public class SmallestIndexWithEqualValue {


	private static int smallestEqual(int[] nums) {
		// TODO Auto-generated method stub
		int index = -1;
		for(int i = 0 ; i< nums.length ; i++)
		{
			if(i % 10 ==nums[i])
			{
				index = i;
				break;
			}
		}
		return index;
		
	}
	
	public static void main(String[] args) {
		int [] nums = {4,3,2,1,5};
		System.out.println(smallestEqual(nums));;
	}

}
