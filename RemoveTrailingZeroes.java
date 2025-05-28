package in.leetcode;

public class RemoveTrailingZeroes {


	private static String removeTrailingZero(String num) {
		// TODO Auto-generated method stub
		int i = num.length()-1;
		for(; i>=0 ; i--)
		{
				if(num.charAt(i) != '0')
				{
					break;
				}
		}
		return num.substring(0,i+1);
		
	}
	
	public static void main(String[] args) {
		String num = "51230100";
		System.out.println(removeTrailingZero(num));;
	}

}
