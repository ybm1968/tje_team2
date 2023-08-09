package Sort;

import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		int key;
		Scanner sc = new Scanner(System.in);
		System.out.print("배열의 크기를 입력하시오 : ");
		int n = sc.nextInt();
		int ary[] = new int[n];
		
		System.out.println("배열에 들어갈 수를 입력하시오 : ");
		for (int i = 0; i < ary.length; i++) {
			ary[i] = sc.nextInt();
		}
		
		
		for (int i = 1; i < ary.length; i++) {	
			for (int j = i-1; j >= 0; j--) {
				key = ary[j+1];
				ary[j+1] = ary[j];
				if(ary[j+1] > key) {
					ary[j] = key;
				}
				else if(ary[j+1] < key) {
					ary[j+1] = key;
					break;
				}
			}
			System.out.print(i + "회차 : ");
			for (int k : ary) {
				System.out.print(k + " ");
			}
			System.out.println();
		}
		
		sc.close();
	}
}


