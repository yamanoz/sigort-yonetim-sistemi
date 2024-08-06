package SigortaYonetimSistemi;

import java.util.TreeSet;
import java.util.Date;
public class AccountManager {
	
	private TreeSet<Account> accounts;
	
	public AccountManager() {
		accounts=new TreeSet<>();
		accounts.add(new Enterprise(new User("Burak","Kosova","burak.kosava","341","student",21,new Date())));
		accounts.add(new Enterprise(new User("Burak2","Kosova2","burak.kosava2","342","student2",22,new Date())));
		accounts.add(new Enterprise(new User("Burak3","Kosova3","burak.kosava3","343","student3",23,new Date())));
	}
	
	
	
	public Account login(String email,String sifre) {
		Account account=null;
		for(Account acc:accounts) {
			account=acc;
		}
		try {
			account.login(email, sifre);
		}catch(InvalidAuthenticationException e) {
			System.out.println(e.getMessage());
			System.exit(0);
		}catch(NullPointerException e) {
			System.out.println("Böyle bir kullanıcı bulunamadı!");
			System.exit(0);
		}
		return account;
	}
		
	

}
