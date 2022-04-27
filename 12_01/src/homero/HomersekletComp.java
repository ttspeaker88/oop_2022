package homero;

import java.util.Comparator;

public class HomersekletComp implements Comparator<Homerseklet>{

	@Override
	public int compare(Homerseklet o1, Homerseklet o2) {
	
		return (int) (o1.getHomerseklet() - o2.getHomerseklet());
	}

}
