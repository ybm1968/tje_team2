package JAVA_MISSION_KKC;

import java.util.Scanner;
public class _14 {
	public static void main(String[] args) {
		int lotto[] =new int [6];
		Scanner sc = new Scanner(System.in); System.out.print("몇 번의 게임을 할까요? : ");
		int N = sc.nextInt(); System.out.println("-------------------------");
		for (int k = 1; k < N + 1 ; k++) {
			for (int i = 0; i < lotto.length; i++) {
				// 플로트로 나오니까 인트로 형변환
				int num = (int)(Math.random() * 45 + 1);
				lotto[i] = num;
				// 중복 제거
				for(int j = 0; j < i ; j++) {
					if (num == lotto[j]) i--;
				}
			}
			System.out.print("[" + k + " 게임"+ "]" + " : ");
			for (int l = 0 ; l < lotto.length; l++) {
				System.out.print(lotto[l] + " ");
			}
			System.out.println();
		}
		sc.close(); System.out.println("==========================");
	}
}
