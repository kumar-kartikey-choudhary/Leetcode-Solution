package backtracking;

public class ArrayBacktracking {

	private static void changeArr(int[] arr, int i, int val) {
		// TODO Auto-generated method stub
		if(i == arr.length)
		{
			print(arr);
			return;
		}
		
		//recursion
		arr[i] = val;
		changeArr(arr,i+1,val+1); // fnx call step
		
		arr[i] = arr[i]-2;  // this is for backtracking
		
	}

	
	private static void print(int[] arr) {
		// TODO Auto-generated method stub
		for(int i : arr)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		
	}


	public static void main(String[] args) {
		int arr[] = new int[5];
		changeArr(arr,0,1);
		print(arr);
	}

}
