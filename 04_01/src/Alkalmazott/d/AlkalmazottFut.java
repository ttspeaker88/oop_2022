package Alkalmazott.d;

public class AlkalmazottFut {

	public static void main(String[] args) {
		Alkalmazott[] alkTomb = new Alkalmazott[5];

		tombFeltolt(alkTomb);
		tombKiir(alkTomb);

		Alkalmazott maxFizAlk = getLegmagasabbFiz(alkTomb);
		System.out.println("A legnagyobb fizetesu alkalmazott: " + maxFizAlk.getAdatok());

		int dbFizHatarok = getAlkDbFizIntervallum(alkTomb, 10, 30);
		System.out.println("A fizetes hatarok koze eso alklamazottak szama: " + dbFizHatarok);

		double atlagFiz = getAtlagFiz(alkTomb);
		System.out.println("Az alkalmazottak atlag fizetese: " + atlagFiz);

		double osszAdo = getAdoOssz(alkTomb);
		System.out.println("Az alkalmazottak altal befizetett ado osszerteke: " + osszAdo);
	}

	private static void tombKiir(Alkalmazott[] alkTomb) {
		for (Alkalmazott alkalmazott : alkTomb) {
			System.out.println(alkalmazott.getAdatok());
		}
	}

	private static void tombFeltolt(Alkalmazott[] alkTomb) {
		for (int i = 0; i < alkTomb.length; i++) {
			alkTomb[i] = new Alkalmazott();
			alkTomb[i].setNev("Tomi" + i);
			alkTomb[i].setFizetes((int) ((Math.random() * 100) + 1));
		}
	}

	private static Alkalmazott getLegmagasabbFiz(Alkalmazott[] inputTomb) {
		Alkalmazott max = inputTomb[0];

		for (Alkalmazott alk : inputTomb) {
			if (alk.getFizetes() > max.getFizetes()) {
				max = alk;
			}
		}

		return max;
	}

	private static int getAlkDbFizIntervallum(Alkalmazott[] inputTomb, int also, int felso) {
		int db = 0;

		for (Alkalmazott alk : inputTomb) {
			if (alk.getFizHatarok(also, felso) == true)
				db++;
		}

		return db;
	}

	private static double getAtlagFiz(Alkalmazott[] inputTomb) {
		double sum = 0;

		for (Alkalmazott alk : inputTomb) {
			sum += alk.getFizetes();
		}

		return sum / inputTomb.length;
	}

	private static double getAdoOssz(Alkalmazott[] inputTomb) {
		double sum = 0;

		for (Alkalmazott alk : inputTomb) {
			sum += alk.getAdo();
		}

		return sum;
	}

}