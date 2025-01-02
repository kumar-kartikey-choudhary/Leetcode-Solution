package in.leetcode;

import java.util.Scanner;

public class StringPalindrome {

	public boolean isPalindrome(String s)
	{
		StringBuilder sb = new StringBuilder();
		for(int i = 0 ; i  < s.length() ; i++)
		{
			char ch = s.charAt(i);
			if(Character.isLetter(ch) || Character.isDigit(ch))
			{
				sb.append(ch); 
			}
		}
		String result = sb.toString();
		result = result.toLowerCase();
		if(checkPalindrome(result))
		{
			return true;
		}
		return false;
	}

	private boolean checkPalindrome(String result) {
		int left = 0 ; 
		int right = result.length()-1;
		while(left < right)
		{
			if(result.charAt(left) == result.charAt(right))
			{
				return true;
			}
			left-- ;
			right++;
		}
		return false;
	}
	
	public static void main(String[] args)
	{
		StringPalindrome validPalindrome = new StringPalindrome();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of strings");
		String str = sc.nextLine();
		
		System.out.println("Given String is palindrome :"+ validPalindrome.isPalindrome(str));
		
		
	}
}
