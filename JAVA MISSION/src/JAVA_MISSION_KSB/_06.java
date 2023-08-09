package JAVA_MISSION_KSB;

import java.util.Scanner;

public class _06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 게임 ? : ");
		int N = sc.nextInt();
		
		for (int a = 1; a <= N; a++) {
			System.out.print(a + "번째 게임 : ");		
			
			int lotto[] = new int[6];
			for (int i = 0; i < 6; i++) {
				int num = (int)(Math.random() * 45 + 1);
				lotto[i] = num;
				for(int j = 0; j < i ; j++) {
					if(num == lotto[j])
						i--;
				}
			}
	
			for (int i = 0; i < lotto.length-1; i++) {
				for (int j = i+1; j < lotto.length; j++) {
					if(lotto[i] > lotto [j]) {
						int temp = lotto[i];
						lotto[i] = lotto[j];
						lotto[j] = temp;
					}
				}
			}
			
			for (int j = 0; j < lotto.length; j++) {
					System.out.print(lotto[j] + " ");
			}
		System.out.println();
		
		}
		sc.close();
	}
}
