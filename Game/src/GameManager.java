
public class GameManager implements GameService{
	Validation validation;
	
	


	public GameManager(Validation validation) {
		this.validation = validation;
	}

	public Validation getValidation() {
		return validation;
	}

	public void setValidation(Validation validation) {
		this.validation = validation;
	}

	@Override
	public void Add(Game game) {
		System.out.println("Oyun eklendi.. " + game.name);
		
	}

	@Override
	public void Delete(Game game) {
		System.out.println("Oyun silindi.. " + game.name);
		
	}

	@Override
	public void Update(Game game) {
		System.out.println("Oyun güncellendi.. " + game.name);
		
	}

	

}
