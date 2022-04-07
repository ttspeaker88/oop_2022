package myproducts;

import java.awt.Color;

import szinezheto.ISzinezheto;
import szinezheto.MyColor;

public class Pen extends Product implements ISzinezheto {
	private Color szin;
	private String markaNev;

	public Pen(String markaNev, Color szin, int nettoAr) {
		super("Toll", nettoAr, 27);
		this.szin = szin;
		this.markaNev = markaNev;
	}

	@Override
	public String toString() {
		MyColor mycolor = new MyColor(szin); 
		return "Pen [szin=" + mycolor + ", markaNev=" + markaNev + "]";
	}

	@Override
	public Color getSzin() {
		return this.szin;
	}

	@Override
	public void setSzin(Color szin) {
		this.szin = szin;
	}

}