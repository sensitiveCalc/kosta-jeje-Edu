package com.ws07.service;

public class BalanceLackException extends Exception {
	
	public BalanceLackException() {
		super("잔액확인!!!");
	}
	
	public BalanceLackException(String str) {
		super(str);
	}
}
