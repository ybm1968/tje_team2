package Sort;

import java.util.Scanner;

public class SelectSort {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("배열의 크기를 입력하시오 : ");
		int n = sc.nextInt();
		int MIN;
		int[] arry = new int[n];
		
		System.out.println("배열에 들어갈 수를 입력하시오 : ");
		for (int i = 0; i < arry.length; i++) {
			arry[i] = sc.nextInt();
		}
		
		for (int i = 0; i < arry.length-1; i++) {
			for (int j = i+1; j < arry.length; j++) {
				if (arry[i] > arry[j]) {
					MIN = arry[j];
					arry[j] = arry[i];
					arry[i] = MIN;
				} 
			}
			System.out.print(i + "회차 : ");
			for (int k : arry) {
				System.out.print(k + " ");
			}
			System.out.println();
		}
		sc.close();
	}
}
