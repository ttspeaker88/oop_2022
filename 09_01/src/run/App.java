package run;

import java.awt.Color;

import myproducts.Pen;
import pont.Szinespont;
import szinezheto.ISzinezheto;
import szinezheto.MyColor;

public class App {

	public static void main(String[] args) {
		ISzinezheto szines = new Szinespont(1, 4, Color.BLUE);

		System.out.println(szines);
		szines.setSzin(Color.BLACK);
		System.out.println(szines);

		ISzinezheto szinesToll = new Pen("Parker", Color.GREEN, 120);

		System.out.println(szinesToll);
		szinesToll.setSzin(Color.BLACK);
		System.out.println(szinesToll);
		setDeafultColor(szinesToll);
		System.out.println(szinesToll);
	}

	
	private static void setDeafultColor(ISzinezheto szinezheto) {
		szinezheto.setSzin(ISzinezheto.alapertelmezettSzin);
	}

}
