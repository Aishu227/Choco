package com.chocomad.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Chocolates {
	@Id
	private int Billno;
	private String Name;
	private String itemname;
	private int Quantity;
	private int Amount;
	public int getBillno() {
		return Billno;
	}
	public void setBillno(int billno) {
		Billno = billno;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getItemname() {
		return itemname;
	}
	public void setItemname(String itemname) {
		this.itemname = itemname;
	}
	public int getQuantity() {
		return Quantity;
	}
	public void setQuantity(int quantity) {
		Quantity = quantity;
	}
	public int getAmount() {
		return Amount;
	}
	public void setAmount(int amount) {
		Amount = amount;
	}

}
