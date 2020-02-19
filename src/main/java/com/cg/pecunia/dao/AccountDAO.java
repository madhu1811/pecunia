package com.cg.pecunia.dao;

import com.cg.pecunia.bean.Account;
import com.cg.pecunia.bean.Cheque;
import com.cg.pecunia.exception.AccountException;

public interface AccountDAO {
	public int creditCheque(Cheque cheque)throws AccountException;
	public int debitCheque(Cheque cheque)throws AccountException;
	public int updateBalance(Cheque cheque)throws AccountException;

}
