package in.leetcode;

public class LongerContiguousOnesAndZeros {


	private static boolean checkZeroOnes(String binaryString) {
		// TODO Auto-generated method stub
		int zero = 0 , one = 0 , maxZero = 0 , maxOne = 0;
		
		for(int i = 0 ; i < binaryString.length(); i++)
		{
			if(binaryString.charAt(i) == '0')
			{
				zero++;
				one = 0;
				maxZero = Math.max(maxZero, zero);
			}
			else
			{
				one ++;
				zero = 0;
				 maxOne = Math.max(maxOne, one);
			}
		}
		if(maxZero < maxOne)
			return true;
			
		return false;
		
	}

	
	public static void main(String[] args) {
		String binaryString = "1101001";
		System.out.println(checkZeroOnes(binaryString));;
	}
}
