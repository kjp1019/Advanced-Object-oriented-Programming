package hw1_1;

//***************************

//파일명: BankAccount.java

//작성자: 김진필

//작성일: 2025-09-24

//내용: 입금/출금/리셋 기능이 있는 은행계좌 클래스

//***************************

public class BankAccount implements Resettable {
	//현재 잔액
	private int balance;
	//생성 시 초기 잔액
	private final int initialBalance;
	
	//생성자: 초기 잔액 설정(음수 불가)
	public BankAccount(int balance) {
		if (balance < 0) throw new IllegalArgumentException("초기 잔액은 음수일 수 없습니다.");
		this.balance = balance;
		this.initialBalance = balance;
	}
	
	// 입금
	public void deposit(int amount) {
		if (amount <= 0) throw new IllegalArgumentException("입금액은 양수여야 합니다.");
		balance += amount;
	}
	
	//출금
	public void withdraw(int amount) {
		if (amount <= 0) throw new IllegalArgumentException("출금액은 양수여야 합니다.");
		if (amount > balance) throw new IllegalArgumentException("잔액이 부족합니다.");
		balance -=amount;
	}
	
	public int getBalance() {
		return balance;
	}
	
	//인터페이스 구현
	@Override
	public void reset() {
		this.balance = initialBalance;
	}
	
	//잔액 출력
	@Override
	public String toString() {
		return "잔액: " + balance;
	}
}
