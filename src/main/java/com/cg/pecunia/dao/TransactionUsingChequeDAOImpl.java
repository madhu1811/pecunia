package com.cg.pecunia.dao;

import java.util.Date;
import java.awt.List;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.cg.pecunia.bean.Transaction;
import com.cg.pecunia.bean.TransactionModel;

public class TransactionUsingChequeDAOImpl implements TransactionUsingChequeDAO {
	Map<String,TransactionModel> transactionModel=new HashMap<String,TransactionModel>();
	public TransactionUsingChequeDAOImpl(){
		addSomeAccountDetails1();
	}
	public void addSomeAccountDetails1(){
		TransactionModel t1=new TransactionModel("123456789012","Madhurima",23000,
				Arrays.asList(new Transaction(100000000001L,LocalDate.now())));
		TransactionModel t2=new TransactionModel("123456789013","Srujana",24000,
				Arrays.asList(new Transaction(100000000002L,LocalDate.now())));
		transactionModel.put(t1.getAccountNumber(),t1);
		transactionModel.put(t2.getAccountNumber(),t2);
		
	}

	public boolean addAccountDetails(TransactionModel accountDetails) {
		if(transactionModel.containsKey(accountDetails)) {
			return false;
		}
		transactionModel.put(accountDetails.getAccountNumber(), accountDetails);
		return true;
	
	}
    
//	public TransactionModel getAccountDetailsByID(String accountNumber) {
//		return transactionModel.get(accountNumber);
//	}
	public int getBalanceByID(String accountNumber) {
		if(!transactionModel.containsKey(accountNumber)) {
			System.out.println("No Account Found");
			return 0;
		}
		TransactionModel bal=transactionModel.get(accountNumber);
		 return bal.getBalance();
		 

	}
//	public boolean updateAccountBalance(String accountNumber) {
//		if(!transactionModel.containsKey(accountNumber)){
//			return false;
//		}
//		TransactionModel transToUpdate=transactionModel.get(accountNumber);
//		transToUpdate.setBalance(transToUpdate.getBalance());
//       return true;
//	}
	public boolean addAmount(String accountNumber,int amount) {
		if(!transactionModel.containsKey(accountNumber)) {
			return false;
		}
		TransactionModel acc=transactionModel.get(accountNumber);
		acc.setBalance(acc.getBalance()+amount);
		return true;
		
		
	}
	public boolean deductAmount(String accountNumber,int amount) {
		if(!transactionModel.containsKey(accountNumber)) {
			return false;
		}
		TransactionModel acc=transactionModel.get(accountNumber);
		acc.setBalance(acc.getBalance()-amount);
		return true;
		
		
	}
	 

		
	public boolean creditUsingCheque(String accountNumber, String payeeAccountNumber, String chequeNumber,
			String chequeBankName, String chequeIFSC, Date chequeIssueDate, int amount) {
		
		try{
			if(amount<=100 || amount>=100000){
				throw new amountLessException("insufficient");
			}
			else if(payeeAccountNumber.length()!=12){
					throw new Exception("Invalid payee account number");
			}
			else if((accountNumber).length()!=12){
					throw new Exception("Invalid account number");
			}
			else if(chequeNumber.length()!=6){
					throw new Exception("Invalid Cheque number");
			}

				else if(chequeIFSC.length()!=10){
					int charCount=0;
					int numCount=0;
					for(int i=0;i<chequeIFSC.length();i++){
						char ch=chequeIFSC.charAt(i);
						if(ch>='0' && ch<='9'){
							numCount++;
						}
						else if(ch>='A'&&ch<='Z'){
							charCount++;
						}
					}
						if(numCount<=0 || charCount<=0){
						
							throw new Exception("Invalid IFSC code");
						}
     				}
			 		 
				//updateAccountBalance(accountNumber);
				addAmount(accountNumber,amount);
			 System.out.println("Deposited "+amount+" .RS Successfully total amount = "+ getBalanceByID(accountNumber));		 
		}				catch(Exception e) {
					System.out.println(e.getMessage());
				}
				 
				return true;
			
		
  	}

	public boolean debitUsingCheque(String accountNumber, String payeeAccountNumber, String chequeNumber,
			String chequeBankName, String chequeIFSC, Date chequeIssueDate, int amount) {
		try{
			if(amount<=100 && amount>=100000){
				throw new amountLessException("insufficient");
			}
			else if(payeeAccountNumber.length()!=12){
				throw new Exception("Invalid payee account number");
			}
			else if((accountNumber).length()!=12){
				throw new Exception("Invalid account number");
			}
			else if(chequeNumber.length()!=6){
				throw new Exception("Invalid Cheque number");
			}
			else if(chequeIFSC.length()!=10){
				int charCount=0;
				int numCount=0;
				for(int i=0;i<chequeIFSC.length();i++){
					char ch=chequeIFSC.charAt(i);
					if(ch>='0' && ch<='9'){
						numCount++;
					}
					else if(ch>='A'&&ch<='Z'){
						charCount++;
					}
				}
					if(numCount<=0 || charCount<=0){
					
						throw new Exception("Invalid IFSC code");
					}
 				}
			
			deductAmount(accountNumber,amount);
				System.out.println("withdrawn "+amount+" .RS Successfully total amount = "+getBalanceByID(accountNumber));
			
	}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
			 

		return true;


 	}
 	  
	
}

class amountLessException extends Exception{
	amountLessException(String msg){
		super(msg);

	}
}
class AccountException extends Exception{
	AccountException(String msg){
		super(msg);

	}
}


//	
//
//	Scanner in=new Scanner(System.in);
//	
//	Map<String,TransactionModel> transactionModelss=new HashMap<String, TransactionModel>();
//	private String payeeAccountNumber;
//	private String chequeNumber;
//	private String chequeBankName;
//	private String chequeIFSC;
//	private Date chequeIssueDate; 
//	private String accountNumber1;
//	public String getPayeeAccountNumber() {
//		 
//		return payeeAccountNumber;
//	}
//
//	public String getChequeNumber() {
//	 		return chequeNumber;
//	}
//
//	public String getChequeBankName() {
//	 
//		return chequeBankName;
//	}
//
//	public String getChequeIFSC() {
//	 		return chequeIFSC;
//	}
//
//	public Date getChequeIssueDate() {
//	 
//		return chequeIssueDate;
//	}
//
//
//	public void setPayeeAccountNumber(String payeeAccountNumber) {
//		 this.payeeAccountNumber=payeeAccountNumber;
//		
//	}
//
//	public void setChequeNumber(String chequeNumber) {
//		 this.chequeNumber=chequeNumber;
//		
//	}
//
//	public void setChequeBankName(String chequeBankName) {
//		 this.chequeBankName=chequeBankName;
//		
//	}
//
//	public void setChequeIFSC(String chequeIFSC) {
//		 this.chequeIFSC=chequeIFSC;
//		
//	}
//
//	public void setChequeIssueDate(Date chequeIssueDate) {
//		this.chequeIssueDate=chequeIssueDate;
//		
//	}
//	public TransactionUsingChequeDAOImpl(){
//		addAccountDetails();
//	}
//	public void addAccountDetails() {
//		TransactionModel t1=new TransactionModel("123456789012","Rebeca",3000,Arrays.asList(new Transaction(100000000001L,LocalDate.now())));
//		TransactionModel t2=new TransactionModel("123456789013","Prameela",4000,Arrays.asList(new Transaction(100000000002L,LocalDate.now())));
//		transactionModelss.put(t1.getAccountNumber(),t1);
//		transactionModelss.put(t2.getAccountNumber(),t2);
//		System.out.println(t1);
//	}
//
//	public boolean getAccountNumberByID(TransactionModel accountNumber) {
//		if(transactionModelss.containsKey(accountNumber)){
//			return false;
//		}
//		return true;
//	}
//	public int getBalanceByID(int balance) {
//			return transactionModelss.get(balance);
//	}
//	public boolean creditUsingCheque(String payeeAccountNumber, String chequeNumber,
//			String chequeBankName, String chequeIFSC, Date chequeIssueDate, int amount) {
//		System.out.println("enter account Number");
//		accountNumber1=in.next();
//		 
//		 
//			
//		
//		try{
//			if(amount<=100 && amount>=100000){
//				throw new amountLessException("insufficient");
//			}
//			else if(payeeAccountNumber.length()!=12){
//					throw new Exception("Invalid payee account number");
//			}
//			else if((accountNumber1).length()!=12){
//					throw new Exception("Invalid account number");
//			}
//			else if(chequeNumber.length()!=6){
//					throw new Exception("Invalid Cheque number");
//			}
//
//				else if(chequeIFSC.length()!=10){
//					int charCount=0;
//					int numCount=0;
//					for(int i=0;i<chequeIFSC.length();i++){
//						char ch=chequeIFSC.charAt(i);
//						if(ch>='0' && ch<='9'){
//							numCount++;
//						}
//						else if(ch>='A'&&ch<='Z'){
//							charCount++;
//						}
//						else{
//						
//							throw new Exception("Invalid IFSC code");
//						}
//     				}
//				}
//			System.out.println("Deposited "+amount+" .RS Successfully total amount = "+((transactionModelss.get(balance))+amount));		 
//
//		}
//				catch(Exception e) {
//					System.out.println(e.getMessage());
//				}
//				 
//				return true;
//			
//		
//		 
//	}
//
//
//	public boolean debitUsingCheque(String payeeAccountNumber, String chequeNumber,
//			String chequeBankName, String chequeIFSC, Date chequeIssueDate, int amount) {
//
//		try{
//			if(amount<=100 && amount>=100000){
//				throw new amountLessException("insufficient");
//			}
//			else if(payeeAccountNumber.length()!=12){
//				throw new Exception("Invalid payee account number");
//			}
//			else if((accountNumber.getAccountNumber()).length()!=12){
//				throw new Exception("Invalid account number");
//			}
//			else if(chequeNumber.length()!=6){
//				throw new Exception("Invalid Cheque number");
//			}
//			else if(chequeIFSC.length()!=10){
//				int charCount=0;
//				int numCount=0;
//				for(int i=0;i<chequeIFSC.length();i++){
//					char ch=chequeIFSC.charAt(i);
//					if(ch>='0' && ch<='9'){
//						numCount++;
//					}
//					else if(ch>='A'&&ch<='Z'){
//						charCount++;
//					}
//					else{
//					
//						throw new Exception("Invalid IFSC code");
//					}
//			}
//			}
//			else{
//				System.out.println("withdrawn "+amount+" .RS Successfully total amount = "+((transactionModelss.get(balance))-amount));
//			}
//	}
//			catch(Exception e) {
//				System.out.println(e.getMessage());
//			}
//			 
//
//		return true;
//
//	}
//
//	public boolean updateAccountBalance(TransactionModel accountNumber) {
//		if(!transactionModelss.containsKey(accountNumber.getAccountNumber())){
//			return false;
//		}
//		TransactionModel accountToUpdate=transactionModelss.get(accountNumber.getAccountNumber());
//		accountToUpdate.setBalance(accountNumber.get(balance));
//		return true;
//	}
//
//	 
// 	
//}
//class amountLessException extends Exception{
//	amountLessException(String msg){
//		super(msg);
//
//	}
//}
//class AccountException extends Exception{
//	AccountException(String msg){
//		super(msg);
//
//	}
//}
//


