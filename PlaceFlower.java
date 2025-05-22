package in.leetcode;

public class PlaceFlower {

	private static boolean canPlaceFlower(int[] flowerBed , int n) {
		// TODO Auto-generated method stub
		
		for(int i = 1 ; i < flowerBed.length; i++)
		{
			if(flowerBed[i] != 1 && flowerBed[i-1] != 1 && flowerBed[i +1] != 1)
			{
				flowerBed[i] = 1;
				n--;
			}
		}
		if(n == 0)
			return true;
		
		return false;
	}

	
	public static void main(String[] args) {
		int flowerBed[] = {1,0,0,0,0,1};
		
		System.out.println(canPlaceFlower(flowerBed , 2));;
		
	}
}
