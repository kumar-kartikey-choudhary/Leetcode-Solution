package in.leetcode;
import java.util.*;

public class MinimumOperationToCollectElements {

	private static int minOperation(List<Integer> nums, int key) {
		// TODO Auto-generated method stub
		int count= 0 ;
		Set<Integer> set = new HashSet<>();
		for(int  i = 1; i <= key; i++ )
		{
			set.add(i);
		}
		for(int i = nums.size() -1; i >= 0 ; i-- )
		{
			count++;
			if(set.contains(nums.get(i)))
			{
				set.remove(nums.get(i));
				if(set.isEmpty())
					break;
			}
		}
		
		return count;
		
	}
	 
	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<>();
		nums.add(3);
		nums.add(1);
		nums.add(5);
		nums.add(4);
		nums.add(2);
		
		System.out.println(minOperation(nums , 2));
	}

}
