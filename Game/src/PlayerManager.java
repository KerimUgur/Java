
public class PlayerManager implements PlayerService{

	@Override
	public void Add(Player player) {
		System.out.println("Oyuncu eklenmiştir : " + player.fullName);
		
	}

	@Override
	public void Delete(Player player) {
		System.out.println("Oyuncu silinmiştir : " + player.fullName);
		
	}

	@Override
	public void Update(Player player) {
		System.out.println("Oyuncu güncellenmiştir : " + player.fullName);
		
	}
	

}
