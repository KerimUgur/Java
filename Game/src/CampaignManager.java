
public class CampaignManager implements CampaignService{

	@Override
	public void Entry(Campaign campaign) {
		System.out.println("Kampanya eklenmiştir..");
		
	}

	@Override
	public void Delete(Campaign campaign) {
		System.out.println("Kampanya silinmiştir..");
		
	}

	@Override
	public void Update(Campaign campaign) {
		System.out.println("Kampanya güncellenmiştir..");
		
	}
	

}
