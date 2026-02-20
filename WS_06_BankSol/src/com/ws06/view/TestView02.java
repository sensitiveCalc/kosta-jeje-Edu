package com.ws06.view;
import java.util.ArrayList;
import java.util.List;

import com.ws06.dto.AccountDto;
import com.ws06.dto.UserDto;
import com.ws06.service.BankService;
import com.ws06.service.BankServiceImpl;

public class TestView02 {
	public static void main(String[] args) {
		
		//collection 배열 사용
		BankServiceImpl bankService = new BankServiceImpl();
		System.out.println("1. 모든 계좌정보 조회 ------");
		print(bankService.getAccountList());
		
		System.out.println("\n2.잔액기준으로 정렬하기 -------------");
		print(bankService.getAccountListSortByBalance());
		
		System.out.println("\n3.UserSeq 기준으로 정렬하기 -------------");
		print(bankService.getAccountListSortByUserSeq());
		
		System.out.println("\n4. 모든 계좌정보 조회 ------");
		print(bankService.getAccountList());
		
	}

	/**
	 * 계좌목록 출력하기: 람다식으로 UserDto, AccountDto 객체 선언
	 * */
	public static <T> void print(List<T> accountList) {
		for (T t : accountList) {
			System.out.println(t);
		}
		System.out.println();
	}

}
