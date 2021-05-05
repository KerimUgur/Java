
public class Main {

	public static void main(String[] args) {
		Player player = new Player(1, "Kerim Uğur", "Uğur Heper","123456", "kerimugur62@gmail.com");
		Player player2 = new Player(2, "Nacarboi", "Yusufcan Nacar", "09876", "yusufnacar@gmail.com");
		
		
		
		
		
		PlayerManager playerManager = new PlayerManager();
		playerManager.Add(player);
		playerManager.Delete(player2);
		
		GameManager gameManager = new GameManager(new Validation());
		Game game = new Game(1, "RocketLeague", "Online", 18);
		Game game2 = new Game(2, "Valorant", "FPS", 0);
		gameManager.Add(game);
		gameManager.Add(game2);
		
		CampaignManager campaignManager = new CampaignManager();
		Campaign campaign = new Campaign(1, "Ramazan bayramı indirimi başlıyor..", "%50");
		campaignManager.Entry(campaign);
		
		
		

	}

}
