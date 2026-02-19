package com.ws05.dto;
/**
 * 	저축계좌 클래스
 * */
public class SavingAccountDto extends AccountDto {
	//이체 수수료 항목 필드 추가
	private int transferFree;
	
	public SavingAccountDto() {}
	public SavingAccountDto(int accountSeq, String accountNumber, int balance, int userSeq, int transferFree) {
		super(accountSeq, accountNumber, balance, userSeq);
		this.transferFree = transferFree;
	}

	public int getTransferFree() {
		return transferFree;
	}

	public void setTransferFree(int transferFree) {
		this.transferFree = transferFree;
	}

	@Override
	public String toString() {
		return super.toString() + "이체 수수료: " + transferFree + "]";
	}
	
}
