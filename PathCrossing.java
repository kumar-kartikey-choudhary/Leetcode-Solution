package in.leetcode;
import java.util.*;
public class PathCrossing {
	

	private static boolean isPathCrossing(String path) {
		// TODO Auto-generated method stub
		int x = 0  , y = 0;
		Set<String> set = new HashSet<>();
		set.add(x+","+y);
		
		for(char ch : path.toCharArray())
		{
			if(ch =='N')
			{
				y++;
			}
			if(ch =='S')
			{
				y--;
			}
			if(ch =='E')
			{
				x++;
			}
			if(ch =='W')
			{
				x--;
			}
			
			String coordinate = x+","+y;
			if(set.contains(coordinate))
				return true;
			set.add(coordinate);
		}
		
		return false;
	}

	
	public static void main(String[] args) {
		String path = "NESW" ;
		
		System.out.println(isPathCrossing(path));;
	}
}
