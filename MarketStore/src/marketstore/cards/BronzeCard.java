package marketstore.cards;

public class BronzeCard extends Card {

	private double initialRate = 0.0;

	public BronzeCard(String cardholder, double turnover) {
		super(cardholder, turnover);
	}

	@Override
	public double discountRate(double turnover) {
		if (getTurnover() < 0)
			throw new IllegalArgumentException("Illegal value for a turnover.");
		else if (getTurnover() < 100)
			return initialRate;
		else if (getTurnover() <= 300)
			return 0.01;
		else
			return 0.025;
	}

}