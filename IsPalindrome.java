package in.leetcode;

public class IsPalindrome {
	
	
	private static boolean isPalindrome(int num) {
		// TODO Auto-generated method stub
		if(num < 0)
			return false;
		int temp = num ;
		int retun =0;
		while(num != 0)
		{
			int r = num % 10;
			retun = retun *10 + r;
			num = num /10;
		}
		
		if(temp == retun)
			return true;
		return false;
	}

	
	public static void main(String[] args) {
		int num = 1211;
		System.out.println(isPalindrome(num));;
	}
}
