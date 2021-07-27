package com.demo;

public class Banking {
	
	public int credit(int m) {
		int balance=0;
		balance= balance+m;
		return balance;
		
	}
	
	public int debit(int m) {
		int balance=10000;
		balance= balance-m;
		return balance;
		
	}

}