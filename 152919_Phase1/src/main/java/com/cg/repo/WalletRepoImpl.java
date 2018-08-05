package com.cg.repo;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Map;

import com.cg.bean.Customer;
import com.cg.bean.Transactions;
import com.cg.bean.Wallet;
import com.cg.exception.WalletException;
import com.cg.util.DBUtil;

public class WalletRepoImpl implements IWalletRepo{
private Map<String,Customer> data=DBUtil.getCustomerData();
//private Map<Integer, Transactions> trans=DBUtil.getTransactions();

	@Override
	public boolean save(Customer customer) throws WalletException {
		data.put(customer.getMobileNo(), customer);
			
		return true;
	}
	
	@Override
	public Customer find(String mobile) throws WalletException {
		// TODO Auto-generated method stub
		return data.get(mobile);
		
	}

	
	

	

}
