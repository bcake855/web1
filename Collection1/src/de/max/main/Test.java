package de.max.main;

public class Test {

	public static void main(String[] args) {
		
		CampaignListProducer c1 = new CampaignListProducer();
		
		for (Campaign campaign : c1.getCampaigns()) {
			System.out.print(campaign.getName());
		}
		 
	}

}
