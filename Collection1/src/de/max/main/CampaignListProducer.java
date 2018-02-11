package de.max.main;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

import javax.faces.bean.SessionScoped;

import de.max.main.Donation.Status;

@SessionScoped

public class CampaignListProducer implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<Campaign> campaigns;
	
	public CampaignListProducer(){
		campaigns = createMockCampaigns();
	}


	public List<Campaign> getCampaigns() {
		return campaigns;
	}

//	public void setCampaigns(List<Campaign> campaigns) {
//		this.campaigns = campaigns;
//	}

	private List<Campaign> createMockCampaigns() {
		Donation donation1 = new Donation();
		donation1.setDonorName("Hulk Green");
		donation1.setAmount(6.2);
		donation1.setReceiptRequested(true);
		donation1.setStatus(Status.TRANSFERRED);
		donation1.setAccount(new Account( donation1.getDonorName(), "upper body", "left vein"));
		
		Donation donation2 = new Donation();
		donation2.setDonorName("Captain America");
		donation2.setAmount(2.1);
		donation2.setReceiptRequested(false);
		donation2.setStatus(Status.IN_PROCESS);
		donation2.setAccount(new Account( donation1.getDonorName(), "upper body", "left vein"));
		
		List<Donation> donations = new LinkedList<Donation>();
		donations.add(donation1);
		donations.add(donation2);
		
		Campaign campaign1 = new Campaign();
		campaign1.setName("Blod from heros to zeros!");
		campaign1.setTargetAmount(1200.0);
		campaign1.setAmountDonatedSoFar(350.4);
		campaign1.setDonationMinimum(2.0);
		campaign1.setId(100);
		campaign1.setAccount(new Account("Hospital San Diego For Friends", "Bank of Sun", "US66612345"));
		campaign1.setDonations(donations);
		
		Campaign campaign2 = new Campaign();
		campaign2.setName("Saliva from aliens!");
		campaign2.setTargetAmount(300.0);
		campaign2.setAmountDonatedSoFar(13.2);
		campaign2.setDonationMinimum(12.0);
		campaign2.setId(200);
		campaign2.setAccount(campaign1.getAccount());
		campaign2.setDonations(donations);
		
		List<Campaign> ret = new LinkedList<Campaign>();
		ret.add(campaign1);
		ret.add(campaign2);
		return ret;
		
	}
	
}
