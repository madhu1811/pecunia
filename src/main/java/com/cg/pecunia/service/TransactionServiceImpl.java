package com.cg.pecunia.service;
import java.util.Date;

import com.cg.pecunia.bean.Transaction;
import com.cg.pecunia.dao.TransactionUsingChequeDAO;
import com.cg.pecunia.dao.TransactionUsingChequeDAOImpl;

public class TransactionServiceImpl implements TransactionService{
	TransactionUsingChequeDAO transactionDAO=new TransactionUsingChequeDAOImpl();
	


	@Override
	public boolean creditUsingCheque(String accountNumber, String payeeAccountNumber, String chequeNumber,
			String chequeBankName, String chequeIFSC, java.sql.Date chequeIssueDate, int amount) {

		return transactionDAO.creditUsingCheque(accountNumber,payeeAccountNumber,chequeNumber,chequeBankName,chequeIFSC,chequeIssueDate, amount) ;

		
	}

	@Override
	public boolean debitUsingCheque(String accountNumber, String payeeAccountNumber, String chequeNumber,
			String chequeBankName, String chequeIFSC, java.sql.Date chequeIssueDate, int amount) {
		return transactionDAO.debitUsingCheque(accountNumber,payeeAccountNumber,chequeNumber,chequeBankName,chequeIFSC,chequeIssueDate, amount);

	}

	 



}
