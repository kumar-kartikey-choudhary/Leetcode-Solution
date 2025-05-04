package in.leetcode;

public class CapitaliseTitle {


	private static String capitalizeTitle(String title) {
		// TODO Auto-generated method stub
		title = title.toLowerCase();
		String[] words = title.split(" ");
		StringBuilder sb = new StringBuilder();
		for(int i = 0 ; i < words.length ; i++)
		{
			if(words[i].length() < 3)
			{
				sb.append(words[i]+" ");
			}
			else
			{
				char ch = words[i].charAt(0);
				ch = Character.toUpperCase(ch);
				String new_word = ch + words[i].substring(1);
				sb.append(new_word+" ");
			}
		}
		return sb.toString().trim();
		
	}
	
	public static void main(String[] args) {
		String title = "capitalize he title";
		System.out.println(capitalizeTitle(title));;
	}

}
