package kalkulator;

import java.util.Scanner;

public class Kalkulator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char valasz;

		do {
			System.out.println("Szamologep:");
			String inString = input.nextLine();
			String[] strArray = inString.split(" ");
			double a = Integer.parseInt(strArray[0]);
			char op = strArray[1].charAt(0);
			double b = Integer.parseInt(strArray[2]);
			double eredmeny = 0;
			boolean ok = true;

			switch (op) {
			case '+':
				eredmeny = a + b;
				break;
			case '-':
				eredmeny = a - b;
				break;
			case '*':
				eredmeny = a * b;
				break;
			case '/':
				if (b != 0) {
					eredmeny = a / b;
					break;
				} else {
					System.out.println("0-val nem lehet osztani!");
					ok = false;
					break;
				}
			default:
				System.out.println("Nem ertelmezett muvelet!");
				ok = false;
				break;
			}

			if (ok)
				System.out.println("Az eredmeny: " + eredmeny);

			System.out.println("Szeretne folytatni?");
			valasz = input.next().charAt(0);
			input.nextLine();
		} while (valasz == 'I' || valasz == 'i');

		input.close();
	}
}