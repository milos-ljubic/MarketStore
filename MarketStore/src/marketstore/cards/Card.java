package marketstore.cards;

public abstract class Card {

	private String cardholder;
	private double turnover;

	public Card(String cardholder, double turnover) {
		this.cardholder = cardholder;
		this.turnover = turnover;
	}

	public String getCardholder() {
		return cardholder;
	}

	public void setCardholder(String cardholder) {
		this.cardholder = cardholder;
	}

	public double getTurnover() {
		return turnover;
	}

	public void setTurnover(double turnover) {
		this.turnover = turnover;
	}

	public abstract double discountRate(double turnover);

}
