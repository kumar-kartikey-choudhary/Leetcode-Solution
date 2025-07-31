package backtracking;

public class PermutationOfString {

	private static void findPermutation(String str, String ans) {
		// TODO Auto-generated method stub
		// base case
		if(str.length() == 0)
		{
			System.out.println(ans);
			return;
		}
		
		
		//recursion
		for(int i = 0 ; i < str.length() ; i++)
		{
			char curr = str.charAt(i);
			String str1 = str.substring(0,i) + str.substring(i+1);
			findPermutation(str1,ans+curr);
		}
		
	}


	
	public static void main(String[] args) {
		String str = "abc";
		findPermutation(str,"");
	}
}
