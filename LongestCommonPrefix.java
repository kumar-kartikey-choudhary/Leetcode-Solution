package in.leetcode;

import java.util.Scanner;

public class LongestCommonPrefix {

	public String longestCommonPrefix(String[] str)
	{
		if(str.length == 0 || str == null)
		{
			return "Your String is Empty";
			
		}
		for(int  i = 0 ; i < str[0].length() ; i++)
		{
			char ch = str[0].charAt(i);
			for(int  j = 1 ; j < str.length ; j++)
			{
				if(i == str[j].length() || str[j].charAt(i) != ch)
					return str[0].substring(0,i);
			}
		}
		return  str[0];
	}
	
	public static void  main(String [] args)
	{
		LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size in String array : ");
		int size = sc.nextInt();
	
		String[] nums = new String[size];
		
		System.out.println("Enter values in String array: ");
		for(int i = 0 ; i < size ; i++)
		{
			nums[i] = sc.next();
		}
		
		System.out.println("Values in String array: ");
		for (int i = 0; i < size; i++) {
			System.out.println(nums[i]+" ");
		}
		System.out.println("======================");
		
		System.out.println("Longest Common Prefix :-"+longestCommonPrefix.longestCommonPrefix(nums));
	}
}
