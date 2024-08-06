package SigortaYonetimSistemi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 AccountManager accountManager = new AccountManager();
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("E-posta adresini giriniz: ");
	        String email = scanner.nextLine();
	        System.out.print("Şifre giriniz: ");
	        String sifre = scanner.nextLine();
	        Account account = accountManager.login(email,sifre);
	        System.out.println("Hoşgeldin "+account.getUser().getIsim()+" "+account.getUser().getSoyadi());
	        account.addAddress("Inegöl/BURSA");
	        account.addAddress("Beşiktaş/İSTANBUL");
	        account.addAddress("Tepebaşı/ESKİŞEHİR");
	        account.addInsurance(new CarInsurance());
	        account.showUserInfo();
	}

}
