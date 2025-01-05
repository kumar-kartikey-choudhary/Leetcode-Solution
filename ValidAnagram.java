package in.leetcode;

import java.util.Scanner;

public class ValidAnagram {

	public boolean isAnagram(String s, String t)
	{
		if(s.length() != t.length() || s == null || t == null)
		{
			return false;
		}
		int count[] = new int[26];
		for(int i = 0 ; i < s.length() ; i++)
		{
			char ch = s.charAt(i);
			count[ch - 'a']++;
		}
		
		for(int i = 0 ; i < t.length() ; i++)
		{
			char ch = t.charAt(i);
			count[ch - 'a']--;
		}
		
		for(int i = 0 ; i < count.length ; i++)
		{
			if(count[i] > 0)
			{
				return false;
			}
		}
		return true;
	}
	
	public static void main(String [] args)
	{
		ValidAnagram validAnagram = new ValidAnagram();
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter values in  first string");
		String s = sc.next();
		
		
		System.out.println("Enter values in Second string");
		String t = sc.next();
		
		
		System.out.println("Given string is Anagram : " + validAnagram.isAnagram(s, t));
	}
}
