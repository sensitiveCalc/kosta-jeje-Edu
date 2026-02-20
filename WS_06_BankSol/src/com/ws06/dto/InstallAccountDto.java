package com.ws06.dto;
/**
 *	정기예금계좌 클래스
 * */
public class InstallAccountDto extends AccountDto {
	//기간, 금액 항목 필드 추가
	private int period;
	private int amount;
	
	public InstallAccountDto() {}
	public InstallAccountDto(int accountSeq, String accountNumber, int balance, int userSeq, int period, int amount) {
		super(accountSeq, accountNumber, balance, userSeq);
		this.period = period;
		this.amount = amount;
	}

	public int getPeriod() {
		return period;
	}

	public void setPeriod(int period) {
		this.period = period;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return super.toString() + "기간: " + period + ", 금액: " + amount + "]";
	}
	
}
