package com.cg.pecunia.bean;

import java.time.LocalDate;

public class Transaction {
private long transactionID;
private LocalDate transactionDate;

public Transaction(long transactionID, LocalDate transactionDate) {
	super();
	this.transactionID = transactionID;
	this.transactionDate = transactionDate;
}

public Transaction() {
	super();
}

public long getTransactionID() {
	return transactionID;
}
public void setTransactionID(long transactionID) {
	this.transactionID = transactionID;
}
public LocalDate getTransactionDate() {
	return transactionDate;
}
public void setTransactionDate(LocalDate transactionDate) {
	this.transactionDate = transactionDate;
}
public boolean equals(Object obj)
{
	if(this==obj)
	return true;
	if(obj==null)
		return false;
	if(getClass()!=obj.getClass())
		return false;
	Transaction trans=(Transaction)obj;
	if(transactionDate==null)
	{
		if(trans.transactionDate!=null)
			return false;
		else if(!transactionDate.equals(trans.transactionDate))
			return false;
		if(transactionID!=trans.transactionID)
			return false;
		
	}
	return true;
}
	public String toString()
	{
		return "Transaction[transactionID=" + transactionID + ", transactionDate="  + transactionDate+"]";
	}
}


