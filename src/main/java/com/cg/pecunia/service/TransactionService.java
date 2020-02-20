package com.cg.pecunia.service;

import java.sql.Date;

public interface TransactionService {
	public boolean creditUsingCheque( String accountNumber,String payeeAccountNumber,  String chequeNumber,
			String chequeBankName, String chequeIFSC, Date chequeIssueDate, int amount);
	public boolean debitUsingCheque(String accountNumber,String payeeAccountNumber,  String chequeNumber,
			String chequeBankName, String chequeIFSC, Date chequeIssueDate, int amount);


}
