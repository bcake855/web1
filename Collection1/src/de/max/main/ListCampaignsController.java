package de.max.main;

import java.io.Serializable;

import javax.faces.bean.SessionScoped;

@SessionScoped
public class ListCampaignsController implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public String doAddCampaign(){
		System.out.print("Add a bloody campaign");
		return Pages.EDIT_CAMPAIGN;
	}
	
	public String doEditCompaign(Campaign campaign){
		System.out.print("Edit this campaign:" + campaign);
		return Pages.EDIT_CAMPAIGN;
	}
	
	public String doEditDonationForm(Campaign campaign){
		System.out.print("Edit donation form of campaign:" + campaign);
		return Pages.EDIT_DONATION_FORM;
	}
	public String doListDonations(Campaign campaign){
		System.out.print("List donations of campagin:" + campaign);
		return Pages.LIST_DONATIONS;
	}
	public void doDeleteCampaign(Campaign campaign){
		System.out.print("Deleting this campaign:" + campaign + "(Not implemented yet!)");
	}

	
	
}
