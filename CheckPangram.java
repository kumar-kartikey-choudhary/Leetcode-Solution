package in.leetcode;
import java.util.*;

public class CheckPangram {
	


	private static boolean checkPangram(String sentence) {
		// TODO Auto-generated method stub
		Set<Character> set  = new HashSet<>();
		for(int i = 0 ; i < sentence.length() ;  i ++)
		{
			char ch = sentence.charAt(i);
			if(!set.contains(ch))
			{
				set.add(ch);
			}
		}
		if(set.size() == 26)
		{
			return true;
		}
		return false;
		
	}

	public static void main(String[] args) {
		
		String sentence = "qwereewwwwtyuiopasdfghjklzxcvbnm";
		System.out.println(checkPangram(sentence));;
	}
}
