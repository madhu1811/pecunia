package com.cg.pecunia.dao;

import com.cg.pecunia.bean.TransactionModel;

public interface TransactionUsingChequeDAO {
public boolean addAccountDetails(TransactionModel accountDetails );
	
	
	public boolean creditUsingCheque(String accountNumber,String payeeAccountNumber,String chequeNumber,String chequeBankName,String chequeIFSC,java.util.Date chequeIssueDate,int amount);
	public boolean debitUsingCheque( String accountNumber,String payeeAccountNumber,String chequeNumber,String chequeBankName,String chequeIFSC,java.util.Date chequeIssueDate,int amount);
	public int getBalanceByID(String accountNumber);
	 public boolean addAmount(String accountNumber,int amount) ;
	 public boolean deductAmount(String accountNumber,int amount) ;
}



