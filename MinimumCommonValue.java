package in.leetcode;
import java.util.*;

import java.util.Arrays;

public class MinimumCommonValue {


	private static int getCommon(int[] num1, int[] num2) {
		// TODO Auto-generated method stub
		Arrays.sort(num1);
		Arrays.sort(num2);
		Set<Integer> set = new HashSet<>();
		
		for(int num : num1)
		{
			set.add(num);
		}
		for(int num : num2)
		{
			if(set.contains(num))
				return num;
		}
		
		return -1;
	}

	
	public static void main(String[] args) {
		int num1[] = {1,2,3,};
		int num2[] = {2,3};
		
		System.out.println(getCommon(num1 , num2));;
	}
}
