package teglalap;

public class TeglalapFut {

	public static void main(String[] args) {
		Teglalap a = new Teglalap(2, 3);
		Teglalap b = new Teglalap(5, 2);

		System.out.println(a);
		System.out.println(b.toString());

		Teglalap c = a;

		System.out.println(c);

		a.setOldalak(5, 5);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

		a.setOldalak(5, 2);

		System.out.println("a==b:" + (a == b) + " a==c:" + (a == c));

		c.setOldalak(1, 1);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		System.out.println(a.getOldalakEgyeznek(b));
		System.out.println(a.getOldalakEgyeznek(c));


	}

}
