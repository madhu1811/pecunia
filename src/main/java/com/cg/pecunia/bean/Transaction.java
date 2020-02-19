package com.cg.pecunia.bean;

public class Transaction extends Account {
	private long ts_no;
	private long acc_no;
	private long date_name;
	public Transaction(String acc_Name, int contact, long acc_No, String address, double balance, long ts_no,
			long acc_no2, long date_name) {
		super(acc_Name, contact, acc_No, address, balance);
		this.ts_no = ts_no;
		acc_no = acc_no2;
		this.date_name = date_name;
	}
	public Transaction(String acc_Name, int contact, long acc_No, String address, double balance) {
		super(acc_Name, contact, acc_No, address, balance);
	}
	public long getTs_no() {
		return ts_no;
	}
	public void setTs_no(long ts_no) {
		this.ts_no = ts_no;
	}
	public long getAcc_no() {
		return acc_no;
	}
	public void setAcc_no(long acc_no) {
		this.acc_no = acc_no;
	}
	public long getDate_name() {
		return date_name;
	}
	public void setDate_name(long date_name) {
		this.date_name = date_name;
	}
	

}
