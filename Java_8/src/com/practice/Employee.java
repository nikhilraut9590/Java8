package com.practice;

public class Employee {
	private int empId;
	private String eName;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", eName=" + eName + "]";
	}

	public Employee(int empId, String eName) {
		super();
		this.empId = empId;
		this.eName = eName;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	
	  @Override
	  public int hashCode()
	  { // TODO Auto-generated method stub return
	  return this.empId;
	  }
	
	  @Override
	public boolean equals(Object obj) {
		  Employee employee=null;
		if(obj==null) {
			return false;
		}
		if(obj instanceof Employee) {
			employee=(Employee)obj;
			return true;
		}
		if(this.empId==employee.getEmpId() && this.eName.equals(employee.geteName())) {
			return true;
		}
		return false;
	}
}
