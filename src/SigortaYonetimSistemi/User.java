package SigortaYonetimSistemi;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class User {
	
	
	private String isim;
	private String soyadi;
	private String email;
	private String sifre;
	private String meslek;
	private int yas;
	private List<Address> adresList;
	private Date lastLogin;
	
	
	public User() {
		
	}


	public User(String isim, String soyadi, String email, String sifre, String meslek, int yas, 
			Date lastLogin) {
		super();
		this.isim = isim;
		this.soyadi = soyadi;
		this.email = email;
		this.sifre = sifre;
		this.meslek = meslek;
		this.yas = yas;
		this.adresList =new ArrayList<Address>();
		this.lastLogin = lastLogin;
	}


	public String getIsim() {
		return isim;
	}


	public void setIsim(String isim) {
		this.isim = isim;
	}


	public String getSoyadi() {
		return soyadi;
	}


	public void setSoyadi(String soyadi) {
		this.soyadi = soyadi;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getSifre() {
		return sifre;
	}


	public void setSifre(String sifre) {
		this.sifre = sifre;
	}


	public String getMeslek() {
		return meslek;
	}


	public void setMeslek(String meslek) {
		this.meslek = meslek;
	}


	public int getYas() {
		return yas;
	}


	public void setYas(int yas) {
		this.yas = yas;
	}


	public List<Address> getAdres() {
		return adresList;
	}


	public void setAdres(List<Address> adresList) {
		this.adresList = adresList;
	}


	public Date getLastLogin() {
		return lastLogin;
	}


	public void setLastLogin(Date lastLogin) {
		this.lastLogin = lastLogin;
	}
	
	
	@Override
	public boolean equals(Object o) {
		if(this==o) return true;
		if(this==null||getClass()!=o.getClass()) return false;
		User user=(User) o;
		return Objects.equals(email,user.email);
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(email);
	}
	
	
	
	
	

}
