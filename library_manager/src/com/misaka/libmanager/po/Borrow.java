package com.misaka.libmanager.po;

import java.sql.Date;

public class Borrow {
	private String id;//账号
	private String account;//密码
	private Date time;//borrow时间
	public Borrow(String id, String account, Date time) {
		super();
		this.id = id;
		this.account = account;
		this.time = time;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public String toString() {
		return "'"+id+"',"+"'"+account+"',"+"'"+time.toString()+"'";
	}
	
}
