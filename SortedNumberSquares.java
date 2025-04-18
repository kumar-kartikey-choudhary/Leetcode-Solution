package in.leetcode;

public class SortedNumberSquares {

	

	private static int[] sortedSquares(int[] nums) {
		
		int[] squares = new int[nums.length];
		
		//first method
		
//		for(int i = 0; i < nums.length ; i++)
//		{
//			squares[i] = nums[i]*nums[i];
//		}
//		
//		for(int i = 0; i < squares.length -1 ; i++)
//		{
//			for(int j = 0; j < squares.length -1-i ; j++)
//			{
//				if(squares[j] > squares[j+1])
//				{
//					int temp = squares[j];
//					squares[j] = squares[j+1];
//					squares[j+1] = temp;
//				}
//			}
//			
//		}
		
		//Second method
		int i = 0;
		int j = nums.length -1;
		
		for(int k = squares.length-1 ;  k >= 0; k--)
		{
			int leftSquare = nums[i] * nums[i];
			int rightSquare = nums[j] * nums[j];
			if(leftSquare > rightSquare)
			{
				squares[k] = leftSquare;
				i++;
			}
			else
			{
				squares[k] = rightSquare;
				j--;
			}
		}

		return squares;
	}
	
	
	public static void main(String[] args) {
		
		int nums[] = {-4,-1,0,3,10};
		int[] result = sortedSquares(nums);
		
		for(int res : result)
		{
			System.out.print(res+" ");
		}
	}

}
