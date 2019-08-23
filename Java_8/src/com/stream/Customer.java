package com.stream;

public class Customer {
	private int custId;
	private String proname;
	private double bill;

	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(int custId, String proname, double bill) {
		super();
		this.custId = custId;
		this.proname = proname;
		this.bill = bill;
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getProname() {
		return proname;
	}

	public void setProname(String proname) {
		this.proname = proname;
	}

	public double getBill() {
		return bill;
	}

	public void setBill(double bill) {
		this.bill = bill;
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", proname=" + proname + ", bill=" + bill + "]";
	}

}
