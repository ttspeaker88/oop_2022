package egyetem;

public class Kar extends SzervezetiEgyseg {
	private String dekan;
	private int hallgatoLetszam;

	public Kar(KarNev nev, int letszam, int hallgatoLetszam) {
		super(nev.name(), letszam);
		this.hallgatoLetszam = hallgatoLetszam;

		switch (nev) {
		case G�IK:
			this.dekan = "Sim�nfalvi Zolt�n";
			break;
		case MFK:
			this.dekan = "Sz�cs P�ter";
			break;
		case MAK:
			this.dekan = "Palot�s �rp�d";
			break;
		case GTK:
			this.dekan = "Somosi Mariann";
			break;
		case �JK:
			this.dekan = "Cs�k Csilla";
			break;
		}
	}

	public Kar(KarNev nev) {
		this(nev, 70, 500);
	}

	@Override
	public String toString() {
		return "Kar [dekan=" + dekan + ", hallgatoLetszam=" + hallgatoLetszam + "]";
	}

	public String getDekan() {
		return dekan;
	}

	public void setDekan(String dekan) {
		this.dekan = dekan;
	}

	public int getHallgatoLetszam() {
		return hallgatoLetszam;
	}

	public void setHallgatoLetszam(int hallgatoLetszam) {
		this.hallgatoLetszam = hallgatoLetszam;
	}

	@Override
	public double getMunkaMennyiseg() {
		return this.hallgatoLetszam / getLetszam();
	}

}
