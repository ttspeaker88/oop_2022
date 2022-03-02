package Alkalmazott.a;

public class AlkalmazottFut {

	public static void main(String[] args) {
		Alkalmazott alk = new Alkalmazott();

		alk.fizetes = 50;
		alk.nev = "Tomi";
		System.out.println(alk.getAdatok());

		alk.fizNovel(10);
		System.out.println(alk.getAdatok());

	}
}