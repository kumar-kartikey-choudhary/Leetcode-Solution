package in.leetcode;

public class ReverseVowels {

	private static String reverseVowels(String s) {
		// TODO Auto-generated method stub
		char[] ch = s.toCharArray();
		String vowels = "AEIOUaeiou";
		int start = 0 , end = ch.length-1;
		while(start < end)
		{
			while(start < end && vowels.indexOf(ch[start]) == -1)
			{
				start++;
			}
			while(start < end && vowels.indexOf(ch[end]) == -1)
			{
				end--;
			}
			char chars = ch[start];
			ch[start] = ch[end];
			ch[end] = chars;
			start++;
			end--;
		}
		return new String(ch);
		
	}

	public static void main(String[] args) {
		String s = "hello";
		System.out.println(reverseVowels(s));;
	}

}
