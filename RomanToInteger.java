package in.leetcode;
import java.util.*;

public class RomanToInteger {
	
	public int romanToInteger(String s)
	{
		Map<Character ,Integer> map = new HashMap<>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		
		char chars[] = s.toCharArray();
		 int i , j ,result =0;
		  for (i=0 , j=1 ; j < chars.length ; i++, j++)
		  {
			  if(map.get(chars[i]) >= map.get(chars[j]))
				  result += map.get(chars[i]);
			  else
				  result -= map.get(chars[i]);
		  }
		  result += map.get(chars[i]);
		  return result;	
	}
	public static void main(String [] ags)
	{
		RomanToInteger romanToInteger = new RomanToInteger();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string of I,V,X,L,C,D,M to convert it into integer");
		String s = sc.next();
		
		System.out.println("Roman Number " + s + " to Integer Number: "+ romanToInteger.romanToInteger(s));
	}
	

}
