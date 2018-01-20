package de.max.main;

import java.util.List;

public class Campaign {
	
	private String name;
	private Double donationMinimum ;
	private Double targetAmount;
	private Double amountDonatedSoFar;
	private Account account;
	private int id;
	private List<Donation> donations;
	
	public Campaign(){
		account = new Account();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getDonationMinimum() {
		return donationMinimum;
	}

	public void setDonationMinimum(Double donationMinimum) {
		this.donationMinimum = donationMinimum;
	}

	public Double getTargetAmount() {
		return targetAmount;
	}

	public void setTargetAmount(Double targetAmount) {
		this.targetAmount = targetAmount;
	}

	public Double getAmountDonatedSoFar() {
		return amountDonatedSoFar;
	}

	public void setAmountDonatedSoFar(Double amountDonatedSoFar) {
		this.amountDonatedSoFar = amountDonatedSoFar;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Donation> getDonations() {
		return donations;
	}

	public void setDonations(List<Donation> donations) {
		this.donations = donations;
	}
	
	
	
	
	
	
}
