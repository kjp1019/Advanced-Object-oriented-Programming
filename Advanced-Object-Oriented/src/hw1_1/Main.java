package hw1_1;

//***************************
//파일명: Main.java

//작성자: 김진필

//작성일: 2025-09-24

//내용: 드라이버 클래스의 문제 (1)~(11) 순서 수행

//***************************
public class Main {
	public static void main(String[] args) {
	        System.out.println("과제: hw1_1 인터페이스 / 작성자: 김진필 ");
	        System.out.println();

	        // (1) 은행계좌 객체 생성
	        BankAccount account = new BankAccount(1000);

	        // (2) 500 입금, 200 출금
	        account.deposit(500);
	        account.withdraw(200);

	        // (3) toString으로 잔액 출력
	        System.out.println("계좌 상태: " + account);

	        // (4) 계좌 리셋
	        account.reset();

	        // (5) toString으로 잔액 출력
	        System.out.println("계좌 상태(리셋 후): " + account);
	        System.out.println();

	        // (6) 포인트 생성
	        Point p = new Point(1.5, 2.5);

	        // (7) (2.1, 2.1) 이동
	        p.move(2.1, 2.1);

	        // (8) (10.0, 10.0) 이동
	        p.move(10.0, 10.0);

	        // (9) toString으로 좌표 출력
	        System.out.println("포인트: " + p);

	        // (10) 포인트 리셋
	        p.reset();

	        // (11) 리셋 후 좌표 출력
	        System.out.println("포인트(리셋 후): " + p);
	    }
}
