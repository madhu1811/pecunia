package com.cg.pecunia.bean;

public class Account {
private String Acc_Name;
private long contact;
private long Acc_No;
private String address;
private double balance;
public Account(String acc_Name, int contact, long acc_No, String address, double balance) {
	super();
	Acc_Name = acc_Name;
	this.contact = contact;
	Acc_No = acc_No;
	this.address = address;
	this.balance = balance;
}
public Account() {
	super();
}
public String getAcc_Name() {
	return Acc_Name;
}
public void setAcc_Name(String acc_Name) {
	Acc_Name = acc_Name;
}
public long getContact() {
	return contact;
}
public void setContact(int contact) {
	this.contact = contact;
}
public long getAcc_No() {
	return Acc_No;
}
public void setAcc_No(long acc_No) {
	Acc_No = acc_No;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}


}
