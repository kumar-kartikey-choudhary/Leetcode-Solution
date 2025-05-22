package in.leetcode;

public class RemoveElements {

	private static int removeElement(int[] nums, int val) {
		// TODO Auto-generated method stub
		
		int len = nums.length , i = 0;
		while( i < len)
		{
			if(nums[i] == val)
			{
				nums[i] = nums[len-1];
				len--;
			}
			else
				i++;
		}
		return len;
	}
	
	public static void main(String[] args) {
		
		int nums[] = { 0, 1,2,2,3,0,4,2};
		int val = 2;
		System.out.println(removeElement(nums , val));;
	}
}
