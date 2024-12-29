package in.leetcode;

import java.util.Scanner;

public class Palindrome {

	public boolean isPalindrome(int num)
	{
		if(num < 0 )
		{
			return false;
		}
		String str = num+"";
		return checkPalindrome(str);
	}

	private  boolean checkPalindrome(String str) {

		int left = 0 ;
		int right = str.length()-1;
		while(left < right)
		{
			if(str.charAt(left) != str.charAt(right))
			{
				return false;
			}
			left++;
			right--;
		}
		return true;
	}
	
	public static void main(String [] args)
	{
		Palindrome palindrome = new Palindrome();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check it is palindrome or not");
		int num = sc.nextInt();
		
		System.out.println("Answer: "+palindrome.isPalindrome(num));
		
	}
}
