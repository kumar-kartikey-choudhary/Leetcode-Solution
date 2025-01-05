package in.leetcode;

import java.util.Scanner;

public class MoveZeroes {

	public void moveZeroes(int[] nums)
	{
		int index = 0; 
		for(int i = 0 ; i < nums.length ; i++)
		{
			if(nums[i] != 0)
			{
				nums[index] = nums[i];
				index++;
			}
		}
		for(int i = index ; i < nums.length ; i++)
		{
			nums[i] = 0;
		}
		
		for (int  i : nums)
		{
			
			System.out.print("After moving zeroes to right : "+i + " ");
		}
	}
	
	public static void main(String [] args)
	{
		MoveZeroes moveZeroes = new MoveZeroes();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of array : ");
		int size = sc.nextInt();
		
		int[] nums = new int[size];
		System.out.println("Enter the elements in array: ");
		for( int i = 0 ; i < size ; i++)
		{
			nums[i] = sc.nextInt();			
		}
		moveZeroes.moveZeroes(nums);
	}
}
