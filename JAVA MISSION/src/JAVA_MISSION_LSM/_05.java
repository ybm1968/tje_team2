package JAVA_MISSION_LSM;

import java.util.Scanner;

public class _05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		String menu = "";
		
		do {
			System.out.println("********** 치킨 메뉴판 **********");
			System.out.println("1. 황금올리브 반반 치킨");
			System.out.println("2. 뿌링클 치킨");
			System.out.println("3. 처갓집에서 호식이가 만든 치킨");
			System.out.println("0. 종료");
			System.out.print("******* 번호 : ");
			int num = sc.nextInt();
			 
			if(num == 0) break;
			
			switch (num) {
				case 1: menu = "황금올리브 반반 치킨"; break;
				case 2: menu = "뿌링클 치킨"; break;
				case 3: menu = "처갓집에서 호식이가 만든 치킨"; break;
				default:
					System.out.println("(0 ~ 3) 사이의 번호를 입력해주세요.");
					System.out.println();
					continue;
			}
			System.out.println(menu + "이(/가) 주문되었습니다.");
			System.out.println();
			count++;
		} while(true);
		System.out.println("총 " + count + "개의 상품이 주문되었습니다.");
		
		sc.close();
	}
}
