package in.leetcode;

public class FindChampion {

	private static int findChampion(int[][] grid) {
		// TODO Auto-generated method stub
		int row = grid.length;
		int col = grid[0].length;
		for(int i = 0 ; i < row; i++)
		{
			int count  = 0;
			for(int j = 0 ; j < col ; j++)
			{
				if(grid[i][j] == 1)
					count++;
				if(count == grid.length-1 )
					return i;
			}
		}
		return -1;
		
	}
	
	public static void main(String[] args) {
		int grid[][] = {{0,0},{1,0}};
		System.out.println(findChampion(grid));;
	}
}
