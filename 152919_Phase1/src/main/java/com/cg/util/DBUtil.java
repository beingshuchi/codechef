package com.cg.util;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import com.cg.bean.Customer;
import com.cg.bean.Transactions;
import com.cg.bean.Wallet;
import com.cg.exception.WalletException;

public class DBUtil {
	
	private static Map<String, Customer> accountDb=new HashMap<String, Customer>();
	private static HashMap<Integer, Transactions> transactons=new HashMap<Integer, Transactions>();
	public static Map<String, Customer> getCustomerData(){
		return accountDb;
	}
	static{
		accountDb.put("9876545005", new Customer("Shalini", "9876545005",new Wallet(new BigDecimal(3400))));
		accountDb.put("9866543035", new Customer("Anu",  "9866543035",new Wallet(new BigDecimal(2340))));
		accountDb.put("7876231066", new Customer("Mark", "7876231066", new Wallet(new BigDecimal(10044))));
		accountDb.put("9542120221", new Customer("Zoya",  "9542120221", new Wallet(new BigDecimal(23584))));

	}
	public static Map<Integer,Transactions> getTransactions(){
		return transactons;
	}
}
