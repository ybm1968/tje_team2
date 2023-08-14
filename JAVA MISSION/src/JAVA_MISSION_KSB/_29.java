package JAVA_MISSION_KSB;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class _29 {

	public static void main(String[] args) {
		Map<String, String>	map = new HashMap<String, String>();
		
		map.put("수업", "class");
		map.put("행복", "Happiness");
		map.put("대학교", "University");
		System.out.println("입력한 단어 수 : " + map.size());
		
		Set<String> keySet = map.keySet();
		for (String key : keySet) {
			String value = map.get(key);
			System.out.println(">>한글 : " + key);
			System.out.println(">>영어 : " + value);
		}
		
		Scanner sc = new Scanner(System.in);
		String key = "";
		do {
			System.out.print("검색할 단어 : ");
			key = sc.nextLine();
			if(key.equals(Integer.toString(0))) break;
			System.out.println(">> " + key + "은 영어로 " + map.get(key) + "입니다."); 
			
		} while (true);
		
		sc.close();
		System.out.println("종료합니다");
		
	}
}
