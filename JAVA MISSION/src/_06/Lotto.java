package _06;

import java.util.Scanner;

public class Lotto {
	public static void main(String[] args) {
		// Math.random() : 0.XXXX ~ 0.9XXXX 사이의 임의 수를 반환 (1보다 작은수)
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arry = new int[6];

		for (int i = 1; i <= n; i++) {
			System.out.print("[" + i + "]게임 : ");
			UniquArray.uniquArray(arry);
			OderBy.orderBy(arry);
			for (int j = 0; j < arry.length; j++) {
				System.out.print(arry[j] + " ");
			}
			System.out.println();
		}

		sc.close();

	}

}
