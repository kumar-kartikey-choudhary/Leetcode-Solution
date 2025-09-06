package greedy;
import java.util.*;

public class IndianCoins {

    public static void main(String[] args) {
    	Integer coins[] = {1,2,5,10,20,50,100,500,2000};
    	
    	Arrays.sort(coins, Comparator.reverseOrder());
    	
    	int amount = 590;
    	int countOfCoins = 0;
    	
    	List<Integer> ans = new ArrayList<>();
    	
    	for(int i = 0 ; i < coins.length ; i ++)
    	{
    		if(coins[i] <= amount)
    		{
    			while(coins[i] <= amount)
    			{
    				countOfCoins++;
    				ans.add(coins[i]);
    				amount -= coins[i];
    			}
    		}
    	}
    	
    	System.out.println("Max number of coins "+ countOfCoins);
    	for(Integer s : ans)
    	{
    		System.out.print(s+" ");
    	}
    	System.out.println();
		
	}
}
