package in.leetcode;

import java.util.*;

public class ContainDuplicates {

	public boolean containsDuplicate(int[] nums)
	{
		Set<Integer> set = new HashSet<>();
		for(int i= 0 ; i< nums.length ; i++)
		{
			if(set.contains(nums[i]))
			{
				return true;
			}
			else
			{
				set.add(nums[i]);
			}
		}
		return false;
		
	}
	
	public static void main(String[] args)
	{
		ContainDuplicates containDuplicates = new ContainDuplicates();
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = sc.nextInt();
		
		
		int[] nums = new int[size];
		System.out.println("Enter the elements in array");
		
		for(int i = 0; i < size; i++)
		{
			nums[i] =sc.nextInt();
		}
		
		
		System.out.println("elements in array : ");
		for(int i = 0 ; i < size ; i++)
		{
			System.out.println(nums[i]);
		}
		
		System.out.println("----------------------");
		System.out.println("Duplicate values are present :  "+containDuplicates.containsDuplicate(nums));
		
	}
}
