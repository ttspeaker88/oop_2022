package alkalmazott.a;

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
		int kor;

		for (int i = 0; i < tomb.length; i++) {
			System.out.println("Kerem az " + (i + 1) + ". alkalmazott nevet:");
			nev = sc.next();
			System.out.println("Kerem az " + (i + 1) + ". alkalmazott korat:");
			kor = sc.nextInt();

			tomb[i] = new Alkalmazott(nev, kor);
		}

		adatokKiir(tomb);
		Alkalmazott.setNyugdijKorHatar(70);
		adatokKiir(tomb);

		System.out.println("Rendezve:");
		rendezeseNyugdijigHatraLevoEvekAlapjan(tomb);
		adatokKiir(tomb);

	}

	private static void adatokKiir(Alkalmazott[] tomb) {
		for (Alkalmazott alkalmazott : tomb) {
			System.out.println(alkalmazott);
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

}