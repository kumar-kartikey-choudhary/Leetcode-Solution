package in.leetcode;

public class MaximumScore {

	private static int maxScore(String s) {
		// TODO Auto-generated method stub
		int ans = 0;
		for(int i = 0 ; i < s.length()-1 ; i++)
		{
			int curr = 0;
			for(int j = 0 ; j <= i; j++)
			{
				if(s.charAt(j) == '0')
				{
					curr++;
				}
			}
			for(int j = i+1 ; j < s.length(); j++)
			{
				if(s.charAt(j) == '1')
				{
					curr++;
				}
			}
			ans = Math.max(ans, curr);	
		}	
		return ans;
	}
	
	public static void main(String[] args) {
		
		String s = "011101";
		System.out.println(maxScore(s));;
	}
}