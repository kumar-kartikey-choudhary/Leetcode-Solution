package in.leetcode;

public class CountNegativeInSorted {

	
	
	private static int countNegatives(int[][] nums) {
		// TODO Auto-generated method stub
		int count = 0 ;
		int totalRows = nums.length ;
		int totalCols = nums[0].length;
		int row = 0 , cols = totalCols - 1;
		
		while(row < totalRows && cols >= 0)
		{
			if(nums[row][cols] < 0 )
			{
				cols--;
				count += totalRows - row ;
			}
			else
				row++;
		}
		
		return count;
	}
	
	
	public static void main(String[] args) {
		int[][] nums = {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-2,-3,-4}};
		
		System.out.println(countNegatives(nums));
	}

}
