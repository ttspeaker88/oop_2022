package teglalap;

import java.util.Scanner;

public class TeglalapFut {

	public static void main(String[] args) {
		Teglalap[] tomb = new Teglalap[10];

		feltolt(tomb);
		kiir(tomb);

		System.out.println("A legkisebb teruletu teglalap: " + getLegkisebbTerulet(tomb));

		Teglalap ujTeglalap;
		Scanner sc = new Scanner(System.in);
		System.out.println("Uj teglalap!");
		System.out.println("Kerem az uj teglalap a oldalat:");
		int a = sc.nextInt();
		System.out.println("Kerem az uj teglalap b oldalat:");
		int b = sc.nextInt();
		ujTeglalap = new Teglalap(a, b);
		System.out.println("Az uj teglalap adatai: " + ujTeglalap);
		sc.close();

		int db = 0;
		for (Teglalap teglalap : tomb) {
			if (teglalap.getTeruletNagyobb(ujTeglalap))
				db++;
		}
		System.out.println("A nagyobb teruletu teglalapok szama: " + db);

		int index = -1;
		boolean egyezenek = false;
		// tomb[5].setOldalak(6, 4);
		for (int i = 0; i < tomb.length; i++) {
			if (tomb[i].getOldalakEgyeznek(ujTeglalap)) {
				egyezenek = true;
				index = i;
				break;
			}
		}

		if (egyezenek)
			System.out.println("Van egyezo oldalu teglalap, indexe: " + index);
		else
			System.out.println("Nincs egyezo oldalu teglalap.");
	}

	private static void feltolt(Teglalap[] tomb) {
		for (int i = 0; i < tomb.length; i++) {
			tomb[i] = new Teglalap((int) (Math.random() * 10 + 2), (int) (Math.random() * 10 + 2));
		}
	}

	public static void kiir(Teglalap[] tomb) {
		for (Teglalap element : tomb) {
			System.out.println(element);
		}
	}

	public static Teglalap getLegkisebbTerulet(Teglalap[] tomb) {
		Teglalap min = tomb[0];

		for (Teglalap teglalap : tomb) {
			if (teglalap.getTerulet() < min.getTerulet())
				min = teglalap;
		}

		return min;
	}

}
