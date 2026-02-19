package com.ws05.service;
/**
 * 고객과 계좌에 관련된 서비스
 * (Business Logic 을 처리하는 객체)
 * */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.ws05.dto.AccountDto;
import com.ws05.dto.InstallAccountDto;
import com.ws05.dto.LoanAccountDto;
import com.ws05.dto.SavingAccountDto;
import com.ws05.dto.UserDto;

public class BankService {
	
	List<UserDto> userList ;//null-> 주소값
	List<AccountDto> accountList ; //null
	
	/**
	 * 생성자에서 테스트를 위한 고객 및 계좌 객체를 생성하고 배열에 저장한다
	 * */
	public BankService() {
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
	  특정 사용자의 계좌 목록을 배열로 리턴 하는 메소드를 작성한다
	*/
	public List<AccountDto> getAccountList(int userSeq) { // 100 
		 int searchAccountCount=0; //인수로 전달된 userSeq에 해당하는 계좌의 개수를 체크 
		
		 //리턴해서 나갈 배열의 개수를 미리 알아내여 선언하기 위해 반복문 필요 
		 for(int i=0; i < accountList.size() ; i++) {
				if( accountList.get(i).getUserSeq()  == userSeq) {
					 //찾았다!!
					searchAccountCount++;
				}
		}
			
		//위에서 찾은 정보를 바탕으로  AccountDto배열에서 계좌정보를 찾아서 리턴해준다.
		//찾은 고객의 계좌의 수만큼 배열을 생성해서 그 배열을 리턴
		if(searchAccountCount==0) return null;
		
		List<AccountDto> searchAccountDtoList =  new ArrayList<>();
		
		int count=0;
		for(int i=0; i < accountList.size() ; i++) {
			if( accountList.get(i).getUserSeq()  == userSeq) {
				searchAccountDtoList.add(accountList.get(i));
			}
		}
			
		return searchAccountDtoList;
	}
	
	
	/**
	   특정 사용자의 고객 정보를 리턴 하는 메소드를 작성한다
	   
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
	
	
	// 잔액기준으로 정렬하기(=collection Comparator 사용)
	public List<AccountDto> getAccountListSortByBalance() {
		
		List<AccountDto> shallowCopy = new ArrayList<>(accountList);
		//Collections.sort(shallowCopy);
		Collections.sort(shallowCopy, (o1, o2) -> o1.getBalance() - o2.getBalance() );
		
		return shallowCopy;
	}
	
	
	// UserSeq 기준으로 정렬하기
	public List<AccountDto> getAccountListSortByUserSeq() { //특정 시퀀스 검색하려면 인수 int userSeq 추가
		List<AccountDto> result = new ArrayList<>();
		for(AccountDto dto : accountList ) {
			//if(dto.getUserSeq() == userSeq) { //시퀀스 검색 조건
				result.add(dto);
			//}
		}
		return result;
	}
	
	// 모든 계좌정보 조회
	public List<AccountDto> getAccountList() {
		return accountList;
	}
	
}










