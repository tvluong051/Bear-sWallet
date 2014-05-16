package model;

import java.util.ArrayList;

public class Wallet {
	private ArrayList<DebtSum> myDebt;
	private ArrayList<DebtSum> myOwe;
	private ArrayList<Person> debteur;
	private double debt;
	private double owe;
	
	private Wallet(){
		myDebt = new ArrayList<DebtSum>();
		myOwe = new ArrayList<DebtSum>();
		debt = 0.0;
		owe = 0.0;
	}
	
	private static Wallet INSTANCE = null;
	
	public static Wallet getWallet(){
		if(INSTANCE == null){
			INSTANCE = new Wallet();
		}
		return INSTANCE;
	}
	
	public void addDebtSum(DebtSum debt){
		myDebt.add(debt);
		this.debt += debt.getSum();
	}
	
	public void addOweSum(DebtSum owe){
		myOwe.add(owe);
		this.owe += owe.getSum();
	}
	
	public double getDebtByPeople(Person p){
		double sum = 0.0;
		for(DebtSum ds : myDebt){
			if(p.equals(ds.getP())){
				sum += ds.getSum();
			}
		}
		return sum;
	}
	
	public double getOweByPeople(Person p){
		double sum = 0.0;
		for(DebtSum ds : myOwe){
			if(p.equals(ds.getP())){
				sum += ds.getSum();
			}
		}
		return sum;
	}

	public ArrayList<Person> getDebteur() {
		return debteur;
	}

	public void setDebteur(ArrayList<Person> debteur) {
		this.debteur = debteur;
	}

	public double getDebt() {
		return debt;
	}

	public void setDebt(double debt) {
		this.debt = debt;
	}

	public double getOwe() {
		return owe;
	}

	public void setOwe(double owe) {
		this.owe = owe;
	}
	
}
