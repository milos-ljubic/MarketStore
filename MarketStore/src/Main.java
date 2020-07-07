import marketstore.cards.BronzeCard;
import marketstore.cards.Card;
import marketstore.cards.GoldCard;
import marketstore.cards.SilverCard;
import marketstore.paydesk.PayDesk;

public class Main {
	public static void main(String[] args) {

		Card bronzeCard = new BronzeCard("BronzeCardUser", 0);

		Card silverCard = new SilverCard("SilverCardUser", 600);

		Card goldCard = new GoldCard("GoldCardUser", 1500);

		System.out.println("Bronze:");
		PayDesk.printBill(bronzeCard, 150);

		System.out.println("Silver:");
		PayDesk.printBill(silverCard, 850);

		System.out.println("Gold:");
		PayDesk.printBill(goldCard, 1300);

	}

}
