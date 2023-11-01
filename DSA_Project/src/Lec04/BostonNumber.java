package Lec04;

import java.util.*;

public class BostonNumber {

	public static void main(String[] args) {
		
				Scanner s = new Scanner(System.in);
				int N = s.nextInt();
				int i = 2;
				int M = N;
				int Sum1 = 0;
				int Sum2 = 0;
				int digit = 0;
				
				while (N > 1) {

					if (N % i == 0) {
						Sum1 = Sum1 + i;
						N = N / i;
					} else {
						i++;
						
					}
				}
				while (M > 0) {
					digit = M % 10;
					Sum2 = Sum2 + digit;
					M = M / 10;
				}

				if (Sum1 == Sum2) {
					System.out.println("1");
				} else {
					System.out.println("0");
				}
			}
		}




