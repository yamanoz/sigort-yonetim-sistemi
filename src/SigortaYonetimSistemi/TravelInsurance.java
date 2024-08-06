package SigortaYonetimSistemi;

public class TravelInsurance extends Insurance {

	@Override
	public void calculate() {
	this.setPrice(this.getPrice()*2.1);	
	}

}
