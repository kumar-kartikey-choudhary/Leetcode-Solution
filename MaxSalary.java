package in.leetcode;

public class MaxSalary {
	private static double maxSalary(int[] salary) {
		// TODO Auto-generated method stub
		int currSum = 0;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		for(int i = 0 ; i < salary.length ; i++)
		{
			min = Math.min(min, salary[i]);
			max = Math.max(max, salary[i]);
			 currSum += salary[i];
		}
		
		double resSum = currSum - min - max ;
		int newLength = salary.length -2 ;
		double avg = resSum / newLength ;
		
		return avg;
	}

	
	public static void main(String[] args) {
		
		int [] salary = { 4000,3000,1000,2000, 5000};
		
		System.out.print(maxSalary(salary));
	}

}
