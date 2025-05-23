package in.leetcode;

public class GreatestCommonDivisor {


	private static String gcdOfStrings(String str1, String str2) {
		// TODO Auto-generated method stub
		int len1 = str1.length() , len2 = str2.length();
		if(!(str1+str2).equals(str2+str1))
			return "";
		String result = str1.substring(0,gcd(len1,len2));
		return result;
	}

	private static int gcd(int len1, int len2) {
		// TODO Auto-generated method stub
		if(len2 == 0)
			return len1;
		
		return gcd(len2, len1 % len2);
	}

	public static void main(String[] args) {
		String str1 = "ABCABC";
		String str2 = "ABC";
		
		System.out.println(gcdOfStrings(str1, str2));;
	}
}
