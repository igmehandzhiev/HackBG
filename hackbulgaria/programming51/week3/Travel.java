package com.hackbulgaria.programming51.week3;

public class Travel {
	private String country;
	private String city;
	private double vat;
	public TravelExpense[] employees = new TravelExpense[10];
	public double totalCost = 0;
	public double totalNetCost = 0;
	public Employee[] employee;
	public int index = 0;

	public Travel(String city, String country, double vat) {
		this.country = country;
		this.city = city;
		this.vat = vat;
	}

	public String getCountry() {
		return country;
	}

	public String getCity() {
		return city;
	}

	public void addExpense(TravelExpense expense) {
		employees[index] = expense;
		this.totalNetCost += expense.getCost();
		this.totalCost = this.totalNetCost + this.totalNetCost / 5;
		index++;

	}

	public double totalCost() {
		return totalCost;
	}

	public double totalNetCost() {
		return totalNetCost;
	}

	public TravelExpense[] mostExpensesMadeBy() {
		int indexA = -1;
		int indexMax = -1;
		TravelExpense[] flop = new TravelExpense[2];
		for (int i = 0; i < 2; ++i) {
			int max = 0;
			for (int j = 0; j < index; ++j) {
				if (indexMax == j)
					continue;
				else if (max < employees[j].getCost()) {
					max = employees[j].getCost();
					indexA = j;
				}
			}
			indexMax=indexA;
			flop[i] = employees[indexA];
		}
		return flop;
	}
}
