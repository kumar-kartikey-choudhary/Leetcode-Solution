package in.leetcode;

public class TwoStringEquivalent {

	private static boolean arrayStringAreEquivalent(String[] str1, String[] str2) {
		// TODO Auto-generated method stub
		 StringBuilder sb1 = new StringBuilder();
		 StringBuilder sb2 = new StringBuilder();
		
		 for(String word : str1)
		 {
			 sb1.append(word);
		 }
		 for(String word : str2)
		 {
			 sb2.append(word);
		 }
		 
		 if(sb1.toString().equals(sb2.toString()))
			return true;
			
		return false;
	}


	public static void main(String[] args) {
		String str1[] = {"ab", "c"};
		String str2[] = {"a", "bc"};
		
		System.out.println(arrayStringAreEquivalent(str1,str2));;
	}
}
