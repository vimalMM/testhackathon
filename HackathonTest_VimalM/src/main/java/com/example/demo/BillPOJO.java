package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Table(name="Bills")

@Entity
@Data
public class BillPOJO {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;	
	private String billNumber;
	private String billedTo;
	
	private String billedDate;
	private String billedPrice;
	private String taxontheBill;
	private String totalPrice;
	public BillPOJO(Long id, String billNumber, String billedTo, String billedDate, String billedPrice,
			String taxontheBill, String totalPrice) {
		super();
		this.id = id;
		this.billNumber = billNumber;
		this.billedTo = billedTo;
		this.billedDate = billedDate;
		this.billedPrice = billedPrice;
		this.taxontheBill = taxontheBill;
		this.totalPrice = totalPrice;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getBillNumber() {
		return billNumber;
	}
	public void setBillNumber(String billNumber) {
		this.billNumber = billNumber;
	}
	public String getBilledTo() {
		return billedTo;
	}
	public void setBilledTo(String billedTo) {
		this.billedTo = billedTo;
	}
	public String getBilledDate() {
		return billedDate;
	}
	public void setBilledDate(String billedDate) {
		this.billedDate = billedDate;
	}
	public String getBilledPrice() {
		return billedPrice;
	}
	public void setBilledPrice(String billedPrice) {
		this.billedPrice = billedPrice;
	}
	public String getTaxontheBill() {
		return taxontheBill;
	}
	public void setTaxontheBill(String taxontheBill) {
		this.taxontheBill = taxontheBill;
	}
	public String getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(String totalPrice) {
		this.totalPrice = totalPrice;
	}
	public BillPOJO() {
	
		// TODO Auto-generated constructor stub
	}
}