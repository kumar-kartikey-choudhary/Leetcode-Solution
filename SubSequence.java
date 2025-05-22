package in.leetcode;

public class SubSequence {


	private static boolean isSubSequence(String s, String t) {
		// TODO Auto-generated method stub
		if(s == null || s.equals(""))
			return false;
		
		int index =0;
		for(int i = 0 ; i < t.length() ; i++)
		{
			if(s.charAt(index) == t.charAt(i))
				index++;
		}
		if(index == s.length())
			return true; 
		
		return false;
		
	}

	
	public static void main(String[] args) {
		
		String s = "abc";
		String t = "ahbgdc";
		
		System.out.println(isSubSequence(s,t));;
	}
}
