package Lec_07;

public class array_demo {

	public static void main(String[] args) {

		int[] arr = new int[10];
		int j = 1;
		for (int i = 0; i <= arr.length-1; i++) {

			arr[i] = 2 * j;
			j++;
			System.out.println(arr[i]);
		}
		
	}

}
