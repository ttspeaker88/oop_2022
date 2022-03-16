package alkalmazott.b;

import java.util.Scanner;

public class Fut {

	public static void main(String[] args) {
		Alkalmazott[] tomb;
		int n;

		Scanner sc = new Scanner(System.in);
		System.out.println("Kerem az alkalmazottak szamat:");
		n = sc.nextInt();

		tomb = new Alkalmazott[n];
		String nev;
		String szuletesiDatum;

		for (int i = 0; i < tomb.length; i++) {
			System.out.println("Kerem az " + (i + 1) + ". alkalmazott nevet:");
			nev = sc.next();

			System.out.println("Kerem az " + (i + 1) + ". alkalmazott szuletesi datumat (yyyy.mm.dd):");
			szuletesiDatum = sc.next();

			String[] szuletesiIdoTomb = szuletesiDatum.split("\\.");
			int ev = Integer.parseInt(szuletesiIdoTomb[0]);
			int honap = Integer.parseInt(szuletesiIdoTomb[1]);
			int nap = Integer.parseInt(szuletesiIdoTomb[2]);

			tomb[i] = new Alkalmazott(nev, ev, honap, nap);
		}

		sc.close();

		adatokKiir(tomb);

		System.out.println("Adatok rendezve:");
		rendezeseNyugdijigHatraLevoEvekAlapjan(tomb);
		adatokKiir(tomb);

		System.out.println("5 evnel kevesebb van hatra a nyugdijig:");
		get5EvnelKEvesebbNyudijig(tomb);

		System.out.println("\nAz atlagnal kevesebb van hatra a nyugdijig:");
		getAtlagnalTobbNyudijig(tomb);
	}

	private static void adatokKiir(Alkalmazott[] tomb) {
		for (Alkalmazott alkalmazott : tomb) {
			System.out.println(alkalmazott);
			System.out.println(alkalmazott.szulInfoKiir("szulinap"));
			System.out.println(alkalmazott.szulInfoKiir("kor"));

			System.out.println();
		}
	}

	private static void rendezeseNyugdijigHatraLevoEvekAlapjan(Alkalmazott[] employeeArray) {
		for (int i = 0; i < employeeArray.length; i++) {
			int minIndex = i;
			for (int j = i + 1; j < employeeArray.length; j++) {
				if (employeeArray[j].getEvekSzamaNyugdijig() < employeeArray[minIndex].getEvekSzamaNyugdijig()) {
					minIndex = j;
				}
			}
			// Helycsere, ha szükséges
			if (minIndex != i) {
				Alkalmazott tmp = employeeArray[i];
				employeeArray[i] = employeeArray[minIndex];
				employeeArray[minIndex] = tmp;
			}
		}
	}

	public static void get5EvnelKEvesebbNyudijig(Alkalmazott[] tomb) {
		for (Alkalmazott alkalmazott : tomb) {
			if (alkalmazott.getEvekSzamaNyugdijig() < 5) {
				System.out.println(alkalmazott);
			}
		}
	}

	public static double getAtlag(Alkalmazott[] tomb) {
		double sum = 0;

		for (Alkalmazott alkalmazott : tomb) {
			sum += alkalmazott.getEvekSzamaNyugdijig();
		}

		return (sum / tomb.length);
	}

	public static void getAtlagnalTobbNyudijig(Alkalmazott[] tomb) {
		double atlag = getAtlag(tomb);

		for (Alkalmazott alkalmazott : tomb) {
			if (alkalmazott.getEvekSzamaNyugdijig() > atlag) {
				System.out.println(alkalmazott);
			}
		}

	}

}