package marketstore.cards;

public class GoldCard extends Card {

	private double initialRate = 0.02;

	public GoldCard(String cardholder, double turnover) {
		super(cardholder, turnover);
	}

	// discount starts at 2% and for each 100$ grow by 1% with a cap at 10%
	@Override
	public double discountRate(double turnover) {
		if (getTurnover() < 0)
			throw new IllegalArgumentException("Illegal value for a turnover.");
		else {
			int x = (int) (getTurnover() / 100);
			if (x < 8)
				return (initialRate + x * 0.01);
			else
				return 0.10;
		}
	}

}
