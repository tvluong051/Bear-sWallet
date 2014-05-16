package model;

public class DebtSum {
	private Person p;
	private double sum;
	private boolean debt;
	private String description;
	
	public DebtSum(){}
	
	public Person getP() {
		return p;
	}
	public void setP(Person p) {
		this.p = p;
	}
	public double getSum() {
		return sum;
	}
	public void setSum(double sum) {
		this.sum = sum;
	}
	public boolean isDebt() {
		return debt;
	}

	public void setDebt(boolean debt) {
		this.debt = debt;
	}

	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	

}
