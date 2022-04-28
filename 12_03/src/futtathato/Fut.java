package futtathato;

import java.time.LocalDate;
import java.util.Arrays;

import bank.Bank;
import bank.Card;
import bank.CreditCard;
import bank.DatumComp;

public class Fut {
	public static void main(String args[]) {
		Card kartyak[] = new Card[4];

		Card card0 = new CreditCard("Kiss Tamás", LocalDate.of(2020, 4, 30), Bank.OTP, 150000, 100000);
		Card card1 = new Card("Nagy Levente", LocalDate.of(2022, 5, 31), Bank.ERSTE, 100000);
		Card card2 = new CreditCard("Szabó László", LocalDate.of(2019, 3, 31), Bank.OTP, 200000, 100000);
		Card card3 = new Card("Kovács Edit", LocalDate.of(2023, 1, 31), Bank.CIB, 250000);

		kartyak[0] = card0;
		kartyak[1] = card1;
		kartyak[2] = card2;
		kartyak[3] = card3;

		adatokKiir(kartyak);

		int penzfelvetOsszegek[] = { 280000, 80000, 50000, 100000 };
		for (int i = 0; i < penzfelvetOsszegek.length; i++) {
			System.out.println();
			penzKivesz(kartyak, i, penzfelvetOsszegek[i]);
		}

		System.out.println("\nA CIB kartyak szama: " + getCIBBankkartyaSzama(kartyak));

		System.out.println("\nRendezett tömb:");
		DatumComp comp = new DatumComp();
		Arrays.sort(kartyak, comp);
		adatokKiir(kartyak);
	}

	private static void penzKivesz(Card[] kartyak, int index, int osszeg) {
		if (kartyak[index].penzFelfevetel(osszeg)) {
			System.out.println("Sikeres pénzfelvét.");
			System.out.println("Új egyenleg: " + kartyak[index].getEgyenleg());
		} else {
			System.out.println("Sikertelen pénzfelvét.");
			System.out.println(kartyak[index].toString());
		}
	}

	private static void adatokKiir(Card[] kartya) {
		for (Card card : kartya) {
			System.out.println(card);
		}
	}

	public static int getCIBBankkartyaSzama(Card[] kartya) {
		int db = 0;

		for (Card card : kartya) {
			if (card.getBank() == Bank.CIB) {
				db++;
			}
		}

		return db;
	}

}