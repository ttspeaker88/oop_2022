package bank;

import java.util.Comparator;

public class DatumComp implements Comparator<Card> {

	@Override
	public int compare(Card o1, Card o2) {
		return o1.getErvenyesseg().compareTo(o2.getErvenyesseg());
	}
}