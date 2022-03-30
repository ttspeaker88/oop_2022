package sikidom.proba;

import sikidom.Hasab;
import sikidom.Henger;
import sikidom.Teglatest;

public class Proba {

	public static void main(String[] args) {

		Hasab h = new Henger(5, 2);
		Hasab t = new Teglatest(2, 3, 5);

		System.out.println(h);
		System.out.println(t);

		if (h.hasabHasonlit(t)) {
			System.out.println("A henger a nagyobb terfogatu.");
		} else {
			System.out.println("A teglatest a nagyobb terfogatu.");
		}

	}

}
