package com.ws07.service;
/**
 * 고객과 계좌에 관련된 서비스
 * (Business Logic 을 처리하는 객체)
 * */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.ws07.dto.AccountDto;
import com.ws07.dto.InstallAccountDto;
import com.ws07.dto.LoanAccountDto;
import com.ws07.dto.SavingAccountDto;
import com.ws07.dto.UserDto;

public class BankServiceImpl implements BankService {
	
	List<UserDto> userList ;//null-> 주소값
	List<AccountDto> accountList ; //null
	
	/**
	 * 생성자에서 테스트를 위한 고객 및 계좌 객체를 생성하고 배열에 저장한다
	 * */
	public BankServiceImpl() {
		//배열 생성
		 userList = new ArrayList<UserDto>(); //5
		 accountList = new ArrayList<AccountDto>(); //10
		
		 // 각 배열방에 고객과 계좌를 생성한다.
		 //고객 3명
		 userList.add( new UserDto(111, "홍길동", "hong@gildong@com", "010-1111-1111", false) );
		 userList.add( new UserDto(222, "이길동", "lee@gildong@com", "010-2222-2222", true) );
		 userList.add( new UserDto(333, "삼길동", "sam@gildong@com", "010-3333-3333", false) );
		 
		 
		 //계좌는 6개 정도
		 accountList.add( new InstallAccountDto(20, "00200202002002", 1000, 111, 12, 10000) );
		 accountList.add( new SavingAccountDto(10, "00100101001001", 500, 111, 100) );
		 accountList.add( new LoanAccountDto(60, "00600606006006", 500, 333, "House") );
		 accountList.add( new LoanAccountDto(30, "00300303003003", 0, 111, "Building") );
		 accountList.add( new SavingAccountDto(70, "00700707007007", 500, 333, 200) );
		 accountList.add( new LoanAccountDto(50, "00500505005005", 200, 222, "Car") );
		 accountList.add( new SavingAccountDto(40, "00400404004004", 1000, 222, 50) );
		 
		 System.out.println("---세팅완료!!----");
		 
	}//생성자 끝
	
	/**
	  1. 특정 사용자의 계좌 목록을 배열로 리턴 하는 메소드를 작성한다
	*/
	public List<AccountDto> getAccountList(int userSeq) { // 100 
		 int searchAccountCount=0; //인수로 전달된 userSeq에 해당하는 계좌의 개수를 체크 
		 List<AccountDto> findAccountList = new ArrayList<AccountDto>();
		 
		 //리턴해서 나갈 배열의 개수를 미리 알아내여 선언하기 위해 반복문 필요 
		 for(AccountDto ad : accountList) {
				if( ad.getUserSeq()  == userSeq) {
					 //찾았다!!
					findAccountList.add(ad);
				}
		}
		
		return findAccountList;
	}
	
	
	/**
	   2. 특정 사용자의 고객 정보를 리턴 하는 메소드를 작성한다
	   
	   @param : 고객의 sequence
	   @return : null이면 고객의정보없다 
	**/
	public UserDto getUserDetail(int userSeq) {
		for(int i=0; i< userList.size() ; i++) {
			if(userList.get(i).getUserSeq() == userSeq) {
				//찾았다.
				return userList.get(i);
			}
		}
		
		return null;
	}
	
	// 3. 모든 계좌정보 조회
	public List<AccountDto> getAccountList() {
		return accountList;
	}
	
	
	// 4. 잔액기준으로 정렬하기(=collection Comparable 사용)
	public List<AccountDto> getAccountListSortByBalance() {
		
		List<AccountDto> shallowCopy = new ArrayList<AccountDto>(accountList);
		Collections.sort(shallowCopy, (o1, o2) -> o1.getBalance() - o2.getBalance() );
		//Collections.sort(shallowCopy);
		
		return shallowCopy;
	}
	
	// 5. UserSeq 기준으로 정렬하기
	//	  만약, UserSeq가 같으면 잔액을 기준으로 내림차순 정렬
	public List<AccountDto> getAccountListSortByUserSeq() { //특정 시퀀스 검색하려면 인수 int userSeq 추가

		List<AccountDto> shallowCopy = new ArrayList<AccountDto>(accountList);
		Collections.sort(shallowCopy, 
				(a, b) -> a.getUserSeq() == b.getUserSeq() ?
						b.getBalance() - a.getBalance() : a.getBalance() - b.getBalance()
		);
		
		return shallowCopy;
	}
	
	// 6. 사용자 또는 계좌 찾는 메소드
	@Override
	public AccountDto getUserAccount(int userSeq, int accountSeq) throws UserAccountNotFoundException {
		for(AccountDto account : accountList) {
			if(account.getUserSeq() == userSeq && account.getAccountSeq() == accountSeq) {
				return account;
			}
		}
		throw new UserAccountNotFoundException("사용자 또는 계좌를 찾을 수 없습니다.");
	}
	
	// 7. 잔액부족 메소드
	@Override
	public int withdraw(int userSeq, int accountSeq, int amount)
			throws BalanceLackException, UserAccountNotFoundException {
		
		AccountDto dto = getUserAccount(userSeq, accountSeq);
		
		if(dto.getBalance() < amount) {
			throw new BalanceLackException("잔액이 부족합니다.");
		}
		dto.setBalance(dto.getBalance() - amount);
		
		return dto.getBalance();
	}
	
}










