package com.cg.pecunia.pl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.cg.pecunia.dao.TransactionUsingChequeDAO;
import com.cg.pecunia.dao.TransactionUsingChequeDAOImpl;

public class Client {
	static TransactionUsingChequeDAO transactionService=new TransactionUsingChequeDAOImpl();
	static Scanner scanner =new Scanner(System.in);

	public static void main(String[] args) throws ParseException {
	
		for(;;){
			int choice;
			System.out.println("Enter your choice");
			System.out.println("1.Credit Using Cheque");
			System.out.println("2.Debit Using Cheque");
			System.out.println("3.Exit");
			choice=scanner.nextInt();
			switch(choice){
			case 1:
				creditUsingChequeInfo();
				break;
			case 2:
				debitUsingChequeInfo();
				break;
			case 3:
				System.out.println("THANK YOU!!");
				System.exit(0);
				break;
			default:
				System.out.println("Invalid choice");
				break;
			
			}
		}
	}
 	private static void creditUsingChequeInfo() throws ParseException {
		 System.out.println("Enter payeeAccountNumber ");
		 String payeeAccountNumber = scanner.next();
		 System.out.println("Enter account number");
		 String accountNumber=scanner.next();;
		 System.out.println("Enter cheque number");
		 String chequeNumber=scanner.next();
		 System.out.println("Enter  cheque IFSC code");
		 String chequeIFSC=scanner.next();
		 System.out.println("Enter amount to be credited");
		 int amount=scanner.nextInt();
		 System.out.println("Enter Bank name");
		 String chequeBankName=scanner.next();
		 System.out.println("Enter Date");
		 String date=scanner.next();
		 Date chequeIssueDate=new SimpleDateFormat("dd-MM-yyyy").parse(date);

		 if(transactionService.creditUsingCheque(accountNumber,payeeAccountNumber, chequeNumber, chequeBankName, chequeIFSC, chequeIssueDate, amount)){
			 System.out.println("Amount deposited Successfully");
		 }
		 
	}
 	private static void debitUsingChequeInfo() throws ParseException {
		 System.out.println("Enter payeeAccountNumber ");
		 String payeeAccountNumber = scanner.next();
		 System.out.println("Enter account number");
		 String accountNumber=scanner.next();
		 System.out.println("Enter cheque number");
		 String chequeNumber=scanner.next();
		 System.out.println("Enter  cheque IFSC code");
		 String chequeIFSC=scanner.next();
		 System.out.println("Enter amount to be debited");
		 int amount=scanner.nextInt();
		 System.out.println("Enter Bank name");
		 String chequeBankName=scanner.next();
		 System.out.println("Enter Date");
		 String date=scanner.next()+scanner.nextLine();
		 Date chequeIssueDate=new SimpleDateFormat("dd-mm-yyyy").parse(date);
		 
	
		if(transactionService.debitUsingCheque(accountNumber,payeeAccountNumber, chequeNumber,chequeBankName,chequeIFSC,chequeIssueDate,amount)){
			 System.out.println("Amount withdrawn Successfully");
		 }
		 
	}


		
	}


