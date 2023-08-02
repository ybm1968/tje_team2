package _06;

public class OderBy {
	// 오름차순
	public static void orderBy (int[] arry) {
		int MIN;
		
		for (int i = 0; i < arry.length-1; i++) {
			for (int j = i+1; j < arry.length; j++) {
				if (arry[i] > arry[j]) {
					MIN = arry[j];
					arry[j] = arry[i];
					arry[i] = MIN;
				} 
			}
		}
		//return arry;
		// call by reference 이기 떄문에 리턴을 안해도 배열이 수정이됨
	}
}
