package _03;

public class _03 {
	
	int one = 0;
	int ten = 0;
	public static void main(String[] args) {
		
		for(int i = 1; i <= 100; i++ ) {
			
			int one = i % 10;   // % = 나머지 : 일의자리 수
			int ten = i / 10;   // / = 몫 : 십의자리 수
			
			boolean one369 = one == 3 || one == 6 || one == 9;
			boolean ten369 = ten == 3 || ten == 6 || ten == 9;
			
			if((ten369) && (one369)) {
				System.out.println( " ** ");
				
			}
			
			else if (ten369) {
				System.out.println( " * ");
				
			}
			
			else if (one369) {
				System.out.println( " * ");
			}
			
			else {
			
			
			
			System.out.println(i); }
			
			
		}
	}

}
