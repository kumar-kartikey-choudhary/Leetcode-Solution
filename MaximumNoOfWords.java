package in.leetcode;

public class MaximumNoOfWords {

	private static int mostWordsFound(String[] sentence) {
		// TODO Auto-generated method stub
		int maxWord = 0 ; 
		for(String s : sentence)
		{
			int count = 0 ; 
			String[] words = s.split(" ");
			count = words.length;
			maxWord = Math.max(count, maxWord);		
		}
		return maxWord;
		
	}

	
	public static void main(String[] args) {
		String[] sentence = {"alice and bob love leetcode","i think so too","this is great thanks very munch"};
		
		System.out.println(mostWordsFound(sentence));;
	}

}
