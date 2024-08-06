package SigortaYonetimSistemi;

public class AddressManager {

	public static void addAddress(User user,Address address) {
		user.getAdres().add(address);
	}
}
