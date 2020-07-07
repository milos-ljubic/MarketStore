package marketstore.paydesk;

import marketstore.cards.Card;

public class PayDesk {

	private static double discountRate(Card card) {
		return card.discountRate(card.getTurnover());
	}

	private static double discount(Card card, double purchaseValue) {
		if (purchaseValue < 0)
			throw new IllegalArgumentException("Illegal value for the purchaseValue.");
		else
			return purchaseValue * discountRate(card);
	}

	private static double total(double purchaseValue, double discount) {
		return purchaseValue - discount;
	}

	public static void printBill(Card card, double purchaseValue) {

		double discountRate = PayDesk.discountRate(card);
		double discount = PayDesk.discount(card, purchaseValue);
		double total = PayDesk.total(purchaseValue, discount);

		System.out.printf("Purchase value: $%.2f%n", purchaseValue);
		System.out.printf("Discount rate: %.1f%%%n", discountRate * 100);
		System.out.printf("Discount: $%.2f%n", discount);
		System.out.printf("Total: $%.2f%n", total);
		System.out.println();
	}

}
