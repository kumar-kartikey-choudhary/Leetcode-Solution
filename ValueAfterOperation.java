package in.leetcode;

public class ValueAfterOperation {


	private static int findValueAfterOperation(String[] operation) {
		// TODO Auto-generated method stub
		int x = 0;
		for(String word : operation)
		{
			if(word.equals("++x") ||word.equals("x++"))
			{
				x++;
			}
			if(word.equals("--x") ||word.equals("x--"))
			{
				x--;
			}
		}
		return x;
	}
	
	
	public static void main(String[] args) {
		String [] operation = {"++x" , "x++" , "x++"};
		System.out.println(findValueAfterOperation(operation));;
	}

}
