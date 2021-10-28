package org.bank;

public class AxisBank extends BankInfo {
	//child
	private void deposit() {
		System.out.println("deposit is 2.5%");
	}
public static void main(String[] args) {
	AxisBank A = new AxisBank();
	A.deposit();
	A.saving();
	A.fixed();	
}
}
