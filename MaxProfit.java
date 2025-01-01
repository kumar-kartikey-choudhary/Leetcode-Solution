package in.leetcode;

import java.util.Scanner;

public class MaxProfit {

	public int maxProfit(int[] prices)
	{
		int min = Integer.MAX_VALUE;
		int maxProfit = 0 ;
		
		
		for(int i = 0 ; i < prices.length;  i++)
		{
			if(prices[i] < min)
			{
				min = prices[i];
				System.out.println( " min of: " + i + " is :" + min);
			}
			
			System.out.println("--------------------------");
			int currentProfit = prices[i] - min;
			
			if(currentProfit > maxProfit)
			{
				System.out.println( " maxProfit of: " + i + " is :" + maxProfit);
				maxProfit = currentProfit;
			}
		}
		return maxProfit;
	}
	
	public static void main(String [] args )
	{
		
		MaxProfit maxProfit = new  MaxProfit();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size in array : ");
		int size = sc.nextInt();
	
		int[] nums = new int[size];
		
		System.out.println("Enter elements in array: ");
		for(int i = 0 ; i < size ; i++)
		{
			nums[i] = sc.nextInt();
		}
		
		
		System.out.println("elements in array: ");
		for (int i = 0; i < size; i++) {
			System.out.println(nums[i]+" ");
		}
		
		System.out.println("--------------------------");
		 try {
	            int result = maxProfit.maxProfit(nums);
	            System.out.println("MaxProfit :" + result );
	        } catch (IllegalArgumentException e) {
	            System.out.println(e.getMessage());
	        }
		
	}
}
