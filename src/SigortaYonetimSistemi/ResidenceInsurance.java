package SigortaYonetimSistemi;

public class ResidenceInsurance extends Insurance{

	@Override
	public void calculate() {
		this.setPrice(this.getPrice()*1.5);
	}

}
