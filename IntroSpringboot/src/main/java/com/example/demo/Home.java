package com.example.demo;

import org.springframework.stereotype.Component;

@Component //  this annotation uses to create object in spring container inn jvm
public class Home {
	//POJO Class
	
	public Home(){
		System.out.println("hello hello");
	}
	private String owner;
	private int doorNo;
	
	public String getOwner(){
		return owner;
	}
	
	public void SetOwner(String owner) {
		this.owner = owner;
	}
	
	public int getDoorNo() {
		return doorNo;
	}
	public void SetDoorNo(int doorNo) {
		this.doorNo = doorNo;
	}
	
	public void connect() {
		System.out.println("Connecting to Internet");
	}
	

}
