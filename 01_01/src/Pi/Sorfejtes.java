package Pi;

public class Sorfejtes {

	public static void main(String[] args) {
		double pi = 0;
		double szamlalo = 1;
		double nevezo = 1;

		for (int i = 0; i < 1000; i++) {
			if (i % 2 == 0) {
				pi = pi + (szamlalo / nevezo);
			} else {
				pi = pi - (szamlalo / nevezo);
			}

			nevezo = nevezo + 2;
		}

		System.out.println("A PI kozelitett ereteke: " + 4 * pi);

	}

}
