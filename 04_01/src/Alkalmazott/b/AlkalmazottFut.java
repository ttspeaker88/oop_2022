package Alkalmazott.b;

public class AlkalmazottFut {

	public static void main(String[] args) {
		Alkalmazott alk = new Alkalmazott();

		alk.setFizetes(50);
		alk.setNev("Tomi");
		System.out.println(alk.getAdatok());

		alk.fizNovel(10);
		System.out.println(alk.getAdatok());

	}
}