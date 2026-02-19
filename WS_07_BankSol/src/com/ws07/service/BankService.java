package com.ws07.service;

import java.util.List;

import com.ws07.dto.AccountDto;
import com.ws07.dto.UserDto;

public interface BankService {
	public List<AccountDto> getAccountList(int userSeq);
	
	public UserDto getUserDetail(int userSeq);
	
	public List<AccountDto> getAccountListSortByBalance();
	
	public List<AccountDto> getAccountListSortByUserSeq();

	public AccountDto getUserAccount(int userSeq, int accountSeq) throws UserAccountNotFoundException;
	
	public int withdraw(int userSeq, int accountSeq, int amount) throws BalanceLackException, UserAccountNotFoundException;

	
}
