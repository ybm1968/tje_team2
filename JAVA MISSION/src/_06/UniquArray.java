package _06;

public class UniquArray {
	// 중복제거
	public static void uniquArray(int[] arry) {
		for (int i = 0; i < arry.length; i++) {
			arry[i] = (int) (Math.random() * 45 + 1);
			for (int j = 0; j < i; j++) {
				if (arry[i] == arry[j]) {
					i--;
				}
			}
		}
		// return arry; 
		// call by reference 이기 떄문에 리턴을 안해도 배열이 수정이됨
	}
}
