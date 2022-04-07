package pont;

import java.awt.Color;

import szinezheto.ISzinezheto;
import szinezheto.MyColor;

public class Szinespont extends Pont implements ISzinezheto {

	private Color szin;

	public Szinespont() {
		super(0, 0);
		this.szin = ISzinezheto.alapertelmezettSzin;
	}

	public Szinespont(Color szin) {
		super(0, 0);
		this.szin = szin;
	}

	public Szinespont(int x, int y, Color szin) {
		super(x, y);
		this.szin = szin;
	}

	@Override
	public Color getSzin() {
		return szin;
	}

	@Override
	public void setSzin(Color szin) {
		this.szin = szin;
	}

	@Override
	public String toString() {
		MyColor mycolor = new MyColor(szin); 
		
		return "Szinespont [szin=" + mycolor + "]";
	}
	
	

}
