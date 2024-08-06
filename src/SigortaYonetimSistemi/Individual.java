package SigortaYonetimSistemi;

import java.util.ArrayList;

public class Individual extends Account {
	//bireysel müsteri

	
	public Individual() {
		this.setAuthentication(AuthenticationStatus.FAİL);
		this.setInsurances(new ArrayList<>());
	}
	
	public Individual(User user) {
		this();
		this.setUser(user);
	}
	
	
	

	@Override
	public void addAddress(String address) {
		// TODO Auto-generated method stub
		AddressManager.addAddress(this.getUser(), new HomeAddress(address));
		
	}

}
