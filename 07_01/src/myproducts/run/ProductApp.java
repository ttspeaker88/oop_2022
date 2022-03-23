package myproducts.run;

import myproducts.Bread;
import myproducts.Product;

public class ProductApp {
	public static void main(String[] args) {
		Product product1 = new Product("termek1", 1500, 24);
		System.out.println(product1);
		Bread bread1 = new Bread("kenyer1", 400, 27, 2);
		System.out.println(bread1);
		System.out.println(product1.bruttoArHasonlit(bread1));

		Product product2 = new Bread("termek2", 460, 25, 3);
		System.out.println(product2);

		product2 = bread1;
		System.out.println(product2);

		Bread bread2 = new Bread("kenyer2", 550, 27, 3);
		System.out.println(bread2);

		if (Bread.getEgysegarNagyobb((Bread) product2, bread2)) {
			System.out.println("A nagyobb egysegaru: " + product2);
		} else {
			System.out.println("A nagyobb egysegaru: " + bread2);

		}

	}

}