package homero;

import java.util.Arrays;

public class HoProba {
	public static void main(String[] args) {
		Homerseklet[] homersekletek = new Homerseklet[4];
		homersekletek[0] = new Homerseklet(15, Mertekegyseg.CELSIUS);
		homersekletek[1] = new Homerseklet(300, Mertekegyseg.KELVIN);

		for (int i = 2; i < homersekletek.length; i++) {
			homersekletek[i] = new Homerseklet(Math.random() * 100);
		}

		System.out.println("Adatok:");
		printData(homersekletek);

		System.out.println("\nKonvertálás:");
		double hom1Kel = Homerseklet.konvHomerseklet(homersekletek[0].getHomerseklet(),
				Mertekegyseg.KELVIN);
		double hom2Cels = Homerseklet.konvHomerseklet(homersekletek[1].getHomerseklet(),
				Mertekegyseg.CELSIUS);
		System.out.println("A " + homersekletek[0].getHomerseklet() + homersekletek[0].getMertekE()
				+ " homerseklet Kelvinben: " + hom1Kel);
		System.out.println("A " + homersekletek[1].getHomerseklet() + homersekletek[1].getMertekE()
				+ " homerseklet Celsiusban: " + hom2Cels);

		System.out.println();

		System.out.println("Atlag homerseklet (Kelvin): " + atlagHomerseklet(homersekletek));

		System.out.println("\nRendezve:");
		HomersekletComp comp = new HomersekletComp();
		Arrays.sort(homersekletek, comp);
		printData(homersekletek);

		Homerseklet keresett = new Homerseklet(100);
		System.out.print("\nKeresett elem: " + keresett);
		int index = Arrays.binarySearch(homersekletek, keresett, comp);

		if (index == -1)
			System.out.print(" nem található.");
		else
			System.out.print("indexe: " + homersekletek[index]);
	}

	
	public static double atlagHomerseklet(Homerseklet[] homersekletek) {
		double sum = 0;

		for (int i = 0; i < homersekletek.length; i++) {
			if (homersekletek[i].getMertekE() != Mertekegyseg.KELVIN) {
				homersekletek[i].setHomerseklet(Homerseklet.konvHomerseklet(homersekletek[i].getHomerseklet(),
						Mertekegyseg.KELVIN));
				homersekletek[i].setMertekE(Mertekegyseg.KELVIN);
			}
			sum += homersekletek[i].getHomerseklet();
		}

		return sum / homersekletek.length;
	}

	
	private static void printData(Homerseklet[] homersekletek) {
		for (int i = 0; i < homersekletek.length; i++) {
			System.out.println(homersekletek[i].toString());
		}
	}
}