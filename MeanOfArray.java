package in.leetcode;

import java.util.Arrays;

public class MeanOfArray {
	
	
	private static double trimMean(int[] arr) {
		// TODO Auto-generated method stub
		int len = arr.length;
		Arrays.sort(arr);
		
		double limit = .05 * len;
		
	int start = (int)limit;
	int end = len - (int)limit;
	int sum = 0 , newLength = 0;
	for(int i = start ; i < end ; i++)
	{
		sum += arr[i];
		newLength ++;
	}
		
	double avg = sum / newLength;
	
	return avg;
	}
	
	public static void main(String[] args) {
		
		int [] arr = {6,2,7,5,1,2,0,3,10,2,5,0,5,5,0,8,7,6,8,0};
		
		System.out.println(trimMean(arr));;
	}

}
