package com.ws05.dto;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * 고객의 계좌정보 관리하는 객체
 */
public class AccountDto implements Comparator<AccountDto> {
	private int accountSeq;
	private String accountNumber;
	private int balance;
	private int userSeq; // FK

	public AccountDto() {}
	public AccountDto(int accountSeq, String accountNumber, int balance, int userSeq) {
		this.accountSeq = accountSeq;
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.userSeq = userSeq;
	}

	public int getAccountSeq() {
		return accountSeq;
	}

	public void setAccountSeq(int accountSeq) {
		this.accountSeq = accountSeq;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getUserSeq() {
		return userSeq;
	}

	public void setUserSeq(int userSeq) {
		this.userSeq = userSeq;
	}
	

	@Override
	public String toString() {
		return "AccountDto [accountSeq=" + accountSeq + ", accountNumber=" + accountNumber + ", balance=" + balance
				+ ", userSeq=" + userSeq + "]";
	}
	
	
	@Override
	public int compare(AccountDto o1, AccountDto o2) { //잔액기준 정렬 메소드
		return o1.getBalance() - o2.getBalance();
	}

}
