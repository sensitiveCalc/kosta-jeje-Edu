package com.ws07.dto;
/**
 * 	대출계좌 클래스
 * */
public class LoanAccountDto extends AccountDto {
	//담보 항목 필드 추가
	private String mortgage;
	
	public LoanAccountDto() {}
	public LoanAccountDto(int accountSeq, String accountNumber, int balance, int userSeq, String mortgage) {
		super(accountSeq, accountNumber, balance, userSeq);
		this.mortgage = mortgage;
	}

	public String getMortgage() {
		return mortgage;
	}

	public void setMortgage(String mortgage) {
		this.mortgage = mortgage;
	}

	@Override
	public String toString() {
		return super.toString() + "담보: " + mortgage + "]";
	}
	
	
}
