package com.cg.bean;


import java.util.List;

/**
 * @author SHUCHITA
 *
 */
public class Transactions {
	private int id=(int) Math.random()*100;
	private Wallet wallet;
	/*private List<Deposit> deposit;
	private List<Withdraw> withdraw;*/
	
	
	public Wallet getWallet() {
		return wallet;
	}
	public void setWallet(Wallet wallet) {
		this.wallet = wallet;
	}
	/*public List<Deposit> getDeposit() {
		return deposit;
	}
	public void setDeposit(List<Deposit> deposit) {
		this.deposit = deposit;
	}*/
	
	
	public int getId() {
		return id;
	}
	
	
	/*public List<Withdraw> getWithdraw() {
		return withdraw;
	}
	public void setWithdraw(List<Withdraw> withdraw) {
		this.withdraw = withdraw;
	}*/
	
	/*public Transactions( Wallet wallet, List<Deposit> deposit, List<Withdraw> withdraw) {
		super();
		this.wallet = wallet;
		this.deposit = deposit;
		this.withdraw = withdraw;
	}
	*/
	/*@Override
	public String toString() {
		return "Transactions [id=" + id + ", wallet=" + wallet + ", deposit=" + deposit + ", withdraw=" + withdraw
				+ "]";
	}*/
	public Transactions() {
		super();
		// TODO Auto-generated constructor stub
	}
	/*public Transactions(Wallet wallet, List<Deposit> deposit) {
		// TODO Auto-generated constructor stub
		this.wallet = wallet;
		this.deposit = deposit;
	}
	
	*/
}
