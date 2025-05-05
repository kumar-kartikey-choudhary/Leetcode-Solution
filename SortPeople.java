package in.leetcode;
import java.util.*;
public class SortPeople {


	private static String[] sortPeople(String[] name, int[] height) {
		// TODO Auto-generated method stub
		Map<Integer , String > map = new LinkedHashMap<>();
		if(height.length != name.length)
			return null;
		for(int i = 0; i < name.length ; i++)
		{
			if(!map.containsKey(height[i]))
				map.put(height[i], name[i]);
		}
		
		Arrays.sort(height);
		String sortedName [] = new String[name.length];
		int index = 0;
		for(int i = height.length -1; i >= 0 ; i--)
		{
			 sortedName[index] = map.get(height[i]);
			 index++;
		}
		
		return sortedName;
			
		
	}

	
	


	public static void main(String[] args) {
		String name [] = {"Marry", "John", "Emma"};
		int[] height = {180, 165, 170};
		
		for(String s : sortPeople(name, height))
		{
			System.out.println(s);
		}
	}
}
