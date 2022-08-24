package entities;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Application {
	@JsonProperty("Monatliche Einnahmen")
	private double monthlyIncome;

	@JsonProperty("Monatliche Ausgaben")
	private double monthlyExpenses;

	@JsonProperty("Höhe des Kredits")
	private double creditAmount;

	public double getMonthlyIncome() {
		return monthlyIncome;
	}

	public void setMonthlyIncome(double monthlyIncome) {
		this.monthlyIncome = monthlyIncome;
	}

	public double getMonthlyExpenses() {
		return monthlyExpenses;
	}

	public void setMonthlyExpenses(double monthlyExpenses) {
		this.monthlyExpenses = monthlyExpenses;
	}

	public double getCreditAmount() {
		return creditAmount;
	}

	public void setCreditAmount(double creditAmount) {
		this.creditAmount = creditAmount;
	}
}
