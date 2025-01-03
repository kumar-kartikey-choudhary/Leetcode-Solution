package in.leetcode;

import java.util.*;

public class MajorityElement {

	public int majorityElement(int[] nums) {
		Map<Integer , Integer> map = new HashMap<>();
		for(int i = 0 ; i < nums.length ; i++)
		{
			if(map.containsKey(nums[i]))
			{
				map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
			}
			else
			{
				map.put(nums[i], 1);
			}
		}
		
		int majority = (nums.length / 2);
		int result = 0;
		for(Map.Entry<Integer, Integer> entry : map.entrySet())
		{
			if(entry.getValue() > majority)
			{
				result = entry.getKey();
			}
		}
		return result;
	}
	
	
	public static void main(String[] args)
	{
		MajorityElement majorityElement = new MajorityElement();
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
		System.out.println("Majority Element is: "+ majorityElement.majorityElement(nums) );
	}
}
