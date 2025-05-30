package in.leetcode;

public class CountingWordsWithGivenPrefix {



	private static int prefixCount(String[] words, String prefix) {
		// TODO Auto-generated method stub
		
		int count = 0 ;
		for(int  i =  0 ; i  < words.length ; i++)
		{
			if(words[i].length() >= prefix.length())
			{
				String checkPrefix = words[i].substring(0, prefix.length());
				if(prefix.equals(checkPrefix))
				{
					count++;
				}
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		String[] words = {
				"play","attend","practice","attention"
		};
		String prefix = "at";
		
		System.out.println(prefixCount(words, prefix));;
		
	}
}
