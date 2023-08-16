package JAVA_MISSION_LSM._12;

//	조은은행의 금고에는 최대 1조 까지 안전하게 보관할 수 있다. 따라서, 조은은행이 수용할 수 있는 최대 고객 수는 1,000 명이다. (O)
//	- Account 객체를 기본 생성 시 계좌번호, 예금주, 잔고는 각각 “계좌없음”, “이름없음“, 0 으로 초기화한다. (O)
//	- Account 객체의 멤버변수는 Getter, Setter 메소드를 이용하여 접근한다. (O)
//	- 잔고 직접 지정?????과 입금 및 출금은 허용된 금액 범위에서만 적용 가능하도록 한다. (??)

// input 함수 만들기, 입금액 좀만 더 디테일하게 바꾸기

import java.util.Scanner;

public class Bank {

	static Scanner sc = new Scanner(System.in);
	static Account[] accountList = new Account[1000];
	static String adminPassword = "123456"; // 비밀번호인데 int로 안하고 String으로 왜 한거지??

	public static Account accountRegistration() {
		Account account = new Account();

		System.out.print("계좌번호>> ");
		String accountNumber = sc.nextLine();
		account.setAccountNumber(accountNumber);

		System.out.print("예금주>> ");
		String accountHolder = sc.nextLine();
		account.setAccountHolder(accountHolder);

		System.out.print("최초예금액>> ");
		int balance = sc.nextInt();
		sc.nextLine();
		while ((account.MAX_BALANCE < balance) || (account.MIN_BALANCE > balance)) {
			System.out.println("예금금액이 올바르지 않습니다. 다시 입력하세요.");
			System.out.print("최초예금액>> ");
			balance = sc.nextInt();
			sc.nextLine();
		}
		account.setBalance(balance);

		System.out.print("비밀번호>> ");
		String password = sc.nextLine();
		account.setPassword(password);

		System.out.println("'" + accountHolder + "' 님의 계좌가 개설되었습니다.");
		return account;
	}

	public static void deposit() {
		System.out.println("======================== 입금 ========================");
		System.out.print("계좌번호>> ");
		String accountNumber = sc.nextLine();

		System.out.print("입금액>> ");
		int balance = sc.nextInt();

		for (int i = 0; i < accountList.length; i++) {
			if (accountList[0] == null) {
				System.out.println("등록된 계좌가 없습니다.");
				break;
			} else if (accountList[i] == null)
				break;

			Account account = accountList[i];

			while ((account.MAX_BALANCE < (balance + account.getBalance()) ) || (account.MIN_BALANCE > balance)) {
				System.out.println("예금금액이 올바르지 않습니다. 다시 입력하세요.");
				System.out.print("입금액>> ");
				balance = sc.nextInt();
				sc.nextLine();
			}

			if (accountNumber.equals(account.getAccountNumber())) {
				String accountHolder = account.getAccountHolder();
				System.out.println("'" + accountHolder + "' 님에게 입금하는게 맞으십니까?");
				System.out.println("1. 예");
				System.out.println("2. 아니오");
				System.out.print("입력>> ");
				int no = sc.nextInt();

				if (no == 1) {
					account.deposit(balance);
					System.out.println("'" + accountHolder + "'님의 계좌에 " + balance + " 원이 입금되었습니다.");
				} else if (no == 2)
					break;
				else {
					System.out.println("1번 또는 2번만 입력해주세요.");
					System.out.println();
					--i;
					continue;
				}
			}
		}
	}

	public static void withdraw() {
		System.out.println("======================== 출금 ========================");

		System.out.print("계좌번호>> ");
		String accountNumber = sc.nextLine();

		System.out.print("비밀번호>> ");
		String password = sc.nextLine();

		for (int i = 0; i < accountList.length; i++) {
			if (accountList[0] == null) {
				System.out.println("등록된 계좌가 없습니다.");
				break;
			} else if (accountList[i] == null)
				break;

			Account account = accountList[i];

			if (accountNumber.equals(account.getAccountNumber())) {
				if (password.equals(account.getPassword())) {
					System.out.print("출금액>> ");
					int money = sc.nextInt();
					while ( (account.getBalance() < money) || (account.MAX_TRANSFER < money)
							|| (account.MIN_TRANSFER > money) ) {
						System.out.println("출금 가능금액이 올바르지 않습니다. 다시 입력하세요.");
						System.out.print("출금액>> ");
						money = sc.nextInt();
					}
					account.withdrawal(money);
					System.out.println("'" + account.getAccountHolder() + "'님의 계좌에 " + money + " 원이 출금되었습니다.");
				}
				else {
					System.err.println("비밀번호가 다릅니다!!");
					break;
				} 
			}

		}

	}

	public static void accountInquiry() {
		System.out.println("======================== 계좌조회 ========================");

		System.out.print("계좌번호>> ");
		String accountNumber = sc.nextLine();

		System.out.print("비밀번호>> ");
		String password = sc.nextLine();

		for (int i = 0; i < accountList.length; i++) {
			if (accountList[0] == null) {
				System.out.println("등록된 계좌가 없습니다.");
				break;
			} else if (accountList[i] == null)
				break;

			Account account = accountList[i];

			if (accountNumber.equals(account.getAccountNumber())) {
				if (password.equals(account.getPassword())) {
					System.out.println(
							"'" + account.getAccountHolder() + "'님의 계좌잔액은 " + account.getBalance() + " 원이 입니다.");
				}
			}
		}
	}

	public static void accountList() {
		System.out.print("관리자 비밀번호>> ");
		String password = sc.nextLine();

		if (password.equals(adminPassword)) {
			System.out.println("======================== 계좌목록 ========================");
			System.out.println("예금주 \t\t 계좌번호 \t\t 잔고");
			for (Account account : accountList) {
				if (account == null)
					break;
				System.out.println(account.getAccountHolder() + "\t\t" + account.getAccountNumber() + "\t\t\t"
						+ account.getBalance());
			}
		} else {
			System.out.println("관리자 비밀번호가 일치하지 않습니다.");
		}

	}

	public static void main(String[] args) {
		int i = 0;

		do {
			System.out.println("======================");
			System.out.println("1. 계좌등록");
			System.out.println("2. 입금");
			System.out.println("3. 출금");
			System.out.println("4. 계좌조회");
			System.out.println("5. 계좌목록");
			System.out.println("6. 종료");
			System.out.print("입력>> ");
			int no = sc.nextInt();
			sc.nextLine();

			if (no == 6)
				break;

			switch (no) {
			case 1:
				accountList[i++] = accountRegistration();
				break;
			case 2:
				deposit();
				break;
			case 3:
				withdraw();
				break;
			case 4:
				accountInquiry();
				break;
			case 5:
				accountList();
				break;
			default:
				System.out.println("올바른 입력값이 아닙니다. 다시 입력하세요.");
				continue;

			}
			System.out.println();

		} while (true);
	}

}
