package in.leetcode;

public class PercentageOfLetterInString {


	private static int percentageLetter(String s, char letter) {
		// TODO Auto-generated method stub
		int count[] = new int[26];
		int len = s.length();
		
		for(int i = 0; i< s.length() ; i++)
		{
			count[s.charAt(i)-'a']++;
		}
		int freq = count[letter - 'a'];
		int percentage  =  (freq * 100) / len;
		return percentage;
		
	}

	public static void main(String[] args) {
		String s = "footbar";
		char letter = 'o';
		System.out.println(percentageLetter(s,letter));;
	}
}
