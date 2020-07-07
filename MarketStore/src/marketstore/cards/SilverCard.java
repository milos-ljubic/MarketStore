package marketstore.cards;

public class SilverCard extends Card {

	private double initialRate = 0.02;

	public SilverCard(String cardholder, double turnover) {
		super(cardholder, turnover);
	}

	@Override
	public double discountRate(double turnover) {
		if (getTurnover() < 0)
			throw new IllegalArgumentException("Illegal value for a turnover.");
		else if (getTurnover() <= 300)
			return initialRate;
		else
			return 0.035;
	}

}
