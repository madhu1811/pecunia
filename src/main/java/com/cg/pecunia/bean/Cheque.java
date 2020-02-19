package com.cg.pecunia.bean;

public class Cheque {
	private int id;
	private double amount;
    private long payeeAcc_no;
    private long BeneficiaryAcc_no;
    private long chequeNum;
    private String bankName;
    private char IFSC;
	public Cheque(int id, double amount, long payeeAcc_no, long beneficiaryAcc_no, long chequeNum, String bankName,
			char iFSC) {
		super();
		this.id = id;
		this.amount = amount;
		this.payeeAcc_no = payeeAcc_no;
		BeneficiaryAcc_no = beneficiaryAcc_no;
		this.chequeNum = chequeNum;
		this.bankName = bankName;
		IFSC = iFSC;
	}
	public Cheque() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public long getPayeeAcc_no() {
		return payeeAcc_no;
	}
	public void setPayeeAcc_no(long payeeAcc_no) {
		this.payeeAcc_no = payeeAcc_no;
	}
	public long getBeneficiaryAcc_no() {
		return BeneficiaryAcc_no;
	}
	public void setBeneficiaryAcc_no(long beneficiaryAcc_no) {
		BeneficiaryAcc_no = beneficiaryAcc_no;
	}
	public long getChequeNum() {
		return chequeNum;
	}
	public void setChequeNum(long chequeNum) {
		this.chequeNum = chequeNum;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public char getIFSC() {
		return IFSC;
	}
	public void setIFSC(char iFSC) {
		IFSC = iFSC;
	}
    
}
