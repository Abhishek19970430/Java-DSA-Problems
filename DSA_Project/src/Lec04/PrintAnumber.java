package Lec04;

import java.util.*;

public class PrintAnumber {

	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		long N = s.nextLong();
		long[] arr = new long[(int) (N)];
		long SumO = 0;
		long SumE = 0;
		int i = 0;
		for (i = 0; i < N; i++) {
			arr[i] = s.nextLong();
		}
		i = 0;

		while (i < N) {
			SumE=0;
			SumO=0;
			while (arr[i] > 0) {

				if ((arr[i] % 10) % 2 == 0) {
					SumE = SumE + (arr[i] % 10);
					arr[i] = arr[i] / 10;
				} else {
					SumO = SumO + arr[i] % 10;
					arr[i] = arr[i] / 10;
				}

			}

			if (SumE % 4 == 0 || SumO % 3 == 0) {
				System.out.println("Yes");
			} else {
				System.out.println("No");

			}
			i++;
		}

	}
}
