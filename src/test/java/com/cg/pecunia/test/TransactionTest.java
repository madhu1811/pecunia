package com.cg.pecunia.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.cg.pecunia.dao.TransactionUsingChequeDAO;
import com.cg.pecunia.dao.TransactionUsingChequeDAOImpl;

class TransactionTest {
	
	TransactionUsingChequeDAO transactionDao=null;
	@BeforeEach
	public void setUp() {
		transactionDao = new TransactionUsingChequeDAOImpl();
	}

	@Test
	void testCreditUsingCheque() {
		Date date = new Date();
		boolean flag=transactionDao.creditUsingCheque("123456789012", "123456789012", "123456", "HDFC", "SBN123456", date, 3000);
		assertEquals(true, flag);
	
	}
	
	@Test
	void testDebitUsingCheque() {
		Date date = new Date();
		boolean flag=transactionDao.debitUsingCheque("123456789012", "123456789012", "123456", "HDFC", "SBN123456", date, 3000);
		assertEquals(true, flag);
	
	}

}
