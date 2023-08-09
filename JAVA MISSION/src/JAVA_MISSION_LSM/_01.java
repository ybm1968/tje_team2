package JAVA_MISSION_LSM;

import java.util.Scanner;

public class _01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("영어 점수 : ");
		int eng = sc.nextInt();
		
		System.out.print("수학 점수 : ");
		int math = sc.nextInt();

		System.out.print("자바 점수 : ");
		int java = sc.nextInt();
		
		int sum = eng + math + java;
		double avg = sum / 3;
		
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
		
		sc.close();
				

	}
}
