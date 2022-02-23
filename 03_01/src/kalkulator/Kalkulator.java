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
			int op1 = Integer.parseInt(strArray[0]);
			char op = strArray[1].charAt(0);
			int op2 = Integer.parseInt(strArray[2]);
			double eredmeny = 0;
			boolean ok = true;

			switch (op) {
			case '+':
				eredmeny = op1 + op2;
				break;
			case '-':
				eredmeny = op1 - op2;
				break;
			case '*':
				eredmeny = op1 * op2;
				break;
			case '/':
				if (op2 != 0) {
					eredmeny = op1 / op2;
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