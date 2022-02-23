package masodfoku;

import java.util.Scanner;

public class Masodfoku {

	public static void main(String[] args) {

		System.out.println("Kerem az egyutthatokat: ");
		Scanner sc = new Scanner(System.in);
		String sor = sc.nextLine();
		double x1, x2;
		String[] tomb = sor.split(",");

		int a = Integer.parseInt(tomb[0]);
		int b = Integer.parseInt(tomb[1]);
		int c = Integer.parseInt(tomb[2]);

		double discriminant = getDiscriminant(a, b, c);

		if (discriminant < 0) {
			System.out.println("Nincs valós megoldás!");
		} else {
			x1 = getEredmeny(a,b,discriminant,1);
			x2 = getEredmeny(a,b,discriminant,-1);
	
			System.out.println("A megoldások: " + "x1:" + x1 + " x2:" + x2);
		}

	}

	private static double getDiscriminant(int a, int b, int c) {
		return (b * b) - (4 * a * c);
	}

	private static double getEgyutthato1(int a, int b, double discriminant) {
		return (b * (-1) + Math.sqrt(discriminant)) / (2 * a);
	}

	private static double getEgyutthato2(int a, int b, double discriminant) {
		return (b * (-1) - Math.sqrt(discriminant)) / (2 * a);
	}
	
	
	private static double getEredmeny(int a, int b, double discriminant, int paritas) {
		if(paritas > 0) {
			return (b * (-1) + Math.sqrt(discriminant)) / (2 * a);
		} else {
			return (b * (-1) - Math.sqrt(discriminant)) / (2 * a);

		}
	}

}
