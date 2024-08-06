package SigortaYonetimSistemi;

public class HealthInsurance extends Insurance{

	@Override
	public void calculate() {
		// TODO Auto-generated method stub
		this.setPrice(this.getPrice()*2.0);
	}

}
