package SigortaYonetimSistemi;

import java.util.List;
import java.util.Objects;

public abstract class Account implements Comparable<Account>{
	
	
	enum AuthenticationStatus{
		SUCCESS,
		FAİL
	}
	private AuthenticationStatus authentication;
	private User user;
	private List<Insurance> insurances;
	
	public final void showUserInfo() {
		System.out.println(user.getIsim()+" "+user.getSoyadi()+" "+user.getEmail()+" "+user.getMeslek()+" "+user.getYas());
		for(Address a: this.user.getAdres()) {
			System.out.println(a.getAddress());
		}
	}

	
	public void addInsurance(Insurance insurance) {
		insurance.calculate();
		this.getInsurances().add(insurance);
	}
	
	
	
	public void login(String email,String sifre) throws InvalidAuthenticationException{
		if(email.equals(this.user.getEmail())&& sifre.equals(this.getUser().getSifre())) {
			this.authentication=AuthenticationStatus.SUCCESS;
		}
		else
			throw new InvalidAuthenticationException("Kullanıcı bilgileri hatalı!");
	}
	
	
	
	public AuthenticationStatus getAuthentication() {
		return authentication;
	}

	public void setAuthentication(AuthenticationStatus authentication) {
		this.authentication = authentication;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<Insurance> getInsurances() {
		return insurances;
	}

	public void setInsurances(List<Insurance> insurances) {
		this.insurances = insurances;
	}
	
	
	
	public abstract void addAddress(String address);
	
	 @Override
	    public int compareTo(Account o) {
	        return this.hashCode() - o.hashCode();
	    }

	    @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;
	        Account account = (Account) o;
	        return Objects.equals(user, account.user);
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(user);
	    }
	
	
	
	
	
}
