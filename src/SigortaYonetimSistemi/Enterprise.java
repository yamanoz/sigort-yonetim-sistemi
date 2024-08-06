package SigortaYonetimSistemi;

import java.util.ArrayList;

public class Enterprise extends Account{

	
	
	
	public Enterprise() {
		this.setAuthentication(AuthenticationStatus.FAİL);
		this.setInsurances(new ArrayList<>());
	}
	
	public Enterprise(User user) {
		this();
		this.setUser(user);
	}
	
	
	@Override
	public void addAddress(String address) {
		// TODO Auto-generated method stub
		AddressManager.addAddress(this.getUser(), new BusinessAddress(address));
	}

}
