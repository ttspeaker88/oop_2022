package Alkalmazott.c;

public class AlkalmazottFut {

	public static void main(String[] args) {
		Alkalmazott alk = new Alkalmazott();
		Alkalmazott alk2 = new Alkalmazott();

		alk.setFizetes(50);
		alk.setNev("Tomi");
		System.out.println(alk.getAdatok());

		alk.fizNovel(10);
		System.out.println(alk.getAdatok());

		boolean fizHatarok = alk.getFizHatarok(10, 70);
		System.out.println("Az alkalmazott fizetese a hatork koze esik: " + fizHatarok);

		double ado = alk.getAdo();
		System.out.println("Az ado: " + ado);

		alk2.setFizetes(10);
		alk2.setNev("Erika");
		System.out.println(alk2.getAdatok());
		boolean fizNagyobb = alk.getFizNagyobbMasikAlk(alk2);

		if (fizNagyobb)
			System.out.println("Nagyobb a fizetese. " + alk.getAdatok());
		else
			System.out.println("Nem nagyobb a fizetese. " + alk2.getAdatok());

	}
}