package in.leetcode;
import java.util.*;

public class EqualNoOfOccurenece {



	private static boolean areOcuurence(String s) {
		// TODO Auto-generated method stub
		Map<Character, Integer> map = new HashMap<>();
		
		for(int  i = 0 ; i < s.length() ; i++)
		{
			if(map.containsKey(s.charAt(i)))
			{
				map.put(s.charAt(i), map.get(s.charAt(i))+1);
			}
			else
			{
				map.put(s.charAt(i), 1);
			}
		}
		Set<Integer> set = new HashSet<>(map.values());
		if(set.size() == 1)
			return true;
		
		return false;
		
	}
	
	public static void main(String[] args) {
		String s = "aabbcc";
		
		System.out.println(areOcuurence(s));;
	}
}
