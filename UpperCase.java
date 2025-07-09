package String;

// for a given String convert the first letter of each word to uppercase

public class UpperCase {
	
	private static String toUpperCase(String str)
	{
	StringBuilder sb = new StringBuilder("");
//	if(str.charAt(0) == ' ')
//	{
//		sb.append(str.charAt(0));
//	}
//	else
//		sb.append(Character.toUpperCase(str.charAt(0)));
		
		for(int i = 1 ; i < str.length() ; i++)
		{
			if(str.charAt(i) == ' ' && i< str.length())
			{
				sb.append(str.charAt(i));
				i++;
				sb.append(Character.toUpperCase(str.charAt(i)));
			}
			else
			{
				sb.append(str.charAt(i));
			}
		}
		return sb.toString();
	}
	
	public static void main(String[] args)
	{
		String str = "hi, i am kartikey";
		System.out.println(toUpperCase(str));
	
	}

}
