package _02;

import java.util.Scanner;

public class _02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int sum1 = 0;
		int sum2 = 0;
		
		for (int i = 1; i <= N; i += 2) {
			if(i == 1) System.out.print(i);
			else	System.out.print("+" + i);
				sum1 += i;
		}
		System.out.println("=" + sum1);
		
		for (int i = 2; i <= N; i += 2) {
			if(i == 2) System.out.print(i);
			else System.out.print("+" + i);
			sum2 += i;
		}
		System.out.println("=" + sum2);
			
		for (int i = 1; i <=N; i++) {
			if(N % i == 0)
				System.out.print(i + " ");
		}
		
		sc.close();
	}
}
