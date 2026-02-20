package com.ws07.service;

public class UserAccountNotFoundException extends Exception {
	
	public UserAccountNotFoundException() {
		super("회원정보를 확인해 주세요.");
	}
	
	public UserAccountNotFoundException(String str) {
		super(str);
	}
}
