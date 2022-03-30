package sikidom.tarol;

import sikidom.Henger;
import sikidom.Teglatest;

public class Proba {

	public static void main(String[] args) {
		HasabTarol hasabok = new HasabTarol(5);
		
		hasabok.hasabHozzaAd(0, new Henger(2, 4));
		hasabok.hasabHozzaAd(1, new Teglatest(3, 4, 5));
		hasabok.hasabHozzaAd(2, null);
		hasabok.hasabHozzaAd(3, new Teglatest(1, 2, 5));
		hasabok.hasabHozzaAd(4, new Henger(1, 2));
	

		
		for (int i = 0; i < hasabok.getMeret(); i++) {
			if(hasabok.getIndexElem(i) != null)
				System.out.println(hasabok.getIndexElem(i).toString());
			else
				System.out.println("Null elem!");
		}
		
		System.out.println("A hegerek szama: " + hasabok.getHengerHasabokSzama());
		System.out.println("Az atlagos terfogat: " + hasabok.getAtlagosTerfogat());
		
		

		
	}

}
