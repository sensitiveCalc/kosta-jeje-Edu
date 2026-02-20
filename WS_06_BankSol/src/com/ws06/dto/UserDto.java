package com.ws06.dto;

import java.util.ArrayList;
import java.util.Comparator;

/**
 *  고객의 정보를 관리할 객체 
 * */
public class UserDto implements Comparator<UserDto> {
   private int userSeq; // setUserSeq, getUserSeq = PK
   private String name;
   private String email;
   private String phone;
   private boolean sleep;//기본값 false -> private인 경우는 sleep이름으로 한다. 
   
 
public UserDto() {}
   public UserDto(int userSeq, String name, String email, String phone, boolean sleep) {
	this.userSeq = userSeq;
	this.name = name;
	this.email = email;
	this.phone = phone;
	this.sleep = sleep;
  }
	public int getUserSeq() {
		return userSeq;
	}
	public void setUserSeq(int userSeq) {
		this.userSeq = userSeq;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public boolean isSleep() {// boolean 형 인 경우는 getSleep아니다. 
		return sleep;
	}
	public void setSleep(boolean sleep) {
		this.sleep = sleep;
	}
	
	
	@Override
	public String toString() {
		return "UserDto [userSeq=" + userSeq + ", name=" + name + ", email=" + email + ", phone=" + phone + ", sleep="
				+ sleep + "]";
	}
	
	@Override
	public int compare(UserDto o1, UserDto o2) { //유저 번호로 정렬하는 메소드
		return o1.getUserSeq() - o2.getUserSeq();
	}
	

}
