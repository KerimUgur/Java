
public class Validation implements ValidationService{

	@Override
	public boolean Validate(Player player) {
		if (this.passwordValidate(player.password)) {
			System.out.println("Kullanıcı kabul edildi");
			return true;
		}
		System.out.println("Yanlış parola girdiniz");
		return false;
	}

	@Override
	public boolean passwordValidate(String password) {
		if (this.passwordValidate("123456")) {
			return true;
		}
		return false;
	}

	

}
