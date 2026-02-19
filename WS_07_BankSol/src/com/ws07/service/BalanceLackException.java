package com.ws07.service;

public class BalanceLackException extends Exception {
	public BalanceLackException() {
		super("잔액이 부족합니다.");
	}
}
